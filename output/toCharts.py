#!/usr/bin/env -S uv run --script
# /// script
# requires-python = ">=3.11"
# dependencies = [
#   "matplotlib==3.10.9",
#   "numpy==2.4.6",
# ]
# ///

"""Render reproducible benchmark charts from the CSV files made by toCsv.py.

Chart contract:
- Question: how does each library/API's normalized throughput compare across payload sizes?
- Form: grouped horizontal bars, ranked by the 1000 KB result.
- Scope: top 20 plus kotlinx.serialization when it falls outside the top 20; full data stays in CSV/raw results.
- Unit: nominal MiB/s (JMH ops/s * payload KB * 1000 / 1,048,576); zero-based scale.
- Palette: four explicit blue/gold/olive/pink roots, reinforced with hatch patterns.
- Surface: checked-in PNG files embedded by README.md and visually inspected before handoff.
"""

import argparse
import csv
import math
from pathlib import Path

import matplotlib

matplotlib.use("Agg")

import matplotlib.pyplot as plt
import numpy as np
from matplotlib.ticker import FuncFormatter


COLORS = ("#2563EB", "#D97706", "#6B8E23", "#DB2777")
HATCHES = ("", "//", "..", "xx")
COMMAND_LABELS = {
    "ser": "serialization",
    "deser": "deserialization",
}
EXPECTED_COLUMNS = (
    "Test",
    "1kb (x1)",
    "10kb (x10)",
    "100kb (x100)",
    "1000kb (x1000)",
)
EXPECTED_CSV_FILES = {
    f"{datatype}-{command}-1.csv"
    for datatype in ("users", "clients")
    for command in ("ser", "deser")
}
BYTES_PER_NOMINAL_KB = 1000
BYTES_PER_MIB = 1024 * 1024


def read_results(path: Path):
    with path.open(newline="") as csv_file:
        reader = csv.DictReader(csv_file)
        if tuple(reader.fieldnames or ()) != EXPECTED_COLUMNS:
            raise ValueError(
                f"Unexpected CSV columns in '{path}': {reader.fieldnames}; "
                f"expected {list(EXPECTED_COLUMNS)}"
            )
        size_columns = list(EXPECTED_COLUMNS[1:])
        rows = []
        names = set()
        for row in reader:
            name = row["Test"]
            if not name:
                raise ValueError(f"Blank benchmark name in '{path}'")
            if name in names:
                raise ValueError(f"Duplicate benchmark '{name}' in '{path}'")
            names.add(name)
            try:
                values = [
                    float(row[column]) * BYTES_PER_NOMINAL_KB / BYTES_PER_MIB
                    for column in size_columns
                ]
            except (TypeError, ValueError) as error:
                raise ValueError(
                    f"Missing or invalid values for '{name}' in '{path}'"
                ) from error
            if any(not math.isfinite(value) or value <= 0 for value in values):
                raise ValueError(f"Non-positive or non-finite values for '{name}' in '{path}'")
            rows.append({
                "name": name,
                "values": values,
            })
    if not rows:
        raise ValueError(f"No benchmark rows in '{path}'")
    if not any(row["name"] == "kotlinx_serialization/databind" for row in rows):
        raise ValueError(f"Missing kotlinx.serialization row in '{path}'")
    return size_columns, rows


def select_rows(rows, top):
    ranked = sorted(rows, key=lambda row: row["values"][-1], reverse=True)
    selected = ranked[:top]
    focal = next(
        (row for row in ranked if row["name"] == "kotlinx_serialization/databind"),
        None,
    )
    if focal is not None and focal not in selected:
        selected.append(focal)
    return sorted(selected, key=lambda row: row["values"][-1])


def render_chart(csv_path: Path, output_dir: Path, run_date: str, top: int):
    datatype, command, _ = csv_path.stem.split("-")
    size_columns, rows = read_results(csv_path)
    selected = select_rows(rows, top)
    ranked_count = min(top, len(rows))

    labels = [row["name"] for row in selected]
    positions = np.arange(len(selected))
    series_count = len(size_columns)
    bar_height = 0.78 / series_count

    figure_height = max(7.5, len(selected) * 0.43)
    figure, axis = plt.subplots(figsize=(14, figure_height), facecolor="white")
    axis.set_facecolor("white")

    for index, (column, color, hatch) in enumerate(zip(size_columns, COLORS, HATCHES)):
        offset = (index - (series_count - 1) / 2) * bar_height
        values = [row["values"][index] for row in selected]
        axis.barh(
            positions + offset,
            values,
            height=bar_height,
            color=color,
            edgecolor="#FFFFFF",
            linewidth=0.6,
            hatch=hatch,
            label=column.split(" ", 1)[0].upper(),
        )

    axis.set_yticks(positions, labels)
    axis.set_xlim(left=0)
    axis.set_xlabel("Normalized throughput (nominal MiB/s; higher is better)")
    axis.xaxis.set_major_formatter(FuncFormatter(lambda value, _: f"{value:,.0f}"))
    axis.xaxis.grid(True, color="#E5E7EB", linewidth=0.8)
    axis.set_axisbelow(True)
    axis.tick_params(axis="x", colors="#4B5563")
    axis.tick_params(axis="y", colors="#1F2937", labelsize=9)
    axis.spines["top"].set_visible(False)
    axis.spines["right"].set_visible(False)
    axis.spines["left"].set_color("#9CA3AF")
    axis.spines["bottom"].set_color("#9CA3AF")

    title = f"{datatype.title()} {COMMAND_LABELS[command]} throughput"
    axis.set_title(title, loc="left", fontsize=18, color="#1F2937", pad=34)
    axis.text(
        0,
        1.015,
        f"Top {ranked_count} by the 1000 KB result; kotlinx.serialization is always retained · {run_date}",
        transform=axis.transAxes,
        fontsize=10,
        color="#6B7280",
        va="bottom",
    )
    axis.legend(
        title="Payload",
        ncol=series_count,
        frameon=False,
        loc="lower right",
        bbox_to_anchor=(1, 1.005),
    )
    figure.text(
        0.995,
        0.006,
        "Normalized value = JMH ops/s × nominal payload KB × 1000 ÷ 1,048,576. Full statistics are linked in the README.",
        ha="right",
        fontsize=8,
        color="#6B7280",
    )
    figure.tight_layout(rect=(0, 0.025, 1, 1))

    output_dir.mkdir(parents=True, exist_ok=True)
    output_path = output_dir / f"{run_date}-{datatype}-{command}.png"
    figure.savefig(output_path, dpi=160, bbox_inches="tight", facecolor="white")
    plt.close(figure)
    print(output_path)


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--input-dir", type=Path, required=True)
    parser.add_argument("--output-dir", type=Path, required=True)
    parser.add_argument("--date", required=True)
    parser.add_argument("--top", type=int, default=20)
    args = parser.parse_args()
    if args.top < 1:
        parser.error("--top must be at least 1")

    csv_paths = sorted(args.input_dir.glob("*.csv"))
    actual_files = {path.name for path in csv_paths}
    if actual_files != EXPECTED_CSV_FILES:
        missing = sorted(EXPECTED_CSV_FILES - actual_files)
        unexpected = sorted(actual_files - EXPECTED_CSV_FILES)
        details = []
        if missing:
            details.append(f"missing: {', '.join(missing)}")
        if unexpected:
            details.append(f"unexpected: {', '.join(unexpected)}")
        parser.error("invalid CSV set (" + "; ".join(details) + ")")
    for csv_path in csv_paths:
        render_chart(csv_path, args.output_dir, args.date, args.top)


if __name__ == "__main__":
    main()

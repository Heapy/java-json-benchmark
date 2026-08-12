#!/usr/bin/env -S uv run --script
# /// script
# requires-python = ">=3.11"
# dependencies = []
# ///

"""Convert completed JMH text outputs to normalized-throughput CSV files."""

import argparse
import csv
import math
import re
import sys
from pathlib import Path


FILE_PATTERN = re.compile(
    r"^(?P<datatype>users|clients)-(?P<command>ser|deser)-"
    r"(?P<number>\d+)-(?P<size>\d+)\.txt$"
)
RESULT_NAME = re.compile(
    r"^(?:(?:com\.github\.fabienrenaud\.jjb|c\.g\.f\.j)\.)?"
    r"(?:(?P<api>databind|stream)\.)?"
    r"(?P<operation>Serialization|Deserialization)\."
    r"(?P<method>[A-Za-z0-9_]+)$"
)
COMPLETION_MARKER = "# Run complete. Total time:"
SEED_PATTERN = re.compile(r"Using SEED=(?P<seed>\d+) as seed for Random")
EXPECTED_FILES = {
    f"{datatype}-{command}-1-{size}.txt"
    for datatype in ("users", "clients")
    for command in ("ser", "deser")
    for size in ("1", "10", "100", "1000")
}
EXPECTED_SIZES = {"1", "10", "100", "1000"}
USERS_DATABIND = {
    "avajejsonb",
    "avajejsonb_jackson",
    "boon",
    "djomo",
    "dsljson",
    "dsljson_reflection",
    "fastjson",
    "fastjson_features",
    "flexjson",
    "foryjson",
    "genson",
    "gson",
    "jackson",
    "jackson_afterburner",
    "jackson_blackbird",
    "jodd",
    "johnzon",
    "jsonio",
    "jsonsmart",
    "kotlinx_serialization",
    "logansquare",
    "moshi",
    "qson",
    "quickbuf_json",
    "wast",
    "yasson",
}
USERS_STREAM = {
    "antons",
    "genson",
    "gson",
    "jackson",
    "jakartajson",
    "jsonio",
    "jsonsimple",
    "minimaljson",
    "mjson",
    "moshi",
    "nanojson",
    "orgjson",
    "purejson",
    "tapestry",
    "underscore_java",
}
CLIENTS_DATABIND = {
    "avajejsonb",
    "avajejsonb_jackson",
    "djomo",
    "dsljson",
    "dsljson_reflection",
    "fastjson",
    "fastjson_features",
    "flexjson",
    "foryjson",
    "genson",
    "gson",
    "jackson",
    "jackson_afterburner",
    "jackson_blackbird",
    "jodd",
    "jsonio",
    "kotlinx_serialization",
    "logansquare",
    "moshi",
    "wast",
}
EXPECTED_BENCHMARKS = {
    "users": {
        *(f"{method}/databind" for method in USERS_DATABIND),
        *(f"{method}/stream" for method in USERS_STREAM),
    },
    "clients": {
        *(f"{method}/databind" for method in CLIENTS_DATABIND),
    },
}


def parse_file_info(path: Path):
    match = FILE_PATTERN.fullmatch(path.name)
    if match is None:
        raise ValueError(f"Unexpected benchmark filename: '{path.name}'")
    return match.groupdict()


def normalize_result_name(raw_name, expected_operation, default_api=None):
    match = RESULT_NAME.fullmatch(raw_name)
    if match is None:
        raise ValueError(f"Unrecognized JMH benchmark name '{raw_name}'")
    operation = match.group("operation")
    if operation != expected_operation:
        raise ValueError(
            f"Unexpected {operation} result; expected {expected_operation}"
        )
    api = match.group("api") or default_api
    method = match.group("method")
    return f"{method}/{api}" if api in ("databind", "stream") else method


def extract_scores(path: Path, expected_operation: str, default_api=None):
    result = {}
    lines = path.read_text().splitlines()
    completion_indexes = [
        index for index, line in enumerate(lines)
        if line.startswith(COMPLETION_MARKER)
    ]
    if len(completion_indexes) != 1:
        raise ValueError(
            f"Expected one completed JMH run in '{path}', "
            f"found {len(completion_indexes)}"
        )

    failures = set()
    seeds = {
        match.group("seed")
        for line in lines
        if (match := SEED_PATTERN.search(line)) is not None
    }
    current_benchmark = None
    for line in lines:
        if line.startswith("# Benchmark: "):
            current_benchmark = line.removeprefix("# Benchmark: ").strip()
        if "<failure>" in line:
            if current_benchmark is None:
                raise ValueError(f"Unattributed JMH failure in '{path}'")
            try:
                failures.add(normalize_result_name(
                    current_benchmark,
                    expected_operation,
                    default_api,
                ))
            except ValueError as error:
                raise ValueError(f"{error} in '{path}'") from error

    benchmark = False
    for line in lines[completion_indexes[0] + 1:]:
        if not benchmark:
            benchmark = line.startswith("Benchmark ")
            continue

        values = line.split()
        if len(values) < 4:
            continue

        if RESULT_NAME.fullmatch(values[0]) is None:
            continue
        try:
            name = normalize_result_name(
                values[0],
                expected_operation,
                default_api,
            )
        except ValueError as error:
            raise ValueError(f"{error} in '{path}'") from error
        if name in result:
            raise ValueError(f"Duplicate benchmark '{name}' in '{path}'")
        if values[1] != "thrpt" or values[-1] != "ops/s":
            raise ValueError(f"Unexpected JMH result shape in '{path}': '{line}'")
        score_index = 3 if values[2].isdigit() else 2
        try:
            score = float(values[score_index])
        except ValueError as error:
            raise ValueError(
                f"Invalid score '{values[score_index]}' for '{values[0]}' "
                f"in '{path}'"
            ) from error
        if not math.isfinite(score) or score <= 0:
            raise ValueError(f"Invalid score '{score}' for '{name}' in '{path}'")
        result[name] = score

    if not benchmark:
        raise ValueError(f"Missing JMH result table in '{path}'")
    if not result and not failures:
        raise ValueError(f"Empty JMH result table in '{path}'")
    return result, failures, seeds


def failure_is_allowed(failure, allowed_failures):
    return failure in allowed_failures or failure.split("/", 1)[0] in allowed_failures


def validate_complete_run(
    paths,
    sheets,
    observations,
    failures,
    seeds,
    allowed_failures,
    expected_seed,
):
    actual_files = {path.name for path in paths}
    missing = sorted(EXPECTED_FILES - actual_files)
    unexpected = sorted(actual_files - EXPECTED_FILES)
    if missing or unexpected:
        details = []
        if missing:
            details.append(f"missing: {', '.join(missing)}")
        if unexpected:
            details.append(f"unexpected: {', '.join(unexpected)}")
        raise ValueError("Incomplete run file set (" + "; ".join(details) + ")")

    expected_sheets = {
        f"{datatype}-{command}-1"
        for datatype in ("users", "clients")
        for command in ("ser", "deser")
    }
    if set(sheets) != expected_sheets:
        raise ValueError(
            f"Expected sheets {sorted(expected_sheets)}, found {sorted(sheets)}"
        )

    for path, path_seeds in seeds.items():
        if path_seeds != {expected_seed}:
            raise ValueError(
                f"Expected only seed {expected_seed} in '{path}', "
                f"found {sorted(path_seeds)}"
            )

    matched_allowances = set()
    for path, path_failures in failures.items():
        unexpected_failures = sorted(
            failure for failure in path_failures
            if not failure_is_allowed(failure, allowed_failures)
        )
        if unexpected_failures:
            raise ValueError(
                f"Unexpected JMH failures in '{path}': "
                f"{', '.join(unexpected_failures)}"
            )
        for allowance in allowed_failures:
            if any(failure_is_allowed(failure, {allowance}) for failure in path_failures):
                matched_allowances.add(allowance)

    unused_allowances = sorted(allowed_failures - matched_allowances)
    if unused_allowances:
        raise ValueError(
            "Allowed failures were not observed: " + ", ".join(unused_allowances)
        )

    for path, observed in observations.items():
        datatype = parse_file_info(path)["datatype"]
        expected = EXPECTED_BENCHMARKS[datatype]
        missing_benchmarks = sorted(expected - observed)
        unexpected_benchmarks = sorted(observed - expected)
        if missing_benchmarks or unexpected_benchmarks:
            details = []
            if missing_benchmarks:
                details.append(f"missing {missing_benchmarks}")
            if unexpected_benchmarks:
                details.append(f"unexpected {unexpected_benchmarks}")
            raise ValueError(
                f"Benchmark set mismatch in '{path}': " + "; ".join(details)
            )

    focal = "kotlinx_serialization/databind"
    for sheet_name, libraries in sheets.items():
        focal_scores = libraries.get(focal)
        if focal_scores is None:
            raise ValueError(f"Missing '{focal}' from '{sheet_name}'")
        if set(focal_scores) != EXPECTED_SIZES:
            raise ValueError(
                f"Incomplete '{focal}' sizes in '{sheet_name}': "
                f"{sorted(focal_scores, key=int)}"
            )
        partial = {
            library: sorted(EXPECTED_SIZES - set(scores), key=int)
            for library, scores in libraries.items()
            if set(scores) != EXPECTED_SIZES
        }
        if partial:
            detail = ", ".join(
                f"{library} missing {sizes}"
                for library, sizes in sorted(partial.items())
            )
            raise ValueError(f"Partial benchmark series in '{sheet_name}': {detail}")


def write_csvs(sheets, output_dir: Path):
    output_dir.mkdir(parents=True, exist_ok=True)
    written = []
    for filename, libraries in sorted(sheets.items()):
        sizes = sorted(
            {size for scores in libraries.values() for size in scores},
            key=int,
        )
        fieldnames = ["Test"] + [f"{size}kb (x{size})" for size in sizes]
        rows = []
        for library, scores in sorted(libraries.items()):
            row = {"Test": library}
            for size, score in sorted(scores.items(), key=lambda item: int(item[0])):
                row[f"{size}kb (x{size})"] = score * int(size)
            rows.append(row)

        output_path = output_dir / f"{filename}.csv"
        with output_path.open("w", newline="") as csv_file:
            writer = csv.DictWriter(
                csv_file,
                fieldnames=fieldnames,
                lineterminator="\n",
            )
            writer.writeheader()
            writer.writerows(rows)
        written.append(output_path)
    return written


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument(
        "--input-dir",
        type=Path,
        default=Path.cwd(),
        help="directory containing run-everything JMH text files (default: cwd)",
    )
    parser.add_argument(
        "--output-dir",
        type=Path,
        help="CSV destination (default: <input-dir>/csv)",
    )
    parser.add_argument(
        "--strict",
        action="store_true",
        help="require the complete 16-file run and all four kotlinx result series",
    )
    parser.add_argument(
        "--allow-failure",
        action="append",
        default=[],
        metavar="BENCHMARK",
        help=(
            "allow an expected JMH failure by method or method/API name; "
            "repeat for multiple failures"
        ),
    )
    parser.add_argument(
        "--expected-seed",
        help="seed required in every JMH output when --strict is used",
    )
    args = parser.parse_args()
    if args.strict and args.expected_seed is None:
        parser.error("--strict requires --expected-seed")

    input_dir = args.input_dir.resolve()
    output_dir = (
        args.output_dir.resolve()
        if args.output_dir is not None
        else input_dir / "csv"
    )
    all_txt_paths = sorted(input_dir.glob("*.txt"))
    paths = [
        path for path in all_txt_paths
        if FILE_PATTERN.fullmatch(path.name)
    ]
    if not paths:
        parser.error(f"no benchmark text files found in {input_dir}")

    sheets = {}
    observations = {}
    failures = {}
    seeds = {}
    for path in paths:
        file_info = parse_file_info(path)
        default_api = "databind" if file_info["datatype"] == "clients" else None
        expected_operation = (
            "Serialization"
            if file_info["command"] == "ser"
            else "Deserialization"
        )
        scores, path_failures, path_seeds = extract_scores(
            path,
            expected_operation,
            default_api,
        )
        observations[path] = set(scores) | path_failures
        failures[path] = path_failures
        seeds[path] = path_seeds
        sheet_name = (
            f"{file_info['datatype']}-{file_info['command']}-{file_info['number']}"
        )
        sheet = sheets.setdefault(sheet_name, {})
        size = file_info["size"]
        for library, score in scores.items():
            sheet.setdefault(library, {})[size] = score

    if args.strict:
        validate_complete_run(
            all_txt_paths,
            sheets,
            observations,
            failures,
            seeds,
            set(args.allow_failure),
            args.expected_seed,
        )
    else:
        for path, path_failures in failures.items():
            if path_failures:
                print(
                    f"warning: JMH failures in '{path}': "
                    f"{', '.join(sorted(path_failures))}",
                    file=sys.stderr,
                )
    for output_path in write_csvs(sheets, output_dir):
        print(output_path)


if __name__ == "__main__":
    main()

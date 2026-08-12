#!/usr/bin/env python3
"""Validate a completed cold-JVM benchmark result directory.

Run from the repository root with:

    uv run tools/validate_cold_results.py PATH [--classpath-dir PATH]

The validator intentionally uses only the Python standard library.  It treats
``samples.jsonl`` as the source of truth, independently rebuilds both CSV
outputs, and checks that the launch plan is the exact blocked shuffle produced
by ``java.util.Random`` for the recorded seed.
"""

from __future__ import annotations

import argparse
import csv
import hashlib
import json
import math
import re
import sys
from collections import defaultdict
from dataclasses import dataclass
from pathlib import Path
from typing import Any, Iterable, Mapping, Sequence


EXPECTED_FILES = ("metadata.json", "samples.jsonl", "samples.csv", "summary.csv")
EXPECTED_LIBRARIES = {"kotlinx", "jackson", "gson", "fory"}
EXPECTED_OPERATIONS = {"serialize", "deserialize"}
EXPECTED_COUNTS = {1, 10, 100}
JVM_IDENTITY_FIELDS = ("jvmVersion", "javaVendor", "javaVmName", "javaHome")
TIMING_FIELDS = (
    "mainEntryToFixtureStart",
    "fixturePreparation",
    "libraryInitialization",
    "firstOperation",
    "remainingOperations",
    "operationsTotal",
    "initializationPlusOperations",
)
ALLOCATION_FIELDS = (
    "fixturePreparation",
    "libraryInitialization",
    "firstOperation",
    "remainingOperations",
)
CLASS_DELTA_FIELDS = ALLOCATION_FIELDS
HEAP_FIELDS = (
    "beforeFixture",
    "afterFixture",
    "afterInitialization",
    "afterFirstOperation",
    "afterAllOperations",
)
LOADED_CLASS_FIELDS = ("fixture", "initialization", "firstOperation", "allOperations")
SUMMARY_METRICS = (
    "external.processWallNs",
    "timingNs.libraryInitialization",
    "timingNs.firstOperation",
    "timingNs.remainingOperations",
    "timingNs.operationsTotal",
    "timingNs.initializationPlusOperations",
    "derivedNs.amortizedInitializationPlusOperationsPerOp",
    "derivedNs.remainingPerOperation",
    "threadAllocatedBytes.libraryInitialization",
    "threadAllocatedBytes.firstOperation",
    "threadAllocatedBytes.remainingOperations",
    "loadedClassDelta.libraryInitialization",
    "loadedClassDelta.firstOperation",
    "loadedClassDelta.remainingOperations",
)
SHA256 = re.compile(r"[0-9a-f]{64}\Z")


class ValidationError(Exception):
    """A result artifact is incomplete or internally inconsistent."""


@dataclass(frozen=True)
class ValidationReport:
    output_directory: Path
    samples: int
    cells: int
    samples_per_cell: int
    fixture_bytes: int
    fixture_hash: int
    jvm_version: str


def _fail(message: str) -> None:
    raise ValidationError(message)


def _without_duplicate_keys(pairs: list[tuple[str, Any]]) -> dict[str, Any]:
    result: dict[str, Any] = {}
    for key, value in pairs:
        if key in result:
            _fail(f"duplicate JSON object key: {key!r}")
        result[key] = value
    return result


def _reject_json_constant(value: str) -> None:
    _fail(f"non-finite JSON number: {value}")


def _load_json(text: str, source: str) -> dict[str, Any]:
    try:
        value = json.loads(
            text,
            object_pairs_hook=_without_duplicate_keys,
            parse_constant=_reject_json_constant,
        )
    except (json.JSONDecodeError, UnicodeError) as error:
        _fail(f"invalid JSON in {source}: {error}")
    if not isinstance(value, dict):
        _fail(f"{source} must contain a JSON object")
    return value


def _read_metadata(path: Path) -> dict[str, Any]:
    try:
        return _load_json(path.read_text(encoding="utf-8"), path.name)
    except OSError as error:
        _fail(f"cannot read {path}: {error}")


def _read_jsonl(path: Path) -> list[dict[str, Any]]:
    try:
        lines = path.read_text(encoding="utf-8").splitlines()
    except OSError as error:
        _fail(f"cannot read {path}: {error}")
    if not lines:
        _fail(f"{path.name} is empty")
    records: list[dict[str, Any]] = []
    for line_number, line in enumerate(lines, 1):
        if not line.strip():
            _fail(f"blank line in {path.name} at line {line_number}")
        records.append(_load_json(line, f"{path.name}:{line_number}"))
    return records


def _object(parent: Mapping[str, Any], key: str, path: str) -> dict[str, Any]:
    value = parent.get(key)
    if not isinstance(value, dict):
        _fail(f"{path}.{key} must be an object")
    return value


def _list(parent: Mapping[str, Any], key: str, path: str) -> list[Any]:
    value = parent.get(key)
    if not isinstance(value, list):
        _fail(f"{path}.{key} must be an array")
    return value


def _integer(value: Any, path: str, *, minimum: int | None = None) -> int:
    if isinstance(value, bool) or not isinstance(value, int):
        _fail(f"{path} must be an integer, got {value!r}")
    if minimum is not None and value < minimum:
        _fail(f"{path} must be >= {minimum}, got {value}")
    return value


def _number(value: Any, path: str, *, minimum: float | None = None) -> float:
    if isinstance(value, bool) or not isinstance(value, (int, float)):
        _fail(f"{path} must be a number, got {value!r}")
    result = float(value)
    if not math.isfinite(result):
        _fail(f"{path} must be finite, got {value!r}")
    if minimum is not None and result < minimum:
        _fail(f"{path} must be >= {minimum}, got {value!r}")
    return result


def _string(value: Any, path: str) -> str:
    if not isinstance(value, str) or not value:
        _fail(f"{path} must be a non-empty string, got {value!r}")
    return value


def _exact_set(values: Sequence[Any], expected: set[Any], path: str) -> None:
    if len(values) != len(set(values)):
        _fail(f"{path} contains duplicates: {values!r}")
    if set(values) != expected:
        _fail(f"{path} must contain exactly {sorted(expected)!r}, got {values!r}")


class _JavaRandom:
    """The java.util.Random operations used by Collections.shuffle."""

    _MULTIPLIER = 0x5DEECE66D
    _ADDEND = 0xB
    _MASK = (1 << 48) - 1

    def __init__(self, seed: int) -> None:
        self._seed = (seed ^ self._MULTIPLIER) & self._MASK

    def _next(self, bits: int) -> int:
        self._seed = (self._seed * self._MULTIPLIER + self._ADDEND) & self._MASK
        return self._seed >> (48 - bits)

    def next_int(self, bound: int) -> int:
        if bound <= 0:
            raise ValueError("bound must be positive")
        if bound & (bound - 1) == 0:
            return (bound * self._next(31)) >> 31
        while True:
            bits = self._next(31)
            value = bits % bound
            # This is Java's signed-int overflow test written without overflow.
            if bits - value + (bound - 1) < (1 << 31):
                return value


def _shuffle_like_java(values: list[Any], random: _JavaRandom) -> None:
    for size in range(len(values), 1, -1):
        other = random.next_int(size)
        values[size - 1], values[other] = values[other], values[size - 1]


def _expected_plan_cells(metadata: Mapping[str, Any]) -> list[tuple[str, str, int]]:
    libraries = _list(metadata, "libraries", "metadata")
    operations = _list(metadata, "operations", "metadata")
    counts = _list(metadata, "counts", "metadata")
    base = [
        (library, operation, count)
        for library in libraries
        for operation in operations
        for count in counts
    ]
    random = _JavaRandom(_integer(metadata.get("randomizationSeed"), "metadata.randomizationSeed"))
    expected: list[tuple[str, str, int]] = []
    samples_per_cell = _integer(
        metadata.get("samplesPerCell"), "metadata.samplesPerCell", minimum=1
    )
    for _ in range(samples_per_cell):
        block = list(base)
        _shuffle_like_java(block, random)
        expected.extend(block)
    return expected


def _validate_metadata(metadata: Mapping[str, Any]) -> tuple[int, int]:
    if _integer(metadata.get("schemaVersion"), "metadata.schemaVersion") != 1:
        _fail("metadata.schemaVersion must be 1")
    if metadata.get("freshJvmPerSample") is not True:
        _fail("metadata.freshJvmPerSample must be true")

    libraries = _list(metadata, "libraries", "metadata")
    operations = _list(metadata, "operations", "metadata")
    counts = _list(metadata, "counts", "metadata")
    for index, library in enumerate(libraries):
        _string(library, f"metadata.libraries[{index}]")
    for index, operation in enumerate(operations):
        _string(operation, f"metadata.operations[{index}]")
    for index, count in enumerate(counts):
        _integer(count, f"metadata.counts[{index}]", minimum=1)
    _exact_set(libraries, EXPECTED_LIBRARIES, "metadata.libraries")
    _exact_set(operations, EXPECTED_OPERATIONS, "metadata.operations")
    _exact_set(counts, EXPECTED_COUNTS, "metadata.counts")

    cells = len(libraries) * len(operations) * len(counts)
    if cells != 24:
        _fail(f"expected exactly 24 benchmark cells, got {cells}")
    samples_per_cell = _integer(
        metadata.get("samplesPerCell"), "metadata.samplesPerCell", minimum=1
    )
    total = _integer(metadata.get("totalSamples"), "metadata.totalSamples", minimum=1)
    expected_total = cells * samples_per_cell
    if total != expected_total:
        _fail(f"metadata.totalSamples is {total}; expected {cells} * {samples_per_cell} = {expected_total}")
    _integer(metadata.get("randomizationSeed"), "metadata.randomizationSeed")
    return cells, samples_per_cell


def _validate_sample_metrics(record: Mapping[str, Any], line_number: int) -> None:
    root = f"samples.jsonl:{line_number}"
    count = _integer(record.get("operationCount"), f"{root}.operationCount", minimum=1)

    timing = _object(record, "timingNs", root)
    for field in TIMING_FIELDS:
        _integer(timing.get(field), f"{root}.timingNs.{field}", minimum=0)
    if timing["remainingOperations"] != 0 and count == 1:
        _fail(f"{root}.timingNs.remainingOperations must be 0 for operationCount=1")
    operations_total = timing["firstOperation"] + timing["remainingOperations"]
    if timing["operationsTotal"] != operations_total:
        _fail(f"{root}.timingNs.operationsTotal does not equal firstOperation + remainingOperations")
    initialization_total = timing["libraryInitialization"] + operations_total
    if timing["initializationPlusOperations"] != initialization_total:
        _fail(
            f"{root}.timingNs.initializationPlusOperations does not equal "
            "libraryInitialization + operationsTotal"
        )

    external = _object(record, "external", root)
    _integer(external.get("processWallNs"), f"{root}.external.processWallNs", minimum=1)

    derived = _object(record, "derivedNs", root)
    amortized = _number(
        derived.get("amortizedInitializationPlusOperationsPerOp"),
        f"{root}.derivedNs.amortizedInitializationPlusOperationsPerOp",
        minimum=0,
    )
    expected_amortized = initialization_total / count
    if amortized != expected_amortized:
        _fail(
            f"{root}.derivedNs.amortizedInitializationPlusOperationsPerOp is {amortized}; "
            f"expected {expected_amortized}"
        )
    remaining_per_operation = derived.get("remainingPerOperation")
    if count == 1:
        if remaining_per_operation is not None:
            _fail(f"{root}.derivedNs.remainingPerOperation must be null for operationCount=1")
    else:
        actual_remaining = _number(
            remaining_per_operation,
            f"{root}.derivedNs.remainingPerOperation",
            minimum=0,
        )
        expected_remaining = timing["remainingOperations"] / (count - 1)
        if actual_remaining != expected_remaining:
            _fail(
                f"{root}.derivedNs.remainingPerOperation is {actual_remaining}; "
                f"expected {expected_remaining}"
            )

    allocated = _object(record, "threadAllocatedBytes", root)
    supported = allocated.get("supported")
    if not isinstance(supported, bool):
        _fail(f"{root}.threadAllocatedBytes.supported must be a boolean")
    for field in ALLOCATION_FIELDS:
        value = allocated.get(field)
        must_be_null = not supported or (field == "remainingOperations" and count == 1)
        if must_be_null:
            if value is not None:
                _fail(f"{root}.threadAllocatedBytes.{field} must be null")
        else:
            _integer(value, f"{root}.threadAllocatedBytes.{field}", minimum=0)

    class_delta = _object(record, "loadedClassDelta", root)
    for field in CLASS_DELTA_FIELDS:
        value = class_delta.get(field)
        if field == "remainingOperations" and count == 1:
            if value is not None:
                _fail(f"{root}.loadedClassDelta.{field} must be null for operationCount=1")
        else:
            _integer(value, f"{root}.loadedClassDelta.{field}", minimum=0)

    heap = _object(record, "heapUsedBytes", root)
    for field in HEAP_FIELDS:
        _integer(heap.get(field), f"{root}.heapUsedBytes.{field}", minimum=0)
    loaded = _object(record, "loadedClassesAfter", root)
    for field in LOADED_CLASS_FIELDS:
        _integer(loaded.get(field), f"{root}.loadedClassesAfter.{field}", minimum=0)


def _validate_samples(
    metadata: Mapping[str, Any], records: Sequence[Mapping[str, Any]], cells: int, samples_per_cell: int
) -> tuple[int, int, str]:
    expected_total = cells * samples_per_cell
    if len(records) != expected_total:
        _fail(f"samples.jsonl has {len(records)} records; expected {expected_total}")

    seed = _integer(metadata.get("randomizationSeed"), "metadata.randomizationSeed")
    expected_plan = _expected_plan_cells(metadata)
    pids: set[int] = set()
    plan_indexes: set[int] = set()
    cell_counts: defaultdict[tuple[str, str, int], int] = defaultdict(int)
    fixture_values: set[tuple[int, int]] = set()
    identities: set[tuple[str, ...]] = set()
    allocation_support: set[bool] = set()

    for index, record in enumerate(records):
        root = f"samples.jsonl:{index + 1}"
        if _integer(record.get("schemaVersion"), f"{root}.schemaVersion") != 1:
            _fail(f"{root}.schemaVersion must be 1")
        library = _string(record.get("library"), f"{root}.library")
        operation = _string(record.get("operation"), f"{root}.operation")
        count = _integer(record.get("operationCount"), f"{root}.operationCount", minimum=1)
        cell = (library, operation, count)
        expected_cell = expected_plan[index]
        if cell != expected_cell:
            repetition = index // cells
            offset = index % cells
            _fail(
                f"blocked plan mismatch at repetition {repetition}, offset {offset}: "
                f"expected {expected_cell}, got {cell}"
            )
        cell_counts[cell] += 1

        sample = _object(record, "sample", root)
        plan_index = _integer(sample.get("planIndex"), f"{root}.sample.planIndex", minimum=0)
        if plan_index != index:
            _fail(f"{root}.sample.planIndex is {plan_index}; expected JSONL index {index}")
        if plan_index in plan_indexes:
            _fail(f"duplicate sample.planIndex: {plan_index}")
        plan_indexes.add(plan_index)
        repetition = _integer(sample.get("repetition"), f"{root}.sample.repetition", minimum=0)
        expected_repetition = index // cells
        if repetition != expected_repetition:
            _fail(
                f"blocked repetition mismatch at planIndex {index}: "
                f"expected {expected_repetition}, got {repetition}"
            )
        sample_seed = _integer(sample.get("randomizationSeed"), f"{root}.sample.randomizationSeed")
        if sample_seed != seed:
            _fail(f"{root}.sample.randomizationSeed is {sample_seed}; expected {seed}")

        pid = _integer(record.get("pid"), f"{root}.pid", minimum=1)
        if pid in pids:
            _fail(f"pid {pid} appears in more than one sample; JVMs were not fresh")
        pids.add(pid)

        fixture_bytes = _integer(record.get("fixtureBytes"), f"{root}.fixtureBytes", minimum=1)
        fixture_hash = _integer(record.get("fixtureHash"), f"{root}.fixtureHash")
        if not -(1 << 31) <= fixture_hash < (1 << 31):
            _fail(f"{root}.fixtureHash is outside the signed Java int range")
        fixture_values.add((fixture_bytes, fixture_hash))

        identity = tuple(_string(record.get(field), f"{root}.{field}") for field in JVM_IDENTITY_FIELDS)
        identities.add(identity)
        allocation_support.add(_object(record, "threadAllocatedBytes", root).get("supported"))
        _integer(record.get("checksum"), f"{root}.checksum")
        _validate_sample_metrics(record, index + 1)

    expected_cells = set(expected_plan[:cells])
    if set(cell_counts) != expected_cells:
        _fail("sample cell set differs from metadata cell matrix")
    for cell in sorted(expected_cells):
        if cell_counts[cell] != samples_per_cell:
            _fail(f"cell {cell} has {cell_counts[cell]} samples; expected {samples_per_cell}")
    if len(plan_indexes) != expected_total:
        _fail("sample.planIndex values are not unique and complete")
    if len(fixture_values) != 1:
        _fail(f"fixtureBytes/fixtureHash changed between samples: {sorted(fixture_values)!r}")
    if len(identities) != 1:
        _fail(f"child JVM identity changed between samples: {sorted(identities)!r}")
    if len(allocation_support) != 1:
        _fail("thread allocation support changed between samples")

    identity = next(iter(identities))
    metadata_identity = _object(metadata, "childJvmIdentity", "metadata")
    expected_identity = {field: value for field, value in zip(JVM_IDENTITY_FIELDS, identity)}
    if metadata_identity != expected_identity:
        _fail(
            f"metadata.childJvmIdentity is {metadata_identity!r}; "
            f"samples report {expected_identity!r}"
        )
    fixture_bytes, fixture_hash = next(iter(fixture_values))
    if "fixtureBytes" in metadata and metadata["fixtureBytes"] != fixture_bytes:
        _fail("metadata.fixtureBytes differs from samples")
    if "fixtureHash" in metadata and metadata["fixtureHash"] != fixture_hash:
        _fail("metadata.fixtureHash differs from samples")
    return fixture_bytes, fixture_hash, identity[0]


def _validate_classpaths(metadata: Mapping[str, Any], classpath_directory: Path | None) -> None:
    libraries = _list(metadata, "libraries", "metadata")
    file_names = _object(metadata, "childClasspathFiles", "metadata")
    artifacts = _object(metadata, "childClasspathArtifacts", "metadata")
    if set(file_names) != set(libraries):
        _fail("metadata.childClasspathFiles keys differ from metadata.libraries")
    if set(artifacts) != set(libraries):
        _fail("metadata.childClasspathArtifacts keys differ from metadata.libraries")

    hashes_by_file: dict[str, str] = {}
    for library in libraries:
        names = file_names.get(library)
        values = artifacts.get(library)
        if not isinstance(names, list) or not names:
            _fail(f"metadata.childClasspathFiles.{library} must be a non-empty array")
        if not isinstance(values, list) or not values:
            _fail(f"metadata.childClasspathArtifacts.{library} must be a non-empty array")
        artifact_names: list[str] = []
        for index, value in enumerate(values):
            path = f"metadata.childClasspathArtifacts.{library}[{index}]"
            if not isinstance(value, dict):
                _fail(f"{path} must be an object")
            if set(value) != {"file", "sha256"}:
                _fail(f"{path} must contain exactly file and sha256")
            name = _string(value.get("file"), f"{path}.file")
            if name in {".", ".."} or "/" in name or "\\" in name:
                _fail(f"{path}.file must be a basename, got {name!r}")
            digest = _string(value.get("sha256"), f"{path}.sha256")
            if SHA256.fullmatch(digest) is None:
                _fail(f"{path}.sha256 must be 64 lowercase hexadecimal characters")
            artifact_names.append(name)
            old_digest = hashes_by_file.setdefault(name, digest)
            if old_digest != digest:
                _fail(f"classpath artifact {name!r} has conflicting SHA-256 values")
        if names != artifact_names:
            _fail(
                f"metadata child classpath filenames disagree for {library}: "
                f"{names!r} != {artifact_names!r}"
            )

    if classpath_directory is None:
        return
    if not classpath_directory.is_dir():
        _fail(f"--classpath-dir is not a directory: {classpath_directory}")

    catalog_path = classpath_directory / "cold-classpaths.properties"
    if not catalog_path.is_file():
        _fail(f"classpath catalog is missing: {catalog_path}")
    try:
        catalog_lines = catalog_path.read_text(encoding="iso-8859-1").splitlines()
    except OSError as error:
        _fail(f"cannot read {catalog_path}: {error}")
    catalog: dict[str, list[str]] = {}
    for line_number, line in enumerate(catalog_lines, 1):
        stripped = line.strip()
        if not stripped or stripped.startswith(("#", "!")):
            continue
        if "=" not in line:
            _fail(f"{catalog_path}:{line_number} must contain '='")
        library, encoded = line.split("=", 1)
        library = library.strip()
        if library in catalog:
            _fail(f"duplicate classpath catalog key: {library!r}")
        catalog[library] = [name.strip() for name in encoded.split(",") if name.strip()]
    if set(catalog) != set(libraries):
        _fail("cold-classpaths.properties keys differ from metadata.libraries")
    for library in libraries:
        if catalog[library] != file_names[library]:
            _fail(
                f"classpath order differs for {library}: metadata has "
                f"{file_names[library]!r}, catalog has {catalog[library]!r}"
            )

    for name, expected_digest in sorted(hashes_by_file.items()):
        artifact = classpath_directory / name
        if not artifact.is_file():
            _fail(f"classpath artifact is missing: {artifact}")
        digest = hashlib.sha256()
        try:
            with artifact.open("rb") as source:
                for chunk in iter(lambda: source.read(1024 * 1024), b""):
                    digest.update(chunk)
        except OSError as error:
            _fail(f"cannot hash {artifact}: {error}")
        actual_digest = digest.hexdigest()
        if actual_digest != expected_digest:
            _fail(
                f"SHA-256 mismatch for {artifact}: expected {expected_digest}, got {actual_digest}"
            )


def _flatten(prefix: str, value: Any, target: dict[str, Any]) -> None:
    if isinstance(value, dict):
        for key, child in value.items():
            child_prefix = str(key) if not prefix else f"{prefix}.{key}"
            _flatten(child_prefix, child, target)
    elif isinstance(value, list):
        target[prefix] = json.dumps(value, ensure_ascii=False, separators=(",", ":"))
    else:
        target[prefix] = value


def _flattened(record: Mapping[str, Any]) -> dict[str, Any]:
    result: dict[str, Any] = {}
    _flatten("", record, result)
    return result


def _read_csv(path: Path) -> tuple[list[str], list[list[str]]]:
    try:
        with path.open("r", encoding="utf-8", newline="") as source:
            rows = list(csv.reader(source))
    except (OSError, csv.Error, UnicodeError) as error:
        _fail(f"cannot read {path}: {error}")
    if not rows:
        _fail(f"{path.name} is empty")
    header = rows[0]
    if not header or any(not field for field in header):
        _fail(f"{path.name} has an empty header field")
    if len(header) != len(set(header)):
        _fail(f"{path.name} has duplicate header fields")
    for row_number, row in enumerate(rows[1:], 2):
        if len(row) != len(header):
            _fail(
                f"{path.name}:{row_number} has {len(row)} columns; expected {len(header)}"
            )
    return header, rows[1:]


def _csv_value_matches(value: str, expected: Any, path: str) -> None:
    if expected is None:
        if value != "":
            _fail(f"{path} is {value!r}; expected an empty CSV cell")
    elif isinstance(expected, bool):
        expected_text = "true" if expected else "false"
        if value != expected_text:
            _fail(f"{path} is {value!r}; expected {expected_text!r}")
    elif isinstance(expected, int):
        if value != str(expected):
            _fail(f"{path} is {value!r}; expected {str(expected)!r}")
    elif isinstance(expected, float):
        try:
            actual = float(value)
        except ValueError:
            _fail(f"{path} is not a floating-point number: {value!r}")
        if not math.isfinite(actual) or actual != expected:
            _fail(f"{path} is {value!r}; expected numeric value {expected!r}")
    elif isinstance(expected, str):
        if value != expected:
            _fail(f"{path} is {value!r}; expected {expected!r}")
    else:
        _fail(f"unsupported expected CSV value at {path}: {expected!r}")


def _validate_samples_csv(path: Path, records: Sequence[Mapping[str, Any]]) -> None:
    expected_rows = [_flattened(record) for record in records]
    expected_header = sorted({key for row in expected_rows for key in row})
    header, rows = _read_csv(path)
    if header != expected_header:
        _fail(f"samples.csv header differs from flattened JSONL schema")
    if len(rows) != len(expected_rows):
        _fail(f"samples.csv has {len(rows)} data rows; expected {len(expected_rows)}")
    for row_number, (row, expected) in enumerate(zip(rows, expected_rows), 2):
        for index, field in enumerate(header):
            _csv_value_matches(row[index], expected.get(field), f"samples.csv:{row_number}.{field}")


def _p50(values: Sequence[float]) -> float:
    if not values:
        raise ValueError("values must not be empty")
    ordered = sorted(values)
    middle = len(ordered) // 2
    if len(ordered) & 1:
        return ordered[middle]
    return (ordered[middle - 1] + ordered[middle]) / 2.0


def _p90(values: Sequence[float]) -> float:
    if not values:
        raise ValueError("values must not be empty")
    ordered = sorted(values)
    return ordered[max(0, math.ceil(0.90 * len(ordered)) - 1)]


def _expected_summary(records: Sequence[Mapping[str, Any]]) -> list[dict[str, Any]]:
    groups: defaultdict[tuple[str, str, int], list[dict[str, Any]]] = defaultdict(list)
    for record in records:
        key = (record["library"], record["operation"], record["operationCount"])
        groups[key].append(_flattened(record))

    rows: list[dict[str, Any]] = []
    for (library, operation, count), samples in sorted(groups.items()):
        row: dict[str, Any] = {
            "library": library,
            "operation": operation,
            "operationCount": count,
            "samples": len(samples),
        }
        for metric in SUMMARY_METRICS:
            values = [
                float(sample[metric])
                for sample in samples
                if isinstance(sample.get(metric), (int, float))
                and not isinstance(sample.get(metric), bool)
            ]
            if values:
                row[f"{metric}.p50"] = _p50(values)
                row[f"{metric}.p90"] = _p90(values)
                row[f"{metric}.min"] = min(values)
                row[f"{metric}.max"] = max(values)
        rows.append(row)
    return rows


def _validate_summary_csv(path: Path, records: Sequence[Mapping[str, Any]]) -> None:
    expected_rows = _expected_summary(records)
    expected_header = sorted({key for row in expected_rows for key in row})
    header, rows = _read_csv(path)
    if header != expected_header:
        _fail("summary.csv header differs from independently recomputed summary schema")
    if len(rows) != len(expected_rows):
        _fail(f"summary.csv has {len(rows)} data rows; expected {len(expected_rows)}")
    for row_number, (row, expected) in enumerate(zip(rows, expected_rows), 2):
        for index, field in enumerate(header):
            _csv_value_matches(row[index], expected.get(field), f"summary.csv:{row_number}.{field}")


def validate(output_directory: Path, classpath_directory: Path | None = None) -> ValidationReport:
    output_directory = output_directory.expanduser().resolve()
    if not output_directory.is_dir():
        _fail(f"result directory does not exist: {output_directory}")
    for name in EXPECTED_FILES:
        if not (output_directory / name).is_file():
            _fail(f"required result file is missing: {output_directory / name}")
    partials = sorted(
        path.name
        for path in output_directory.iterdir()
        if path.name.endswith(".partial") or path.name.endswith(".tmp")
    )
    if partials:
        _fail(f"incomplete temporary result files remain: {partials!r}")

    metadata = _read_metadata(output_directory / "metadata.json")
    cells, samples_per_cell = _validate_metadata(metadata)
    records = _read_jsonl(output_directory / "samples.jsonl")
    fixture_bytes, fixture_hash, jvm_version = _validate_samples(
        metadata, records, cells, samples_per_cell
    )
    _validate_classpaths(
        metadata,
        classpath_directory.expanduser().resolve() if classpath_directory is not None else None,
    )
    _validate_samples_csv(output_directory / "samples.csv", records)
    _validate_summary_csv(output_directory / "summary.csv", records)
    return ValidationReport(
        output_directory=output_directory,
        samples=len(records),
        cells=cells,
        samples_per_cell=samples_per_cell,
        fixture_bytes=fixture_bytes,
        fixture_hash=fixture_hash,
        jvm_version=jvm_version,
    )


def _parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("output_directory", type=Path, help="completed cold-JVM output directory")
    parser.add_argument(
        "--classpath-dir",
        type=Path,
        help="optionally rehash the classpath JARs recorded in metadata",
    )
    return parser


def main(argv: Sequence[str] | None = None) -> int:
    arguments = _parser().parse_args(argv)
    try:
        report = validate(arguments.output_directory, arguments.classpath_dir)
    except ValidationError as error:
        print(f"validation failed: {error}", file=sys.stderr)
        return 1
    print(f"validated {report.output_directory}")
    print(
        f"{report.samples} fresh JVM samples; {report.cells} cells x "
        f"{report.samples_per_cell}; JVM {report.jvm_version}"
    )
    print(f"fixture: {report.fixture_bytes} bytes, Java hashCode {report.fixture_hash}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())

#!/bin/sh

set -eu

run_date=${RUN_DATE:-$(date +%Y-%m-%d)}
expected_seed=${EXPECTED_SEED:-}

for datatype in clients users; do
  for cmd in ser deser; do
    for size in 1 10 100 1000; do
      expected_file="$datatype-$cmd-1-$size.txt"
      if [ ! -f "$expected_file" ]; then
        echo "Missing JMH output: '$expected_file'" >&2
        exit 1
      fi
    done
  done
done

actual_count=$(find . -maxdepth 1 -type f -name '*.txt' | wc -l | tr -d ' ')
if [ "$actual_count" -ne 16 ]; then
  echo "Expected exactly 16 JMH text files; found $actual_count" >&2
  exit 1
fi

run_seed=""
for datatype in clients users; do
  for cmd in ser deser; do
    for size in 1 10 100 1000; do
      file="$datatype-$cmd-1-$size.txt"
      file_seeds=$(sed -n -E 's/^.*Using SEED=([0-9]+) as seed for Random.*$/\1/p' "$file" | sort -u)
      seed_count=$(printf '%s\n' "$file_seeds" | awk 'NF { count++ } END { print count + 0 }')
      if [ "$seed_count" -ne 1 ]; then
        echo "Expected one unique seed in '$file'; found $seed_count" >&2
        exit 1
      fi
      if [ -z "$run_seed" ]; then
        run_seed=$file_seeds
      elif [ "$file_seeds" != "$run_seed" ]; then
        echo "Mixed benchmark seeds: '$file' uses $file_seeds, expected $run_seed" >&2
        exit 1
      fi
    done
  done
done

if [ -n "$expected_seed" ] && [ "$run_seed" != "$expected_seed" ]; then
  echo "Expected benchmark seed $expected_seed; found $run_seed" >&2
  exit 1
fi

for datatype in clients users; do
  for cmd in ser deser; do
    case $cmd in
      deser) operation="Deserialization" ;;
      ser) operation="Serialization" ;;
    esac
    for size in 1 10 100 1000; do
      file="$datatype-$cmd-1-$size.txt"
      completion_count=$(awk '/^# Run complete\. Total time:/ { count++ }
                              END { print count + 0 }' "$file")
      if [ "$completion_count" -ne 1 ]; then
        echo "Expected one completed JMH run in '$file'; found $completion_count" >&2
        exit 1
      fi
      if ! awk -v operation="$operation" '
          /^# Run complete\. Total time:/ { complete = 1; next }
          complete && /^Benchmark[[:space:]]/ { table = 1; next }
          table && $1 ~ ("(^|\\.)" operation "\\.") && $2 == "thrpt" { row = 1 }
          END { exit !(table && row) }
        ' "$file"; then
        echo "Missing $operation JMH result table in '$file'" >&2
        exit 1
      fi
    done
  done
done

echo "$run_date"
echo

for datatype in clients users; do
  echo "# *$datatype* data type"
  echo

  for cmd in ser deser; do
    case $cmd in
      deser) operation="Deserialization" ;;
      ser) operation="Serialization" ;;
    esac

    for size in 1 10 100 1000; do
      file="$datatype-$cmd-1-$size.txt"
      title="$operation - $size KB"

      echo "## JMH: $title"
      echo

      failure_output=$(awk '
        /^# Benchmark:/ { capture = 0; benchmark = $0 }
        capture && (/^# JMH version:/ || /^# Run complete\./) { capture = 0 }
        index($0, "<failure>") { print benchmark; capture = 1 }
        capture && index($0, "</failure>") { print; capture = 0; next }
        capture { print }
      ' "$file" | sed -E \
        's#file:/(home/[^/]+|Users/[^/]+)/[^ )]+/build/libs/app\.jar#file:/benchmark/build/libs/app.jar#g')
      if [ -n "$failure_output" ]; then
        echo "<details>"
        echo "<summary>JMH failure output (no score was recorded)</summary>"
        echo
        echo '```text'
        printf '%s\n' "$failure_output"
        echo '```'
        echo "</details>"
        echo
      fi

      awk '/^# Run complete\. Total time:/ { complete = 1; next }
           complete && /^Benchmark[[:space:]]/ { table = 1 }
           table { print }' "$file" | sed -E -e 's/± +/±/' | \
        awk 'BEGIN { OFS=" | " }
             $1 == "Benchmark" {
               print "",$1,$2,$3,$4,$5,$6,""
               print "|-----------|------|-----|-------|-------|-------|"
               next
             }
             NF == 4 && $2 == "thrpt" { print "",$1,$2,"",$3,"",$4,""; next }
             { print "",$1,$2,$3,$4,$5,$6,"" }' | \
        sed -E \
        -e 's/^.*databind\.Deserialization\.([a-zA-Z_]+)/| \1\/databind/g' \
        -e 's/^.*stream\.Deserialization\.([a-zA-Z_]+)/| \1\/stream/g' \
        -e 's/^.*databind\.Serialization\.([a-zA-Z_]+)/| \1\/databind/g' \
        -e 's/^.*stream\.Serialization\.([a-zA-Z_]+)/| \1\/stream/g' \
        -e 's/^.*(Serialization|Deserialization)\.([a-zA-Z_]+)/| \2\/databind/g' \
        -e 's/\| ± \|/±/g' \
        -e 's/^ //g' \
        -e 's/[[:space:]]+$//'
      if [ "$datatype/$cmd/$size" != "users/deser/1000" ]; then
        echo
      fi
    done
  done
done

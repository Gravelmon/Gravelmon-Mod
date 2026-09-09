import json
from pathlib import Path

SCRIPT_DIR = Path(__file__).resolve().parent

for json_file in SCRIPT_DIR.rglob("*.json"):
    try:
        with json_file.open("r", encoding="utf-8") as f:
            data = json.load(f)

        formatted = json.dumps(
            data,
            indent=2,
            ensure_ascii=False
        ) + "\n"

        with json_file.open("r", encoding="utf-8") as f:
            current = f.read()

        if current == formatted:
            print(f"Already formatted: {json_file}")
            continue

        with json_file.open("w", encoding="utf-8") as f:
            f.write(formatted)

        print(f"Formatted: {json_file}")

    except json.JSONDecodeError as e:
        print(f"Skipped invalid JSON: {json_file}")
        print(f"  {e}")
    except Exception as e:
        print(f"Error processing {json_file}: {e}")

print("Done.")
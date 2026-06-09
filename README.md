# My First Project with Go

A corner shop net income calculator built as a [Hyperskill](https://hyperskill.org/projects/421) Go project.

## What it does

Prints a list of shop products and their prices, calculates total income from quantities sold, then computes net income after staff and other expenses.

## Stages

| # | Stage | Status |
|---|-------|--------|
| 1 | Print the prices | ✅ Done |
| 2 | Measuring total income | ⬜ Pending |
| 3 | Calculate net income | ⬜ Pending |

## Running

```bash
cd "My First Project with Go/task"
~/sdk/go1.26.4/bin/go run main.go
```

## Running tests

```bash
./gradlew "My First Project with Go:task:test"
```

Tests use the Hyperskill `hs-test` Java framework, which runs the Go binary as a subprocess and checks its stdout.

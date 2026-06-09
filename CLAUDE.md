# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a [Hyperskill](https://hyperskill.org/projects/421) educational project: **My First Project with Go**. The goal is to build a corner shop income calculator across 3 progressive stages. Each stage lives in its own subdirectory under `My First Project with Go/`.

## Code Location

The Go source file to edit is always:
```
My First Project with Go/task/main.go
```

The active stage is determined by which `task-info.yaml` has `status: Unchecked`. Currently the project is working through these stages in order:
1. **Print the prices** — print item names and prices with `$` prefix
2. **Measuring total income** — add up and print total earned amounts
3. **Calculate net income** — read staff/other expenses from stdin, print net income

## Running and Testing

Run the Go program directly:
```bash
cd "My First Project with Go/task"
go run main.go
```

Tests are written in Java using the Hyperskill `hs-test` framework and run via Gradle. To run tests for the current task:
```bash
./gradlew "My First Project with Go:task:test"
```

## Test Behavior

Each stage's `test/MyFirstProjectTest.java` checks stdout of the compiled Go binary. Tests are case-insensitive on output (`toLowerCase()`). The test runner compiles and executes the Go program as a subprocess via `TestedProgram`.

## Stage Requirements (final stage target output)

```
Earned amount:
Bubblegum: $202
Toffee: $118
Ice cream: $2250
Milk chocolate: $1680
Doughnut: $1075
Pancake: $80

Income: $5405
Staff expenses:
> 2000
Other expenses:
> 205
Net income: $3200
```

Item prices (fixed, not user input): Bubblegum $2, Toffee $0.2, Ice cream $5, Milk chocolate $4, Doughnut $2.5, Pancake $3.2.

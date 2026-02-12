# AGENTS.md - Coding Guidelines for Codemaxxing Repository

## Project Overview

This is a personal interview preparation repository containing coding exercises in multiple languages (Python, Java, Go, Rust, C/C++). Each exercise is a self-contained directory with its own build/test setup.

## Directory Structure

```
exercises/
  01/                    # Each problem in numbered directory
    README.md            # Problem description + build instructions
    solution.ext         # Hand-written solution file
    test.ext             # Test file for the solution
  02/
    ...
ai_skills/
  create_new_problem/    # Skill for creating new problems
    SKILL.md
```

## Language-Specific Commands

Each exercise directory is self-contained. Check the README.md in each directory for specific commands.

### Python
```bash
# Run tests
python test.py

# Run specific test
python -m pytest test.py -v -k test_name

# Run solution
python solution.py
```

### Java
```bash
# Compile
javac Solution.java Test.java

# Run tests
java Test

# Run solution
java Solution
```

### Go
```bash
# Run tests
go test

# Run specific test
go test -run TestName

# Run solution
go run solution.go
```

### Rust
```bash
# Build and test
cargo test

# Run specific test
cargo test test_name

# Run solution
cargo run
```

### C/C++
```bash
# Compile
gcc -o solution solution.c
g++ -o solution solution.cpp

# Run
./solution
./test
```

## Code Style Guidelines

### General Principles
- Write clean, readable code optimized for learning
- Include comments explaining approach for complex logic
- Follow language-specific idioms and conventions

### Naming Conventions
- **Files**: `solution.ext`, `test.ext` (lowercase, no underscores)
- **Functions/Methods**: camelCase for Java/Go/JavaScript, snake_case for Python/Rust
- **Classes**: PascalCase (Solution, TestCase)
- **Variables**: descriptive names (no single letters except loop indices)

### Import/Dependency Management
- Keep imports minimal and explicit
- Group imports: standard library first, then third-party
- Remove unused imports

### Formatting
- **Python**: PEP 8, 4 spaces indentation
- **Java**: Google Java Style, 2 spaces indentation
- **Go**: gofmt standard
- **Rust**: rustfmt standard
- **C/C++**: 4 spaces indentation, braces on same line

### Error Handling
- Always handle errors explicitly
- Return meaningful error messages
- In tests: fail fast with clear error descriptions
- Never swallow exceptions or ignore return codes

### Test Writing
- Test both happy path and edge cases
- Use descriptive test names: `test_empty_array_returns_zero`
- One assertion per test when possible
- Include time/space complexity comments in solutions

## Creating New Problems

When creating new exercises via the skill:
1. Number directories sequentially (01, 02, 03...)
2. Include complete build/run instructions in README.md
3. Provide starter code in solution file with TODO comments
4. Write comprehensive tests covering edge cases
5. Include time/space complexity requirements if relevant

## Common Patterns

- Solution files should have a main/test function for manual verification
- Test files should import/require the solution file
- Include example inputs/outputs in comments
- Document any external dependencies needed

## Pre-Commit Checklist

- [ ] Solution compiles/runs without errors
- [ ] All tests pass
- [ ] Code follows language style guidelines
- [ ] README.md has clear instructions
- [ ] No debug print statements left in final code

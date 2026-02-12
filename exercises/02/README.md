# Reverse Linked List

## Problem Description

Given the head of a singly linked list, reverse the list, and return the reversed list.

## Example

**Example 1:**
```
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
```

**Example 2:**
```
Input: head = [1,2]
Output: [2,1]
```

**Example 3:**
```
Input: head = []
Output: []
```

## Constraints

- The number of nodes in the list is the range [0, 5000]
- -5000 <= Node.val <= 5000

## Follow Up

A linked list can be reversed either iteratively or recursively. Could you implement both?

## Build and Run Instructions

### Compile
```bash
javac Solution.java Test.java
```

### Run Tests
```bash
java Test
```

### Run Solution (optional)
```bash
java Solution
```

## Time and Space Complexity

- **Iterative Approach:**
  - Time Complexity: O(n)
  - Space Complexity: O(1)

- **Recursive Approach:**
  - Time Complexity: O(n)
  - Space Complexity: O(n) for the call stack

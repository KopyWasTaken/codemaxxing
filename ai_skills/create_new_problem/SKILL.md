---
name: create_new_problem
description: This skill creates a directory and associated files for a programming problem. It should be used when the user wants to create a new programming problem to solve for interview prep.
---

Navigate to the exercises directory in this project.

List all of the files in the directory. They should all be numbered in order. Create a new directory that is the continuation of the last numbered directory.

For example example directory:

- 01/
- 02/
- 03/

The next folder created would be `04/`.

Next, ask the user what programming language they would like to use to solve the problem.
For now, the choices are python, java, go, rust, and C/C++.

Next, ask the user what type of problem they'd like to solve, choosing from a list containing:

- Arrays and Strings
- Linked Lists
- Stacks and Queues
- Trees and Graphs
- Bit Manipulation
- Recursion and Dynamic Programming
- System Design and Scalability
- Sorting and Searching

Also include an option that picks randomly from the list of options.

Next, take a look at MEMORY.md to see a list of all of the problems asked in the past. Use this list to make sure you do not generate the same problem over again, or anything too similar to the problems asked before.

Next, generate a programming interview question using the topic the user chose. 

Next, create 3 files in that new directory:

- README.md which is a file that contains the programming problem to be solved, along with instructions to build and run the solution file and test file in this directory.
- solution.file_ext, where file_ext is the file extension used for the programming language the user has chosen. This will hold any starting code that the problem needs, along with an unimplemented method / function where the solution should go.
- test.file_ext, where file_ext is the file extension used for the programming language the user has chosen. This will hold code that will test the implementation in the solution file, and any boilerplate needed for that to happen.

Do not give overly useful hints in the README or in comments in any of the generated files. Do explain examples though when writing out the problem.

Finally, add a new line to MEMORY.md with a description of the problem.

# Student Report

A Java program that reads student marks from a CSV file and writes a report using streams.

Lines with a missing column, a marks value that is not a number, or marks outside 0-100 are skipped and a message is printed.

## Requirements

- JDK 25
- IntelliJ IDEA


## Input files

- `students.csv`: one student per line, in the form `name,marks`. The first line is a header.
- `config.properties`: contains `passMark=40`, the marks needed to pass.

Example `students.csv`:

```
name,marks
Ram,100
Ravi,10
```

## How to run

Open the project in IntelliJ and run `ReportApp` (in `org.example.report`).

## Output

The report is printed on screen and saved to `report.txt`. Example:

```
Total Students : 5
Total Marks : 202
Average Marks : 40.40
Highest Marks:Ram(100)
Passed students (40 or more) :
Ram(100)
Anagha(51)
Ana(40)
Failed count (less than 40): 2
```
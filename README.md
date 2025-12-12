**TextFileAnalyzer Lab – Activity Guide**

**NOTE: more information with grading rubrics are in the TextFileAnalyzer lab activity guide word doc**

**Overview**

The TextFileAnalyzer lab practices AP CSA Chapter 6 file-processing skills. You will use Java’s File, Scanner, and PrintStream classes to read quiz score data from scores.txt and generate a formatted report in results.txt.

The starter code includes:
    1. A complete main method
    2. Three method headers with comment instructions
    3. Clear //TODO comments in each method

Files Provided
src/TextFileAnalyzer.java   --> Starter code with TODOs
data/scores.txt             --> Input data file **(DO NOT EDIT)**

**Your Task**

You will complete three static methods inside TextFileAnalyzer.java.

1. countScoresPerLine
- Reads each line of scores.txt
- Counts how many integer tokens appear
- Writes formatted output to results.txt

2. highestScorePerLine
- Reads each line
- Determines the maximum score
- Prints the highest score per line

3. averageScorePerLine
- Reads each line
- Computes the truncated integer-division average
- Prints the average per line

You must use:
File
Scanner
hasNextLine(), hasNextInt(), nextInt()
Loops for reading lines and tokens
PrintStream: output.println(...)
Closing all Scanner objects

**Do NOT modify:**
The main method
The contents of scores.txt

**Expected Output (results.txt)**
Number of Scores
Line 1 has 3 scores.
Line 2 has 6 scores.
Line 3 has 2 scores.
Line 4 has 1 scores.

Highest Scores
Line 1’s highest score is: 97.
Line 2’s highest score is: 100.
Line 3’s highest score is: 70.
Line 4’s highest score is: 20.

Average Scores
Line 1’s average score is: 69.
Line 2’s average score is: 83.
Line 3’s average score is: 65.
Line 4’s average score is: 20.



**How to Complete the Lab**

Follow the TODO comments inside each method. They will guide you through:
- Creating a File object
- Creating a Scanner to read from the file
- Looping through the file using hasNextLine()
- Reading tokens using hasNextInt() and nextInt()
- Summing values, comparing for maximums, or computing averages
- Printing formatted output using PrintStream
- Closing all Scanners

Example TODO from the starter code:
//TODO: Create a File object for the input file
//File file = new File("scores.txt");

//TODO: Create a Scanner to read from the file
//Scanner console = new Scanner(file);

//TODO: Loop through each line and print:
//output.println("Line " + lineNumber + " has " + count + " scores.");

**Submission**

Submit: 
- TextFileAnalyzer.java
- your generated results.txt

Submit through:
- Canvas, or
- GitHub (if available)
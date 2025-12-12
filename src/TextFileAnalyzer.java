/* INSTRUCTIONS
 Given a data file ("scores.txt") where each line contains several integer quiz scores
 separated by spaces, create three static methods to find:
  - how many scores are on each line
  - the highest score on each line
  - the average score on each line
 
 Results should be written to an output file using PrintStream.
 
 Complete each TODO

 */

import java.io.*;
import java.util.*;

public class TextFileAnalyzer {

    public static final String FILENAME = "scores.txt";

    public static void main(String[] args) throws FileNotFoundException {
        // DO NOT MODIFY MAIN!
        //creates a PrintStream that writes to a results file
        PrintStream output = new PrintStream("results.txt");

        //calls each method and pass the same PrintStream
        output.println("Number of scores report: ");
        countScoresPerLine(FILENAME, output);
        output.println("");

        output.println("Highest scores report: ");
        highestScorePerLine(FILENAME, output);
        output.println("");

        output.println("Average scores report: ");
        averageScorePerLine(FILENAME, output);
        output.println("");

        //Remember, ALWAYS close the PrintStream when done!
        output.close();

        System.out.println("Analysis done! Check results.txt for your output!");
    }

    

    /*
     For each line, prints how many scores appear on that line in a new file named .
     Example output:
     Line 1 has 3 scores.
     */
    public static void countScoresPerLine(String filename, PrintStream output)
            throws FileNotFoundException {
        
        //TODO: Create a File object for the input file
        //File file = new File(_____); **Fill in the blank!

        //TODO: Create a Scanner to read from the file
        //Scanner console = new Scanner(_____); **Fill in the blank!

        int lineNumber = 0; //used to count the line number

        //TODO: Loop through each line in the file and 
        //report the number of scores in each line in the new file results.txt:
        //  - use a while loop
        //  - use hasNextLine(), hasNextInt(), nextInt() method
        //  - print output in new printStream output: 
        //    output.println("Line " + lineNumber + " has " + count + " scores.");
    
        // reminder TODO: close Scanner(s) being used
    }

    /**
     * For each line, prints the highest score on that line.
     * Example output:
     * Line 2's highest score is: 100
     */
    public static void highestScorePerLine(String filename, PrintStream out)
            throws FileNotFoundException {

        // TODO: Implement code for static method to work ... dont forget to close scanner if you use it!
    }

    /*
     * For each line, prints the average score on that line (truncated integer division answer).
     * Example output:
     * Line 3's average score is: 68
     */
    public static void averageScorePerLine(String filename, PrintStream out)
            throws FileNotFoundException {

        // TODO: Implement code for static method to work ... dont forget to close scanner if you use it!
    }
}



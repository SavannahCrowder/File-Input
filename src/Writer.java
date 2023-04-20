import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Writer {
    PrintWriter outputFile;


    //The FileOutput constructor takes in a single String parameter, which is the name of the file we would like to create
    // . Using this parameter, create a FileOutputStream and set the PrintWriter object, outputFile, using the newly created
    // FileOutputStream. The additional information section on the README may assist you if any problems arise.
    // This PrintWriter object will be used for the rest of our functions, logReverse(), logMax(), logDuplicates().
    public Writer(String fileName) throws IOException{

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        outputFile = new PrintWriter(fileOutputStream);
        
    }


    //This method appends an end message to the PrintWriter object and then closes the PrintWriter to ensure no
    // memory leaks occur.
    public void closeWriter() {
        outputFile.print("End of file.");
        outputFile.close();
    }

    /** Student Self-Explanation
     * The program needs to first get the size of the ArrayList then needs to loop through the list in reverse order.
     * It needs to start at the last index and reduce the index by 1 until it hits the first index. The get() method needs
     * to be implemented for each iteration so the program can get the current idex. Then the println() method needs to be
     * used to print the line to the new file.
     */

    /**
     *This method should work through the ArrayList provided backwards, and print each element to our file backwards,
     *using the PrintWriter initialized in the constructor. It should not matter whether the contents of the file are
     *numbers, Strings, or sentences. The purpose of this method is to reverse the contents of the fileContents ArrayList
     * and then print them to our new file. For example:
     *
     *  12
     *  42
     *  19
     *  12
     *  58
     *
     * The new file would contain:
     *
     *  Reversed file contents:
     *  58
     *  12
     *  19
     *  42
     *  12
     * @param fileContents
     */
    public void logReverse(ArrayList<String> fileContents) {
        outputFile.println("Reversed file contents: ");

        //System.out.println("Quantity of elements in our array list" +  fileContents.size());
        for (int i = fileContents.size()-1; i >= 0; i--) {
            outputFile.println(fileContents.get(i));
        }

    }
    /** Student Self-Explanation
     * First we need to initialize the variable maxValue with the int of the first element in the ArrayList.
     * Then a for loop needs to be made that loops through each element of ArrayList and caompares it with the current
     * maxValue and if the int is greater than or equal to the current maxValue it becomes the new maxValue.
     */
    /**
     * This method works through each element in the provided ArrayList and determines the largest number that is
     * contained within said ArrayList. Whichever number is determined to be the largest will be logged, using the
     * PrintWriter initialized in the constructor. You may have noticed that the ArrayList is populated by String objects,
     * so using a Wrapper class to convert from String to int will come in use here. If the provided file contained:
     *
     *  12
     *  42
     *  19
     *  12
     *  58
     *
     * The new file would contain:
     *
     *  The largest number in the file is: 58
     * @param fileContents
     */
    public void logMax(ArrayList<String> fileContents) {


        int maxValue = Integer.parseInt(fileContents.get(0));

        outputFile.print("The largest number in the file is: ");
        //You will want to print your max number on this line.
        for (int i = 0; i <= fileContents.size()-1; i++) {
            int intTemp = Integer.parseInt(fileContents.get(i));
            if (intTemp >= maxValue) {
                maxValue = intTemp;
            }

        }
        outputFile.println(maxValue);
    }

    /**
     * This method works through each element contained in the provided ArrayList and determines if duplicate elements
     * exist within the ArrayList. If duplicate elements are found, print to file, "true", or "false" if they are not.
     * There are multiple solutions to this problem, but one of the most common approaches involves a nested loop.
     * If the provided file contained:
     *
     *  12
     *  42
     *  19
     *  12
     *  58
     *
     * The new file would contain:
     *
     *  Duplicates found: true
     */
    /** Student Self-Explanation
     * A for loop needs to be made that loops through each elemnt in the ArrayList of Strings and comapre it to the all
     * the following elements and determine if they are duplicates. If no duplicate is found then "false" will be logged.
     */
    public void logDuplicates(ArrayList<String> fileContents) {
        outputFile.print("Duplicates found: ");

        boolean foundDup = false;
for (int i = 0; i <= fileContents.size()-1; i++){
    for (int j = i; j <= fileContents.size()-2; j++){
        if ((Integer.parseInt(fileContents.get(i)) == Integer.parseInt(fileContents.get(j+1)))) {
            foundDup = true;
            break;
        }
    }

}
if (foundDup){
    outputFile.println("true");
}
else{
    outputFile.println("false");
}

    }
}

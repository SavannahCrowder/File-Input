# Lab 11 - File Output
This lab is going to focus on File Output, which you will find is somewhat similar to console output. If you need a refresher after your well-deserved Spring Break, there is an additional information section at the bottom of this document!

For ease of access, here is the [javadoc](https://csu-compsci-cs163-4.github.io/Lab11FileOutput/package-summary.html).

## Pre-Step: Walkthrough and Compilation
As with the last Tuesday lab and any other piece of code you may find yourself working with, it is always a great idea to find the `main` function, which is contained in the `FileMain` class, and try to work through what the program is currently doing. The main functionality is dependent upon your implementation, but this walkthrough will help solidify your understanding of the program.

Once you have walked through the program and have a decent understanding of what should be occurring, try to compile and run the program. Some errors will arise, but this is expected!

## Step 1: Self-Explanation
There will be three self-explanations for you to complete within `Writer.java`. The javadocs will serve as a guide when you write out these self-explanations. The last method, `logDuplicates()` is quite difficult so it may be of use to write out pseudocode along with your self-explanation.

## Step 2: Implementation
After explaining your thought process, move onto implementing your solution, adjust your self-explanation if your implementation differs.

## Step 3: Testing
Once you have finished up with your implmentation, a testing file has been included, `FileTester.java`. These tests will probably not work if your constructor is incomplete or incorrect, but there are three methods to test the other three methods you were expected to complete. As with the last labs that included tests, you are encouraged to create your own tests that fill every case that may occur in your program.

These tests will generate new files, so you may need to delete them after each test run, so new ones can be properly generated.

## Step 4: Turning In
Have your TA check over your self-explanations and then make sure to submit your `Writer.java` to zyBooks. Online students do not have the option to submit their self-explanations but it is still highly recommend that it is completed to help better understand the code.

# Additional Information
## File Output
This section will be quite brief, as you are actually already acquainted with output streams, remember `System.out.println()`?

Using the PrintWriter to output to a file is quite similar.
For the setup of this new file, you will want to follow the example below:
``` java
FileOutputStream fileStream = new FileOutputStream("newfile.txt");
PrintWriter openFile = new PrintWriter(fileStream);
```
This is creating an IO stream to a file, and then we use the FileOutputStream to construct a PrintWriter for the file so we can actually write to it.

Now that we are able to write to out file, we can do that by using the methods we learned in the first day of class, `print` & `println`.
``` java
openFile.println("This line is in newfile.txt!");
openFile.print("So is this one!");
```

Not too bad right? One last thing that we must do, and is good to do in practice is closing the PrintWriter so we don't create any memory issues. This can be done like so:
``` java
openFile.close();
```

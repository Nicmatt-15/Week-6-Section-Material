# PseudoCode for Baby A6

```java
/*
* The skeleton code is written by Nicolas Matthew Suhardi
* Please do not distribute unless given the permisison to do so
*/

import java.util.*;
import java.io.*;

public class BabyA6 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         * Do not alter the code creating the WordRandomizer object
         *
         * Documentation:
         * .generateWord() takes in no parameter and returns a String of a random
         * adjective/noun/verb
         *
         * Example:
         * String someWord = wordGenerator.generateWord();
         */
        WordRandomizer wordGenerator = new WordRandomizer();
        Scanner console = new Scanner(System.in);
        String userInput = "s"; // loop priming

        intro();

        while (the user input does not start with q) {
            System.out.print("Would you like to: a) Randomize b) Print c) Quit? ");
            userInput = console.next();

            if (user input starts with r) {
                get file Scanner from getInputScanner method

                get PrintStream from getPrintStream method

                call randomizeStory method
            } else if (user input starts with p) {
                get file Scanner from getInputScanner method

                call printFile method
            }
        }
    }

    intro(...) method {
        print the intro here
    }

    getInputScanner(...) method {
        System.out.print("File name? ");

        get input file name

        create file object from fileName

        while (file does not exist) {
            System.out.print("Retry, file name? ");

            get new input file name

            update file object from the new file name
        }

        return a scanner object
    }

    getPrintStream(...) method {
        System.out.print("Output file? ");

        get output file name

        create the printstream object from the file name

        return a printstream object
    }

    printFile(...) method {
        while (there is more line to read) {
            read the line
            print the line
        }

        System.out.println();
    }

    randomizeStory(...) method {
        while (there is more line to read) {
            read the line
            create a scanner to read the line

            while (the string scanner has more word to take) {
                take the word

                if (the word ends with % sign) {
                    generate a random

                    print the generated random word into the output file
                } else {
                    print the original word into the output file
                }

            } // end of inner loop

        } // end of outer loop

    } // end of method

} // end of class

```

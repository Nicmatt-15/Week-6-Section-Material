# Tips for Assessment 6

## Table of Content

1. [Strategy](#strategy)
2. [Detecting Placeholder Word](#detecting-placeholder-word)
3. [Code Structure](#code-structure)
4. [Quick Style Checklist](#quick-style-checklist)
5. [Additional Note](#additional-note)
6. [FAQ](#faq)

---

## Strategy

I recommend you to tackle this Assessment in the following order:

1. Get the menu prompting (_where the program ask the user whether the user wants to create, view, or quit_) working first. Make sure it compiles and runs perfectly.

2. Complete the view part of the program. This is one of the easier part of the program that should not require you more than 3 to 4 lines of code.

   > Remember that there are 3 approaches you can use to read the input file (token by token, line by line, breaking each line into tokens). You should choose the approach that does not alter the format of the text without being too inefficient.

3. Complete the create part of the program. This is the hardest part of the program.

   > Like the view part of the program, you want to choose one of the three approaches. For the create part, you want to choose the approach that does not alter the format of the text **but still giving you the ability to go through each token**.

---

## Detecting Placeholder Word

Remember that a placeholder word must fulfill the two criterias below:

1. It should start with a left angle bracket (`<`)
2. It should end with a right angle bracket (`>`)

You should two String methods that reflects the two points above!

> When you are trying to remove the starting and ending angle bracket, you **SHOULD NOT** to also remove any angle bracket in the middle. This means that using the String method `.replace(...)` in this occassion would not be a good idea since `.replace(...)` will replace all angle brackets.

---

## Code Structure

1. Ideally, you should have 5 methods with the following breakdown:

   1. Method for the program introduction
   2. Method for prompting the user for the input file name (**this method should return a Scanner object**)
   3. Method for prompting the user for the output file name (**this method should return a PrintStream object**)
   4. Method for the view part of the program
   5. Method for the create part of the program

2. You should have a while-loop in main, **but not a nested while-loop**. You do not need a nested while-loop to make the menu prompting works.

---

## Quick Style Checklist

1. Header, class, and method comments (+ parameter and return comments if needed)
2. Proper indentation
3. No long lines (lines with more than 100 characters)
4. Blank line between methods
5. Descriptive and **camelCased** method and variable name

---

## Additional Note

1. Do not feel surprised if your conditional structure ends with an else-if!
2. Remember that you should check whether the input file exist or not for the view and create portion of the program. You can find the material related to checking file existence on the last part of [this](Reading-From-a-File.MD) document.
3. You do not have to check whether the output file exist or not. Java will create the output file for you if it has not existed yet.
4. Add `throws FileNotFoundException` to any method header where you create your File object, File Scanner, or Printstream!
5. You don't have to worry about having a lot of `||` operators when you are checking whether a placeholder starts with a vowel or not.

---

## FAQ

1. Is the view part of the program related to the create part?

   > **Not at all**. They do not depend on each other and you can run both in any order that you want. You do not have to create first before viewing and vice versa.

2. Why am I getting a lot of "cannot find symbol" error on my PrintStream and Scanner?

   > Make sure to add both `import java.util.*;` and `import java.io.*;`

3. Why is my program is not working properly when it is checking whether the input file exist or not?

   > Makes sure that you are updating your File object variable inside your while-loop. Do not create a new variable to store the new File object you just created in the while-loop.

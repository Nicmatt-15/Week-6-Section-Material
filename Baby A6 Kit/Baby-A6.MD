# Baby A6

## Documentation

_Written by: Nicolas Matthew Suhardi_

_**DO NOT DISTRIBUTE**_

---

## Table of Content

1. [Program Overview](#program-overview)
2. [Program Behavior](#program-behavior)
3. [Program Requirements](#program-requirements)
4. [Program Hints](#hints)

---

## Program Overview

You will write a program that keeps asking the user to choose one
of the three options that your program offers:

1. Reading a story from an input file and changing some of the words with _pseduorandom_ generated words. The final product of the story will be printed to an output file that the user wants.
2. Printing out the content of a file into the console
3. Quit the program
   If the user inputs anything outside the three options above, your program should not do anything and re-ask the user for another input.

---

## Program Behavior

Input file:

```
You are special% to me
You are the only one who I wouldn't mind losing sleep for,
the only one who I can never get tired% of talking to,
and the only one who crosses% my mind constantly throughout the day.
You are the only one who can make me smile% without trying,
bring down% my mood without the intention to
and affect% my emotions with every action of yours.
I can not explain with just words% how much you mean to me,
but you are the only one I am afraid of losing%
and the one I want to keep% in my life.
```

Example run:

_Note that your story might be slightly different due to the random nature of the program_

```
Welcome to the "Story Randomizer Program"
This program will transform a mediocre text into a masterpiece
Be prepared to witness something better than Harry Potter!

Would you like to: a) Randomize b) Print c) Quit? r
File name? test.txt
Retry, file name? hello.txt
Retry, file name? input.txt
Output file? output.txt

Story Randomized!

Would you like to: a) Randomize b) Print c) Quit? pRinT
File name? haiya.txt
Retry, file name? output.txt

You are wheedling to me
You are the only one who I wouldn't mind losing sleep for,
the only one who I can never get rebarbative of talking to,
and the only one who wheedling my mind constantly throughout the day.
You are the only one who can make me capybara without trying,
bring deterge my mood without the intention to
and recycle my emotions with every action of yours.
I can not explain with just recycle how much you mean to me,
but you are the only one I am afraid of limpid
and the one I want to tiktaalik in my life.

Would you like to: a) Randomize b) Print c) Quit? exit
Would you like to: a) Randomize b) Print c) Quit? Quit
```

> 1. When the user is being asked if the user wants to Randomize, Print, or Quit, your program should only focus on the first letter of the user’s answer. If the first letter is 'r' (case insensitive) then your program should execute the Randomize functionality. If the first letter is ‘p’ (case insensitive), then your program should execute the print functionality. If the first letter is ‘q’ (case insensitive), then your program should quit / end.
> 2. The Randomize functionality of this program is to read the input file line by line. For each line, your program should find the word or token that ends with the ‘%’ sign. Your program should then replace this token using a randomly generated word.
> 3. The Print functionality reads the input file line by line and output them directly to console.
> 4. Your program should always check if the input file name that the user inputs exist or not. On the other hand, your program should not check if the output file exists or not.

---

## Program Requirements

1. Your main method may only contain a single non-blank print / println.
2. Your main method should have 1 while loop. However, it should not be a nested while loop.
3. The solution has a total of 5 methods other than main. Your method count shouldn’t be less. You are allowed to make more methods as long as they are not trivial.
4. One of your 5 methods should return a Scanner
5. One of your 5 methods should return a PrintStream
6. All user input from console must be taken using `.next()`

---

## Hints

String methods that you may find useful:

1.  `.substring()`
2.  `.endsWith()`
3.  `.replace()`
4.  `.startsWith()`
5.  `.toLowerCase()` or `.toUpperCase()`
6.  `.charAt()`

Some of the String methods above have overlapping functionality in the context of this program. You are free to make the decision of which string methods you want to use and which String methods you do not want to use.

# Reading From a File

## Table of Content

1. [Declaring a Scanner Object](#declaring-a-scanner-object)
2. [Definition of Token](#definition-of-token)
3. [Using a Scanner Object](#using-a-scanner-object)
4. [Checking File Existence](#checking-file-existence)

---

## Declaring a Scanner Object

Just like how we read user-input from console, we can use Scanner to read text from files!

_Here are the steps:_

1. import `java.io.*;` and import `java.util.*;` _(order does not matter)_

   ```java
   import java.io.*;
   import java.util.*;
   ```

2. Decide and save your input file name as a String.

   ```java
   String inputFileName = "hello.txt";
   ```

3. Create a File object using the file name you have decided.

   ```java
   String inputFileName = "hello.txt";
   File someVariableName = new File(inputFileName);
   ```

   > These steps are done with the assumption that your input file actually exists in the same folder as your `.java` file.

4. Create a Scanner object using the File object you created.

   ```java
   String inputFileName = "hello.txt";
   File myInputFile = new File(inputFileName);

   Scanner myInputScanner = new Scanner(myInputFile);
   ```

   > Notice that I am using my File object when declaring my Scanner instead of using `System.in`

   > You can create multiple Scanner in one program! In A6, you will realize that you will need both `System.in` Scanner and a Scanner to read your file!

5. Add `throws FileNotFoundException` to the method header where you declare your File and Scanner object. For example, if you declare your File and Scanner object in the main method:

   ```java
   public static void main(String[] args) throws FileNotFoundException {
       String inputFileName = "hello.txt";
       File myInputFile = new File(inputFileName);

       Scanner myInputScanner = new Scanner(myInputFile);
   }
   ```

---

## Definition of 'Token'

Token is a word or letter that is surrounded by spaces. Take a look at the example below:

_input.txt:_

```
hi    hello     4
   test   73   5
3.9
true  l
```

The file above has a total of 9 tokens! Here are the 9 tokens:

1. `hi`
2. `hello`
3. `4`
4. `test`
5. `73`
6. `5`
7. `3.9`
8. `true`
9. `l`

> A Scanner will read all the tokens from one line before moving to the next line

---

## Using a Scanner Object

To use a Scanner object, you can use the Scanner methods that you have previously learned! Here are the Scanner methods you can use:

1. `.next()` takes in a token as a String
2. `.nextLine()` takes in one line
3. `.nextInt()` takes in a token as an `int`
4. `.nextDouble()` takes in a token as a `double`

> Note that if you try to take a non-number token using `.nextInt()` or `.nextDouble()`, you will get an error when you run your code!

> You can take a number token with .next()!

_input.txt:_

```
hi    hello     4
   test   73   5
3.9
true  l
```

_Code:_

```java
String inputFileName = "input.txt";
File myInputFile = new File(inputFileName);

Scanner myInputScanner = new Scanner(myInputFile);

// Read the lines and tokens below
String myFirstLine = myInputScanner.nextLine();

String token1 = myInputScanner.next();
String token2 = myInputScanner.next();
int token3 = myInputScanner.nextInt();

double token4 = myInputScanner.nextDouble();

String token5 = myInputScanner.next();
String token6 = myInputScanner.next();

// Print all the lines and tokens below
System.out.println(myFirstLine);
System.out.println(token1);
System.out.println(token2);
System.out.println(token3);
System.out.println(token4);
System.out.println(token5);
System.out.println(token6);
```

_Output:_

```
hi    hello     4
test
73
5
3.9
true
l
```

---

## Checking File Existence

When you are declaring your File object, you can check whether the file exist or not using the method `.exist()`

_For example:_

```java
File myFileObject = new File("mynotes.txt");
boolean existOrNot = myFileObject.exist();

System.out.println(existOrNot);
```

_Output:_

If _mynotes.txt_ exist in the same folder:

```
true
```

If _mynotes.txt_ **does not** exist in the same folder:

```
false
```

---

You could create a code that keep asking the user for a new file name if the file does not exist (**Needed for A6**), using the following _pseduocode_:

```
String fileName = ask the user for a file name
File inputFile = make the file object from the file name

while (file does not exist) {
   fileName = ask the user for another file name
   inputFile = update the file object using the new file name
}
```

_In code:_

```java
Scanner console = new Scanner(System.in);

System.out.print("Input file name?");
String fileName = console.nextLine();
File inputFile = new File(fileName);

while (!inputFile.exist()) {
   System.out.print("Try again. Input file name?");
   fileName = console.nextLine();
   inputFile = new File(fileName);
}

```

> **Note:** `while (!inputFile.exist())` is equivalent to: `while (inputFile.exist() == false)`

> **Note II:** `.exist()` can only be used on the File object (it cannot be used on a String)

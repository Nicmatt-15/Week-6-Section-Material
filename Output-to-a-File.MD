# Output to a File

## Table of Content

- [Creating a PrintStream Object](#creating-a-printstream-object)
- [Using a PrintStream Object](#using-a-printstream-object)

---

## Creating a PrintStream Object

In order to produce your output to a file, you have to declare a PrintStream object using the steps below:

1. import `java.io.*;`

   ```java
   import java.io.*;
   ```

2. Decide and save your output file name as a String

   ```java
   String myOutputFile = "blueberry.txt";
   ```

3. Declare your PrintStream object using your file name

   ```java
   String myOutputFile = "blueberry.txt";
   PrintStream myPrintStream = new PrintStream(myOutputFile);
   ```

   > If your output file hasn't existed yet, Java will automatically create it for you. If your output file already exists, java will re-write the content of your output file (you will lose the original content of your output file)!

4. Add `throws FileNotFoundException` to the method header where you declare your PrintStream object. For example, if you declare your PrintStream in the main method:

   ```java
   public static void main(String[] args) throws FileNotFoundException {
       String myOutputFile = "blueberry.txt";
       PrintStream myPrintStream = new PrintStream(myOutputFile);
   }
   ```

---

## Using a PrintStream Object

You can use a PrintStream object similar to `System.out.println(...)`. The only difference is instead of using `System.out`, you will use your PrintStream variable name.

_Example:_

```java
String myOutputFile = "blueberry.txt";
PrintStream myPrintStream = new PrintStream(myOutputFile);

myPrintStream.print("hello");
myPrintStream.println("hi");
myPrintStream.println("aloha");

System.out.println("hohoho");
```

_Output (in blueberry.txt):_

```
hellohi
aloha
```

_Output (in console):_

```
hohoho
```

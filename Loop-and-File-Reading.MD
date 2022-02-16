# Loop and File Reading

There are 3 general approach when we are trying to read file:

1. [Reading Token by Token](#reading-token-by-token)
2. [Reading Line by Line](#reading-line-by-line)
3. [Breaking Line into Token](#breaking-line-into-token)

---

## Reading Token by Token

_Pseudocode:_

```
while (there is more token to take) {
    take the token
}
```

_Code:_

```java
Scanner readFile = new Scanner("input.txt");

while (readFile.hasNext()) {
    String currentToken = readFile.next();
}
```

_input.txt:_

```
hi    hello     4
   test   73   5
3.9
true  l
```

_Output:_

```
hi
hello
4
test
73
5
3.9
true
l
```

> Remember that .`hasNext()` does not actually take the token! It only checks whether there is more token to take or not. If there is more token to take, it will return `true` and `false` if there is no more token to take (_end of the file_). `.next()` is the method that actually takes the token!

---

## Reading Line by Line

_Pseudocode:_

```
while (there is more line to take) {
    take the line
}
```

_Code:_

```java
Scanner readFile = new Scanner("input.txt");

while (readFile.hasNextLine()) {
    String currentLine = readFile.nextLine();

    System.out.println(currentLine);
}
```

_input.txt:_

```
hi    hello     4
   test   73   5
3.9
true  l
```

_Output:_

```
hi    hello     4
   test   73   5
3.9
true  l
```

> You should use `.nextLine()` to take one whole line instead of a token. You should pair this up with `.hasNextLine()`

> **Notice that this approach retains the format of the original text**

---

## Breaking Line into Token

_Pseudocode:_

```
while (there is more line to take) {
    take the line

    create a scanner to read the current line
    while (there is more token to take from the current line) {
        take the token
    }
}
```

_Code:_

```java
Scanner readFile = new Scanner("input.txt"); // Create File Scanner

while (readFile.hasNextLine()) {
    String currentLine = readFile.nextLine(); // Uses File Scanner to take the line
    System.out.println("Current line: " + currentLine);

    Scanner readLine = new Scanner(currentLine); // Create String Scanner
    while (readLine.hasNext()) {
        String currentToken = readLine.next(); // Uses String Scanner to take the token
        System.out.println("Current token: " + currentToken);
    }

    System.out.println();
}
```

_input.txt:_

```
hi    hello     4
   test   73   5
3.9
true  l
```

_Output:_

```
Current line: hi    hello     4
Current token: hi
Current token: hello
Current token: 4

Current line:    test   73   5
Current token: test
Current token: 73
Current token: 5

Current line: 3.9
Current token: 3.9

Current line: true  l
Current token: true
Current token: l
```

> Notice that we are using a new kind of Scanner here. We are using a Scanner that reads from a String. This helps us read each token in a line / String.

> **This approach, when done properly, would allow you to have access to each individual token without altering the format of the input text.**

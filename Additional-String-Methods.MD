# Additional String Methods.MD

## Table of Content

- [String Method `.endsWith(...)`](#string-method-endswith)
- [String Method `.replace(...)`](#string-method-replace)
- [String Method `.equalsIgnoreCase(...)`](#string-method-equalsignorecase)
- [String Method `.substring(...)`](#string-method-substring)

---

## String Method `.endsWith(...)`

The String Method `.endsWith(...)` takes in a letter or a phrase and returns true if your String **ends** with that letter or phrase.

_Example:_

```java
String input = "hello";
boolean endsWithO = input.endsWith("o");
System.out.println(endsWithO)
```

_Output:_

```
true
```

_Example II :_

```java
String input = "hello";
boolean endsWithOl= input.endsWith("ol");
System.out.println(endsWithOl);
```

_Output:_

```
false
```

---

## String Method `.replace(...)`

The String method `.replace(...)` gives back **a copy** of your String with some letters/phrases replaced by other letter/phrases.

_The String method `.replace(...)` takes in two String parameters:_

1. The letter/phrase you want replaced
2. The letter/phrase you use to replace with

_Example:_

```java
String input = "hellohiho";
String result = input.replace("h", "z");
System.out.println(result);
```

_Output:_

```
zellozizo
```

_Example II:_

```java
String input = "helhelohihehohe";
String result = input.replace("he", "ant");
System.out.println(result);
```

_Output:_

```
antlantlohianthoant
```

---

## String Method `.equalsIgnoreCase(...)`

The String method `.equalsIgnoreCase(...)` returns `true` or `false` by comparing whether the two String being compared reads the same text **without taking into account the casing**.

_Example:_

```java
String inputText = "heLlO";

boolean result1 = inputText.equalsIgnoreCase("HELLO");
boolean result2 = inputText.equalsIgnoreCase("hello");
boolean result3 = inputText.equalsIgnoreCase("aloha");
```

_Output:_

```
true
true
false
```

---

## String Method `.substring(...)`

The String method `.substring(...)` takes in a portion of your String. It requires two parameters:

1. The starting index of the portion you want to take (**inclusive**)
2. The ending index of the portion you want to take (**exclusive**)

_Example:_

```java
String inputText = "hello";
String somePortion = inputText.substring(1, 4);

System.out.println(somePortion);
```

_Output:_

```
ell
```

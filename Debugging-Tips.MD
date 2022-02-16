# Debugging Tips

This is a short guide on how to approach compiler error and runtime error.

---

## Definition

1. **Compiler Error** are errors due to syntax error that will emerge when you compile your code.

2. **Runtime Error** are errors due to logic flaw in your code. Your code may compile, but crash in the middle or produces unexpected output because of one or more logic flaw.

---

## Approaching Compiler Error

General steps on handling Compiler Error:

1. Click compile!
2. Read the error message!
3. Read where the error is happening (possibly a traceback call). In particular, you should find in which line specifically the error is getting triggered.
4. Compile your code after you fix one error message. Remember that fixing one error may resolve a few compiler error messages at the same time.

> If you do not understand an error message, your best solution is to google what the error message means. Most of the time, you will find the answer in a forum called StackOverflow.

> More details about compiler error can be found here:
> https://github.com/Nicmatt-15/Week-1-Section-Material/blob/main/Compiler%20Error.MD

---

## Approaching Runtime Error

1. If it is a runtime error / unexpected output, make an assumption
   first as to where the problem might stem from (which method)
2. Make assumption in that method as to which part might be faulty
3. Use println to confirm the place where your code may go wrong
4. You may also find that you can print important information using println to check if your variable values are as what you would expect

> The term _"println debugging"_ is used to describe a debugging techinique of printing output in different parts of the code to check if each part of the code is working as expected.

> _println debugging_ is extremely useful to check for:
>
> 1.  infinite loop
> 2.  not entering a part of your program (loop, if/else > check, method call, etc)
> 3.  checking if your variable is not being updated properly

# Keyword Project

In the Java programming language, a **keyword** is one of **53** reserved words that have a predefined meaning in the language.

___
## Lecture

### Keyword
**Keyword** is a reserved word programmer cannot use as name for *Variables*, *Methods*, *Class* or as any other *Identifier* 

Example: `String` , `int` , `double`

> **Note**
> 
> In the Java programming language have **53** reserved words.

### Expression
An **expression** is a series of **variables**, **operators** and **method calls** that evaluates to a single value.

_Example_
```java
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);
    }
```

As example from above we can explain about expression like this
1. `double kilometers = (100 * 1.609344);` is a **Statement**
2. `kilometers = (100 * 1.609344)` is an **Expression**
3. `double` is a **Data Type**
4. `*` is a **Operator**
5. `100` and `1.609344` are **Operands**

Question: In the following code what parts of the code are expression.
```java
        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }
```

**Answer**: 
1. `score = 100`
2. `score > 99`
3. `"You got the high score!"`
4. `score = 0`

### Statement
Java statements are instruction that tell programming language what to do, like declaration and string statements.

Basic statements define variables, initiate methods or start the execution of blocks

**Synopsis**
```java
        if (condition) {
            // if statement (block)
        } else {
            // else statement (block)
        }
```

_Example_
```java
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        
        System.out.println("This is "
                + " another"
                + " still more");
```

We recommended to write code like this
```java
    int myVariable = 50;
    System.out.println("This is another one");

    if (myVariable == 50) {
        System.out.println("Printed");
    }
```
1. Just once space is enough.
2. 1 line -> 1 statement.
3. Make sure you have indent in block of code.

> **Note 1 DON'T DO THIS**
> 
> You can do more than one statement in one line like this
> 
> ```java
>       int anotherVariable = 50;myVariable--;
> ```
> 
> but **NOT RECOMMENDED IT** because it too difficult when we read it.

> **Note 2 DON'T DO THIS**
> 
> Also you can press more blank space too 
> ```java
>       int             myVariable
>              =
>              50
>              ;
> ```
> but **NOT RECOMMENDED IT** because it too difficult when we read it.

> **Note 3 DON'T DO THIS**
> 
> You can customize your indent of code
> ```java
>       if (myVariable == 50) {
>       System.out.println("Printed");
>       }
> ```
> but **NOT RECOMMENDED IT** because it too difficult when we read it.

Anyway as all of note and recommendation from above are **Best Practice** you should know.

But today we have many tools like Intellij or Visual Studio Code. They have function to **reformat** your code for make it pretty and read easier.

### If-Else
The `if` statement identifies which statement or code block to run based on the value of an expression. In other words based on specific condition

Inside the code block defined by curly braces **{** and **}** we can have one or multiple statement

**If then Else** actually know as **if-else** statement it mean code will execute when condition in `if` is true will do statement in `if` code block, And when is false will do statement in `else` code block

_Example 1_
```java
        int score = 5000;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        } else {
            System.out.println("Got there");
        }
```

> **Note**
> 
> We can use the `else` statement after the `if` only

_Example 2_
```java
        int score = 100;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got there");
        }
```

> **Note**
> 
> We can also add `else if` to add condition of `else`

Best practice for write `if` or `if-else` is using block code `{}` even you have only 1 statements because it makes the code clearer and easy to understand

_Example_
```java
        if (score == 5000) {
            System.out.println("Your score was 5000");
        }
```

### Code Block
A **Code block** is a lexical structure of source code which is grouped together. 

_Example_
```java
    int num1 = 10;

    if (num1 == 10) {
        int numSum = num1 + 10;
    }

    System.out.println("numSum = " + numSum);
```

As example from above it will be error. Because out of if code block print `numSum` but their is in `if` block code, So outside of block doesn't know what variable is name `numSum` 

But in `if` block code they know `num1` because is in they scope.

> **Note**
> 
> Inside the **Code block** can understand all variable inside or outside code block 
> 
> Outside **Code block** not understand variable inside another code block

___ 
## Summary
1. Not do more than one **statement** in 1 line of code.
2. Not make too much space in **statement** because it too difficult to read.

___
## Reference
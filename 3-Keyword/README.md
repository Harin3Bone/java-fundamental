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

> **Note 1 DO NOT WRITE MORE THAN ONE STATEMENT IN ONE LINE**
> 
> You can do more than one statement in one line like this
> 
> ```java
>       int anotherVariable = 50;myVariable--;
> ```
> 
> but **NOT RECOMMENDED IT** because it too difficult when we read it.

> **Note 2 DO NOT PRESS TOO MUCH SPACES**
> 
> Also you can press more blank space too 
> ```java
>       int             myVariable
>              =
>              50
>              ;
> ```
> but **NOT RECOMMENDED IT** because it too difficult when we read it.

> **Note 3 DO NOT INDENT SAME POSITION OF BRACE**
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

### Methods
A concept of **Methods** is collect duplicate code into once function (method) for make your code cleaner

_Example_
```java
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelComplete = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelComplete, bonus);
    }

    public static void calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
```

> **Note**
> 
> You can call method and parse parameter without declaration too by send literal value to them
> 
> ```java
>     public static void main(String[] args) {
>        calculateScore(true, 10_000, 8, 200);
>    }
> ```
> 

As if from example is not return anything but if you have to just declaration data type what you want to return

_Example_
```java
    public static void main(String[] args) {
        int finalScore = calculateScoreRet(true, 20_000, 2, 200);
        System.out.println("Return finalScore is = " + finalScore);
    }

    public static int calculateScoreRet(boolean gameOver, int score, int levelComplete, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            return finalScore;
        }
        
        return -1;
    }
```

> **Note**
> 
> When you not return value use **void** to tell method not return anything

> **Note**
> 
> One final point, In programming terms when return **negative one** is conventionally used to indicate an error.
> 
> In algorithms **negative one** indicates an **Invalid value** or **Value not found**

Actually if you can do, Should make method `return` one statement like this

_Example_
```java
    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
```

Because it make code in method clearer than have more than one `return`

### Overloading
**Method Overloading** is a feature that allow us to have more than one method with the same name, as we use **different parameters**

```java
    public static int calculateScore(String playerName, int score) {
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return score * 1000;
    }

    public static int calculateScore() {
        return 0;
    }
```

It is the ability to create multiple methods of the same name with different implementation.

In addition it improve your code readability, reusability, easier to remember by same name just only different parameters and make programing flexibility to call a similar methods.

> **Note**
> 
> If you changed only return type that is not **Method Overloading**
 
___ 
## Summary
1. Not do more than one **statement** in 1 line of code.
2. Not make too much space in **statement** because it too difficult to read.
3. Even have 1 statement in `if` but you should create `{}` to make it read easier.
4. Method can return value as **data type** you specified, When you not want to use **void** to tell them not return
5. When return `-1` in terms of programming is mean **Invalid value** or **Value not found**
6. **Method Overloading** is a ability to create multiple methods with same name as we use **different parameters**

___
## Reference
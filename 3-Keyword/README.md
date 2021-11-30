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

___ 
## Summary
1. Not do more than one **statement** in 1 line of code.
2. Not make too much space in **statement** because it too difficult to read.

___
## Reference
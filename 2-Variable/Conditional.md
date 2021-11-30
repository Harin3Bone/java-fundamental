# Conditional Section

## Theory

### If-Then Statement
The **if-then** statement is the most basic of all the control flow statements. It tells your program to execute section of code only if a particular test evaluates to **true**

This is known as **conditional logic**

### Ternary Operator
**Ternary Operator** is a shortcut to assigning one of two values to a variable depending on a given condition.

___
## Usage

### if-then
_Example 1_ `if` statement without parentheses `{}`
```java
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) 
            System.out.println("It's not an Alien!");
    }
```

_Example 2_ `if` statement with parentheses `{}`
```java
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It's not an Alien!");
            System.out.println("Absolutely NOT!");
        }
    }
```

> **Note**
> 
> Instead of using the `if` statement, we should instead use a **code block**
> 
> Because a **code block** allows more than one statement to be executed.

_Example 3_ Check is **true** you can do like this
```java
    public static void main(String[] args) {
        boolean isAlien = true;
        if (isAlien) {
            System.out.println("I am Alien!");
            System.out.println("I told YES!");
        }
    }
```

Anyway you can use `if (isAlien)` to check is it **true** opposite that, You can use `if (!isAlien)` to check **false** as well. like this

_Example 4_ Check is **false**
```java
    public static void main(String[] args) {
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It's not an Alien!");
            System.out.println("Absolutely NOT!");
        }
    }
```

### Ternary Operator
It's a shortcut of `if-then-else` statement

_Example 1_
```java
    public static void main(String[] args) { 
        boolean wasCar = isCar ? true : false;
    }
```

_Example 2_
```java
    public static void main(String[] args) {
        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
    }
```

As an example from above we can explain

1. Operand One - **ageOFClient == 20** is the condition we are checking. It needs to return **true** or **false**
2. Operand Two - **true** here is the value to assign to the variable **isEighteenOrOver** if the condition is **true**
3. Operand Three - **false** here is the value to assign to the variable **isEighteenOrOver** if the condition is **false**
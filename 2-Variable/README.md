# Variable Project

Variable are a way to store information in our computer. 

Variables that we define in a program can be accessed by a name we give them, and the computer will figuring out where they get stored in the computers RAM

> **Note**
> 
> A variable as the name suggest can be changed, in other words, it's contents are variable.
___
## Lecture

### Packages
A `package` is a way to organize your Java project. For now consider them as folders. Companies use their domain names reversed.

### Declaration Statement
Used to define a variable by indicating the data type and the name and optionally to set the variable to a certain value.

**Example**
```java
public class Variable {

    public static void main(String[] args) {
        int myFirstNumber = 5;
    }
}
```
> **Note**
> 
> The data type is `int`
> 
> The name is `myFirstNumber`
> 
> The value is `5`


### Expression
This is a construct that evaluates to a single value

**Example**
```java
public class Expression {

    public static void main(String[] args) {
        int mySecondNumber = 12;
        int myThirdNumber = 6;

        int myTotal = mySecondNumber + myThirdNumber;
    }
}
```

### String Literal
Any sequence of characters surrounded by double quotes is a **String Literal** in Java. It's value cannot be changed, unlike variable.

### Java Operators
**Java Operators** also just call **Operators** perform an operation (hence the word) on a variable or value.

> **Note**
> 
> Four common type include + , - , * , /
> 
> `+` = plus
> 
> `-` = subtract
> 
> `*` = multiply
> 
> `/` = divide

### Final Variable
The `final` is an Java keyword that when declaration to variable, The variable will cannot be changed value anymore after assigned.

**Example**
```java
public class Variable {

    public static void main(String[] args) {
        final int myLastOne = 1000;
    }
}
```

### Primitive Types
In Java primitive types are the most basic data types. The `int` is 1 of 8 primitive types.

_List of Primitive Types_
1. boolean
2. byte
3. char
4. short
5. int 
6. long
7. float
8. double

[Read More](https://github.com/Harin3Bone/java-fundamental/tree/learn/2-Variable/Primitive.md)

### Wrapper Classes
Java uses the concept of a Wrapper class for all 8 `Primitive types`

In case of an `int` we can use `Integer` and by doing that gives us ways to perform operations on an `int`

```java
public class ByteShortIntLong {

    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
    }
}        
```
In this case, we are using **MIN_VALUE** and **MAX_VALUE** to get Java to tell us the minimum and maximum ranges of numbers that can be stored.

### Overflow and Underflow
If you try and put a value larger than the maximum value in Java, or a value smaller than the minimum value in Java

The computer just skips back to the minimum number or the maximum number, which is usually not what you want. It's an important concept to be aware of.

> **Note**
> 
> You will get **Overflow** in the case larger of the maximum value
> 
> You will get **Underflow** in the case smaller of the minimum value

### Casting
Casting means to treat or convert a number from one type to another. We put the type we want the number to be in parenthesis like this.

_Example_
```java
public class ByteShortIntLong {

    public static void main(String[] args) {
        byte myNewByteValue = (byte) (myMinByteValue / 2);
    }
}
```
> **Note**
> 
> The **Number Types** in Java are use `int` by default. Then we recommended to always use `int` unless you've got a reason for not to do that
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

### Literal String
Any sequence of characters surrounded by double quotes is a **String Literal** in Java. It's value cannot be changed, unlike variable.

_Example_
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

### Literal Char
The `char` concept is just like `String` you can store any character, letter or number and other character like and exclamation mark ,question mark, hash, at sign ,etc. 

`char` can only store a **single character**

_Example_
```java
package primitive;

public class CharBoolean {

    public static void main(String[] args) {
        char myChar = 'H';
    }
}
```

> **Note**
> 
> The `char` have been useful to store the last key and other scenarios where you're just wanting to keep the last key pressed or just the last single digit that's been used in a menu option or something along those lines.
> 
> Now `char` were much more relevant when Java was released in the late 1990s for saving much of memory. But these days we don't need it anymore.

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

[Read more](https://github.com/Harin3Bone/java-fundamental/tree/learn/2-Variable/Primitive.md)

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

### Boolean
A `boolean` value of logical allows for two choices 

- **True** or **False** 
- **Yes** or **No** 
- **1** or **0**

[Read more](https://github.com/Harin3Bone/java-fundamental/tree/learn/2-Variable/Primitive.md)

___ 
## Summary
1. `String` use **double quotes (")** to define
2. `char` use **single quote (')** to define
3. `char` can only store 1 character.
4. Number Types in Java use `int` by default.
5. Recommended to always use `int` unless you've got a reason for not to do that.
6. Number Types with floating point in Java use `double` by default.
7. Recommended to use `double` for most calculations When you have to use precision of a floating point.
8. Not recommended to use casting in `float` and `double`
9. For an advance calculation recommended to use class `BigDecimal` 
10. In terms of Java `boolean` is primitive type and it can be set to 2 value only **True** or **False**
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

[Read more](https://github.com/Harin3Bone/java-fundamental/tree/learn/2-Variable/String.md)

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

### Operator, Operand and Expression
**Operators** in Java are special symbols that perform specific operations on one, two or three operands, and then return a result.

**Operands** is a term used to describe any object that is manipulated by an **operator**. If we consider this statement

**Expression** is formed by combining variables, literals, method return values and operators.

[Read more](https://github.com/Harin3Bone/java-fundamental/tree/learn/2-Variable/Operator.md)

### Abbreviate Operator
**Abbreviate Operator** is a short hand of syntax

| Abbreviate | Short hand | Explain |
|:-----------|:-----------|--------:|
|Plus one (after)|result++|result = result + 1|
|Subtract one (after)|result--|result = result -1|
|Plus one (before)|++result|result = result + 1|
|Subtract one (before)|--result|result = result -1|
|Plus value|result += `value`|result = result + `value`|
|Subtract value|result -= `value`|result = result - `value`|
|Multiply value|result *= `value`|result = result * `value`|
|Divide value|result /= `value`|result = result / `value`|
|Modular value|result %= `value`|result = result % `value`|

[Read more](https://github.com/Harin3Bone/java-fundamental/tree/learn/2-Variable/Operator.md)

### Comment
**Comment** are ignored by the computer and are added to a program to help describe something to make human known it.

We use `//` in front of any code, or on a blank line. Anything after `//` right through to the end of line is ignored by computer

_Example_
```java
public class Operator {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
    }
}
```

By the way you can use `/* */` to create comment block like this
```java
public class Variable {
      public static void main(String[] args) {
          int myFirstIntValue = 1;
          int mySecondIntValue = 2;
          /*
          System.out.println(myFirstIntValue);
          System.out.println(mySecondIntValue);
          System.out.println(myFirstIntValue + mySecondIntValue);
          */
      }
}
```
Fortunately of **IDE** and **Text Editor** just now we can use their shortcut to comment easier

### Conditional
**Conditional logic** uses specific statements in Java to allow us to check a condition and execute certain code based on whether that condition (the expression) is **true** or **false**

[Read more](https://github.com/Harin3Bone/java-fundamental/tree/learn/2-Variable/Conditional.md)

### Truth Table
| Expression | Result |
|:-----------|:------:|
| T && T | T |
| F \|\| F | F |
| !T | F |
| !F | T |

> **Note**
> 
> T = `True`
> 
> F = `False`
> 
> && = `AND`
> 
> || = `OR`
> 
> ! = `NOT`

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
11. Common primitive type will be `int`, `double` and `boolean`, Sometime maybe use `long` and `char`. 
12. About `short`, `float` and `byte` are hardly to use anymore.
13. `String` in Java are **immutable**
14. Recommended to use `if` statement with **code block**

___
## Reference
[Summary of Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)

[Precedence Operators](http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html)
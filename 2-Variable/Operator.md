# Operator Section

## Theory
### Operator
**Operators** in Java are special symbols that perform specific operations on one, two or three operands, and then return a result.

_Example_
```java
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
```

_List of operators_

**1.Arithmetic Operators**

| List | Operator | Explain |
|:----:|:--------:|--------:|
|1|=|Assigned|
|2|+|Plus/Additional|
|3|-|Minus/Subtract|
|4|*|Multiply|
|5|/|Divide|
|6|%|Modular|

**2.Unary Operators**

| List | Operator | Explain |
|:----:|:--------:|--------:|
|1|+|Unary plus (Indicates positive value)|
|2|-|Unary minus (Negates an expression)|
|3|++|Increment value by 1|
|4|--|Decrement value by 1|
|5|!|Invert value of boolean|

**3.Equality & Relational Operators**

| List | Operator | Explain |
|:----:|:--------:|--------:|
|1|==|Is Equal|
|2|!=|Not Equal to|
|3|>|Greater than|
|4|<|Less than|
|5|>=|Greater than or Equal|
|6|<=|Less than or Equal|

**4.Conditional Operators**

| List | Operator | Explain |
|:----:|:--------:|--------:|
|1|&&|AND|
|2|\|\||OR|
|3|!|NOT|

**5.Type Comparison Operator**

| List | Operator | Explain |
|:----:|:--------:|--------:|
|1|`instance of`|Compare an object to specified type|

**6.Bitwise & Bit Shift Operators**

| List | Operator | Explain |
|:----:|:--------:|--------:|
|1|-|Unary bitwise complement|
|2|<<|Signed left shift|
|3|>>|Signed right shift|
|4|>>>|Unsigned right shift|
|5|&|Bitwise AND|
|6|\||Bitwise exclusive OR|
|7|^|Bitwise inclusive OR|

### Operand
**Operands** is a term used to describe any object that is manipulated by an **operator**. If we consider this statement

_Example 1_
```java
        int myVar = 15 + 12;
```
`+` is the **Operator**
`15` and `12` are the **Operands**

_Example 2_
```java
        double mySalary = hoursWorked * hourlyRate;
```
`*` is the **Operator**
`hoursWorked` and `hourlyRate` are the **Operands**

### Expression
An **Expression** is formed by combining variables, literals, method return values and operators.

_Example_
```java
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = mySecondNumber + myThirdNumber;
```
`mySecondNumber + myThirdNumber` is the **Expression**

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

### Logical AND & Logical OR
The **AND** operator comes in two flavors in Java, as does the **OR** operator.

`&&` is the Logical **AND** which operates on `boolean` operands
`||` is the Logical **OR** which operates on `boolean` operands too.

These 2 are checking if a given condition is **true** or **false**

> **Note**
> 
> You will almost always want to be doing this. The `&` and `|` are bitwise operator working at the bit level. This is an advanced concept that we won't get into here

### NOT Operator
The `!` or **NOT** Operator is also known as the Logical complement operator

For use with `boolean` it tests the alternative value 

_Example_
```java
    if (isCar) {}
```
From example it tests for **true**

_Example_
```java
    if (!isCar) {}
```
By the way when adding `!` operator it will check the opposite Is it **false** in this case

### Truth Table
| Expression | Result |
|:-----------|:------:|
| T **AND** T | T |
| F **OR** F | F |
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

### Precedence Operators
| Ranking | Operators | Precedence | Associativity |
|:-------:|:----------|:-----------|--------------:|
|1|Parentheses <br> Array subscript <br> Member Selection|`()` , `[]` , `'`|Left > Right|
|2|Postfix|`expr++` , `expr--`|Right > Left|
|3|Unary|`++expr` , `--expr` , <br> `+expr` , `-expr` , <br> `~` , `!`|Right > Left|
|4|Multiplicative|`*` , `/` , `%`|Left > Right|
|5|Additive|`+` , `-`|Left > Right|
|6|Shift|`<<` , `>>` , `>>>`|Left > Right|
|7|Relational|`<` , `>` , <br> `<=` , `>=` , <br> `instance of`|Left > Right|
|8|Equality|`==` , `!=`|Left > Right|
|9|Bitwise AND|`&`|Left > Right|
|10|Bitwise exclusive OR|`^`|Left > Right|
|11|Bitwise inclusive OR|`\|`|Left > Right|
|12|Logical AND|`&&`|Left > Right|
|13|Logical OR|`\|\|`|Left > Right|
|14|Ternary|`? :`|Right > Left|
|15|Assignment|`=` , `+=` , `-=` , `*=` , <br> `/=` , `%=` , `&=` , `^=`, <br> `!=` , `<<=` , `>>=` , `>>>=`|Right > Left|

___
## Usage

### Equal
`Equal` operator or `=` is an **assignment** operator. So it's used to assign of value. 

_Example_
```java
    public static void main(String[] args) {
        int result = 3;
    }
```

In this case is assigned what's on the right hand side `1+2` To the variable we've called `result`

### Addition
`Plus` or `+` is an **addition** operator. It can use to append `String` and add number 

_Example_
```java
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
    }
```

_Result_
```bash
1 + 2 = 3
```

### Minus / Subtract
`Minus` or `-` is an **subtract** operator. Used to subtract value.

_Example_
```java
    public static void main(String[] args) {
        int result = 3 - 1;
        System.out.println("3 - 1 = " + result);
    }
```

_Result_
```bash
3 - 1 = 2
```

### Multiply
`Asterisk` or `*` is an **subtract** operator. Used to subtract value.

_Example_
```java
    public static void main(String[] args) {
        int result = 2 * 10;
        System.out.println("2 * 10 =" + result);
    }
```

_Result_
```bash
2 * 10 = 20
```

### Divide
`Slash` or `/` is an **divide** operator. Used to divide value.

_Example_
```java
    public static void main(String[] args) {
        int result = 20 / 5;
        System.out.println("20 / 5 = " + result);
    }
```

_Result_
```bash
20 / 5 = 4
```

### Modular
`Percent` or `%` is an **modular** operator. Used to remainder of value.

_Example_
```java
    public static void main(String[] args) {
        int result = 4 % 3;
        System.out.println("4 % 3 = " + result);
    }
```

_Result_
```bash
4 % 3 = 1
```

### Additional One
Use `++` sign in variable

_Example 1_ use `++` behind variable
```java
    public static void main(String[] args) {
        int result = 6;
        System.out.println("Current result = " + result);
        System.out.println("Addition after print = " + (result++));
        System.out.println("Current result = " + result);
    }
```
_Result 1_
```console
Current result = 6
Addition after print = 6
Current result = 8
```

_Example 2_ use `++` in front of variable
```java
    public static void main(String[] args) {
        int result = 7;
        System.out.println("Current result = " + result);
        System.out.println("Addition before print = " + (result++));
        System.out.println("Current result = " + result);
    }
```
_Result 2_
```console
Current result = 7
Addition before print = 8
Current result = 8
```

### Subtract One
Use `--` sign in variable

_Example 1_ use `--` behind variable
```java
    public static void main(String[] args) {
        int result = 8;
        System.out.println("Current result = " + result);
        System.out.println("Subtract after print = " + (result--));
        System.out.println("Current result = " + result);
    }
```
_Result 1_
```console
Current result = 8
Subtract after print = 8
Current result = 7
```

_Example 2_ use `--` in front of variable
```java
    public static void main(String[] args) {
        int result = 7;
        System.out.println("Current result = " + result);
        System.out.println("Subtract before print = " + (--result));
        System.out.println("Current result = " + result);
    }
```
_Result 2_
```console
Current result = 7
Subtract before print = 6
Current result = 6
```

### Abbreviate Operator
Abbreviate operator are just a short hand syntax for operand value 

_Example 1_ Plus by value
```java
    public static void main(String[] args) {
        int result = 1;
        result += 2;
        System.out.println("Result = " + result);
    }
```
From example on above **result += 2** that's mean **result = result +2**

Actually you can use all of **arithmetic operator** in short hand like this.

### AND 
`AND` is an logical operator, You can use by `&&` in statement

_Example_
```java
    public static void main(String[] args) {
        int topScore = 100;
        int secondTopScore = 81;

        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
```

### OR 
`OR` is an logical operator, You can use by `||` in statement

_Example_
```java
    public static void main(String[] args) {
        int topScore = 100;
        int thirdTopScore = 81;

        if ((topScore > thirdTopScore) || (topScore < 100)) {
            System.out.println("Greater than third top score or less than 100");
        }
    }
```

### Equal 
`Equal` is an logical operator, You can use by `==` in statement

_Example_
```java
    public static void main(String[] args) {
        int topScore = 100;
        int thirdTopScore = 81;

        if ((topScore > thirdTopScore) || (topScore < 100)) {
            System.out.println("Greater than third top score or less than 100");
        }
    }
```
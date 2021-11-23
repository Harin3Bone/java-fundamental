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
| List | Operator | Explain |Describe|
|:----:|:--------:|--------:|-------:|
|1|=|Equal / Assigned|N/A|
|2|+|Plus/Additional|Arithmetic Operator|
|3|-|Minus/Subtract|Arithmetic Operator|
|4|*|Multiply|Arithmetic Operator|
|5|/|Divide|Arithmetic Operator|
|6|%|Modular|Arithmetic Operator|
|7|==|Is Equal|Logical Operator|
|8|&&|AND|Logical Operator|
|9|\|\||OR|Logical Operator|
|10|!|NOT|Logical Operator|

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
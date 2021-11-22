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

[Read more](https://github.com/Harin3Bone/java-fundamental/tree/learn/2-Variable/Operator.md)

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

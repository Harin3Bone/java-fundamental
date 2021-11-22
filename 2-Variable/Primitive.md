# Primitive Section

## Theory
### List of Primitive Types
1. boolean
2. byte
3. char
4. short
5. int 
6. long
7. float
8. double

### Size of Primitive Types
| Type | Size (bits) | Size (byte) |
|:----:|------------:|------------:|
|boolean|1|N/A|
|byte|8|1|
|char|16|2|
|short|16|2|
|int|32|4|
|long|64|8|
|float|32|4|
|double|64|8|

### Group of Primitive Types
1. Numbers Types
   1. Integer types
      - byte
      - short
      - int
      - long 
   2. Floating point types
      - float
      - double       
2. Booleans (boolean)
3. Characters (char)

> **Note 1**
> 
> The **Number Types** in Java are use `int` by default.

### Floating Point Number
Floating point numbers have fractional parts that we express with a decimal point example **3.14159**

Floating point numbers are also known as real numbers. We use a floating point number when we need more precision in calculation.

> **Note**
> 
> Floating point types can store **fractional numbers** by
> `float` store 3.4e-038 to 3.4e+0.38
> 
> `double` store 1.7e-308 to 1.7e+308

### Single and Double Precision
Precision refers to the format and amount of space occupied by the type. Single precision occupies **32 bits** and Double precision occupies **64 bits**

> **Note**
> 
> Floating point types can also be `scientific number` with an `e` to indicate the power of 10
> 
> ```java
> float f1 = 35e3f;
> double d1 = 12E4d;
> ```

### Floating Point Number Precision Tips
In general `float` and `double` are great for general floating point operations.

But both are not great to use where precise calculations are required

This is due to a limitation with how floating point numbers are stored and not a Java problem as such.

Java has a class called `BigDecimal` that overcomes this.

But for general calculations `float` and `double` are fine.

___
## Usage
### short
The `short` data type can store whole numbers from **-32768** to **32767**

_Example_
```java
public class ByteShortIntLong {

    public static void main(String[] args) {
        byte myByteValue = 127;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
    }
}
```

### int
The `int` data type can store whole numbers from **-2147483648** to **2147483647**

_Example_
```java
public class ByteShortIntLong {

    public static void main(String[] args) {
        int myVal = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
    }
}
```
### long
The `long` data type can store whole numbers from **-9223372036854775808** to **9223372036854775807**

_Example_
```java
public class ByteShortIntLong {

    public static void main(String[] args) {
        long myLongValue = 100;
        long bigLongLiteralValue = 2_147_483_648L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
    }
}
```

> **Note**
> 
> This is used when `int` is not large enough to store the value. That should end the value with `L`

### float
The `float` data type can store whole numbers from **1.4E-45** to **3.4028235E38**

_Example_
```java
public class FloatDouble {

    public static void main(String[] args) {
        float myFloatValue = 5.25f;
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
    }
}
```

### double
The `double` data type can store whole numbers from **1.4E-45** to **3.4028235E38**

_Example 1_
```java
public class FloatDouble {

    public static void main(String[] args) {
        double myDoubleValue = 5.25d;
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
    }
}
```

> **Note**
> 
> If you have to use precision of a floating point, Recommended to use `double` for most calculations

> **Note**
> 
> For `float` and `double` you can use casting instead of _f_ and _d_ like this 
> 
> ```java
> float myFloatValueCast = (float) 5.25;
> double myDoubleValueCast = (double) 5.25;        
> ```
> 
> but not recommended
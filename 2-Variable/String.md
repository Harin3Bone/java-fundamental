# String Section

## Theory 

### Explain
The `String` is a datatype in Java, which is not a primitive type. It's actually a **Class**, but it enjoys a bit of favoritism in Java to make it easier to use than a regular class.

### Definition
A `String` is a sequence of characters. In the case of the `char` which you can see above which we discuss, it could contain a **single character** only.

A `String` can contain a sequence of characters. A large number of characters. Technically it's limited by memory or the **MAX_VALUE** of an `int` which was **2.14 Billion**

### String in Java are Immutable
When I said you can delete characters out of a `String`, That's not strictly true. Because `String` in Java are **immutable**. That means you can't change a `String`  after it's created. Instead, what happens is a new `String` is created.

```java
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
```

So in this case of this code, **lastString** doesn't get appended the value **"120.47"** instead a new `String` is created which consists of the previous value of **lastString** plus a text representation of the double value **120.47**.

The net result is the same, **lastString** has the right values, however a new `String` got created and the old one got discarded.

___

## Usage

### String
The most popular way to define `String` is use **equal (=)** sign.

_Example_
```java
public class StringDataType {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println(myString);
    }
}
```

### Literal String
Any sequence of characters surrounded by double quotes is a **String Literal** in Java. It's value cannot be changed, unlike variable.

_Example_
```java
public class StringDataType {

    public static void main(String[] args) {
        System.out.println("StringDataType");
    }
}
```

### Append String
When you use **plus (+)** with `String` it will append value. Not calculate like a Number types. Because it's `String` after all.

_Example_
```java
public class StringDataType {

    public static void main(String[] args) {
        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println("numberString is equal to " + numberString);
    }
}
```
_Result_
```bash
numberString is equal to 250.5549.55
```

Even you try to plus `String` and `int` or `double` it will transform as `String` too.

_Example_
```java
public class StringDataType {

    public static void main(String[] args) {
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);

        double myDouble = 120.47d;
        lastString = lastString + myDouble;
        System.out.println("lastString is equal to " + lastString);
    }
}
```

_Result_
```bash
lastString is equal to 1050
lastString is equal to 1050120.47
```

> **Note**
> As a result of a `String` being created, appending value like this is inefficient and not recommended. The better way of doing it is `StringBuffer`
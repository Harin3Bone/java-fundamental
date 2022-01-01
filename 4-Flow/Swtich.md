# Switch Section

## Theory

### Explain
A **Switch** statement are allows a variable to be tested for equality against a list of values.

Each value is called a **Case**, and the variable being switched on is checked for each case.

> **Note**
> 
> Sometimes we called **Switch Case** statement but they are the same thing.

### Definition
A `Switch Case` statement it is like a `If-Else` but in a shortcut version

In `If-Else` you may be write code with this
```java
    int value = 3;

    if (value == 1) {
        System.out.println("Value was 1");
    } else if (value == 2) {
        System.out.println("Value was 2");
    } else {
        System.out.println("Value not was 1 or 2");
    }
```

But you can transform them into `Switch Case` like this
```java
    int switchValue = 1;

    switch (switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        default:
            System.out.println("Value not was 1 or 2");
            break;
    }
```

## Usage

### Syntax

```java
    switch(expression) {
        case value :
            // Statements
            break; // optional
        
        case value :
            // Statements
            break; // optional
        
        // You can have any number of case statements.
        default : // Optional
            // Statements
    }
```

`expression` is a variable in **Switch**

`value` is a **Case** of expression what they match. And when a `expression` match any `value` they will executed only `statement` of that **Case**

`default` is used for performing a task then non of `expression` does not match any `value` 

`break` is use for quit the loop of **Switch** after finished a `statement`

> **Note**
> `break` is your optional choice. You can use or not as you wish, But normally everyone use it

### Switch with Integer
A basic use case of **Switch** will use like this

_Example_
```java
    int switchValue = 1;

    switch (switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        default:
            System.out.println("Value not was 1 or 2");
            break;
    }
```

### Switch Case with same statement
If you want to use same `statement` but different `case` you can do like this

_Example_
```java
    char chara = 'D';

    switch (chara) {
        case 'C':
        case 'D':
        case 'E':
            System.out.println(chara + " was found.");
            break;
        default:
            System.out.println("Not found.");
            break;
    }
```

### Switch with String
For a **Java 7** or above you can use `String` and `char` in `expression`

_Example_
```java
    String switchValue = "Hi";

    switch (switchValue) {
        case "Hi":
            System.out.println("He/She say Hi");
            break;
        case "Hello":
            System.out.println("He/She say Hello");
            break;
        default:
            System.out.println("He/She not say Hi or Hello");
            break;
    }
```

### Switch with Object
A new feature of **Java 17** you can use `object` in `expression` too

_Example_
```java
    Shape shape = new Shape();
    switch (shape) {
        case Rectangle r: return 2 * r.length() + 2 * r.width();
        case Circle c:    return 2 * c.radius() * Math.PI;
        default:          throw new IllegalArgumentException("Unrecognized shape");
    }
```

And you can check `null` in **Case** too
```java
    switch (obj) {
        case null     -> System.out.println("null");
        case String s -> System.out.println("String");
        case Color c  -> System.out.println("Color with " + c.values().length + " values");
        case Point p  -> System.out.println("Record class: " + p.toString());
        case int[] ia -> System.out.println("Array of int values of length" + ia.length);
        default       -> System.out.println("Something else");
    }
```

# For Section

## Theory

### Explain
A **For** statement is loops to use when you need to repeatedly execute a block of statement.

### Definition
The **For** statement consumes the initialization, condition and increment or decrement in one line thereby providing a shorter, easy to debug structure of lopping

## Usage

### Syntax
```java
    for (init ; condition ; increment) {
        // statement
    }
```
or 
```java
    for (init ; condition ; decrement) {
        // statement
    }
```

`init` is your initial value of loop

`condition` is your condition to execute statement if it true

`increment` or `decrement` is mean the way you will exit loop

_Example_
```java
    for (int i = 0 ; i <= 3 ; i++) {
        System.out.println("i= " + i);
    }
```

_Result_
```bash
i= 0
i= 1
i= 2
i= 3
```

> **Note**
> 
> Whenever you use loop try not to do **Infinite Loop**

### Continue
In **For** statement you can use `continue` to make it skip to execute statement and then continue to do another loop like this

_Example_
```java
    for (int i = 0 ; i <= 3 ; i++) {
        if (i <= 1) {
            continue;
        }
        System.out.println("i= " + i);
    }
```

_Result_
```bash
i= 2
i= 3
```

### Break
In **For** statement you can use `break` like in `switch` statement to force it exit loop

_Example_
```java
    for (int i = 0 ; i <= 3 ; i++) {
        if (i > 1) {
            break;
        }
        System.out.println("i= " + i);
    }
```

_Result_
```bash
i= 0
i= 1
```
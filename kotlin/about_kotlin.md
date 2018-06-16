# What is Kotlin?

- A JVM language (compiles to Java bytecode; runs on the Java Virtual Machine)
- Has support for JavaScript (write Kotlin code and generate JavaScript code)

# Fundamentals

```kotlin
//Kotlin
fun main(args: Array<String>) {
    println("Hello, World!")
}
```

```java
//Java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.prntln("Hello, World!");
    }
}
```

- If there are no classes, Kotlin compiler generates the class.
- The name of the class follows the name of the file.
- The `println()` function calls `System.out.println()` internally.


# Variables

1. `val` is immutable; read-only; like `final` in Java
2. `var` is mutable

```kotlin
val x = 1 // Int is inferred
x = 2 // compilatin error: x cannot be reassigned

var y = 2
y = 3 //y can be reassigned
```

```
Data Type   |  Example                                  | Description               |
----------- | ----------------------------------------- | ------------------------- |
Int         |  var x: Int = 20                          |                           |
Float       |  var pi: Float = 3.142                    |                           |
Double      |  var pi: Double = 3.142                   |                           |
Boolean     |  var isHappy = true                       |                           |
String      |  val idiom = "in a nutshell"              | sequence of characters    |
Char        |  val letter: Char = 'A'                   |                           |
Array       |  val days arrayOf("Mon", "Tue", "Wed")    |                           |
```


# About Kotlin

- A JVM language (compiles to Java bytecode; runs on the Java Virtual Machine)
- Has support for JavaScript (write Kotlin code and generate JavaScript code)

## Fundamentals

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

## Variables

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

## Null Safety

> In Kotlin, we need to explicitly specify that something is nullable

```kotlin
var thisVariableIsNullSafe: String = "Null safe"
thisVariableIsNullSafe = null //compilation error

println("String length i{thisVariableIsNullSafe.length}" //ok

var thisVariableCanBeNull: String? = "This can be initialized to null"
thisVariableCanBeNull = null //ok

println(thisVariableCanBeNull.length) // compilation error
```

More information about null safety [here](https://kotlinlang.org/docs/reference/null-safety.html)

## String Template

- The results of the template expressions are concatenated into the string

```kotlin
val question = "What is the answer to life, the universe and everything?"
val aNumber = 42
val answer = "the answer to life, the universe and everything is $aNumber"

println(answer)
```

The Output:

```kotlin
The answer to life, the universe and everything is 42
```

- Concatenation using `+`

```kotlin
val aNumber = 42
println("The number is " + aNumber)
```

**Note that in most cases using string templates or raw strings is preferable to string concatenation.

## If Expression

- `expression` returns a value
- no need for ternary operations

```kotlin
val taskDone = true
val remarks = if (taskDone) "Great!" else "Keep it up!"
println(remarks)
```

More information about control flow [here](https://kotlinlang.org/docs/reference/control-flow.html)

## When Expression 

- `when` in kotlin; `switch` in Java

```kotlin
val day = "Monday"
val quoteOfTheDay = when(day) {
  "Monday" -> "But, I wasn’t even finished with Saturday yet.."
  "Tuesday" -> "It's CHOOSE-DAY! Choose to be You"
  "Wednesday" -> "Halfway to the weekend!"
  "Thursday" -> "It's almost Friday!"
  "Friday" -> "Happy Fri-yay!"
  else -> "Yey! Weekend!"
}

println("$day?! $quoteOfTheDay")
```

More information about control flow [here](https://kotlinlang.org/docs/reference/control-flow.html)

## Anko

- a Kotlin library for Android Application development

- download Anko dependencies via gradle

More information here: https://github.com/Kotlin/anko


# Kotlin Basics

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

## If expression

- `expression` returns a value
- no need for ternary operations

```kotlin
val taskDone = true
val remarks = if (taskDone) "Great!" else "Keep it up!"
println(remarks)
```

More information about control flow [here](https://kotlinlang.org/docs/reference/control-flow.html)

## When expression

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

# String Template

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
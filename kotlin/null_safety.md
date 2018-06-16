### Null Safety {docsify-ignore-all}

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

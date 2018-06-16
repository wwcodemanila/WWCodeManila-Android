# When Expression 

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

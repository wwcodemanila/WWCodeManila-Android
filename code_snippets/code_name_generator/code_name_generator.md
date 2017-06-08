# Logs
```java
Log.d(“TAG”, “Message”);

* V — Verbose (lowest priority) 
* D — Debug 
* I — Info 
* W — Warning 
* E — Error 
* A — Assert 
```
1. Go to MainActivity.java
2. onCreate, add message log, “Hello from onCreate!”
3. Search for your logs in activity monitor.

## Click Me!
1. On activity_main.xml, add a Button.
2. Create a method for onClick
3. Add some logs.

# TOAST
4 Things we need to make a toast:
1. The context (where the TOAST should appear? To let it appear on the Main Activity, we could use MainActivity.this to get the context)
2. The message we want to appear when we do the TOAST
3. The length the TOAST would appear (short appearance or long appearance?)
4. show()

```java
Toast.make(MainActivity.this, “Hello World!”, Toast.LENGTH_LONG).show();
```
## Click Me with a TOAST!
1. onClick method, add the TOAST message, “Click Me with a TOAST!”

# EditText
How to get the value of EditText? We need to assign an ID to the View in activity_main.xml.

```java
EditText editText = (EditText) findViewById(R.id.nameEditText);
String name = editText.getText().toString(); 
```

## Let’s Toast to that!
1. Add an Edit Text and a Button.
2. Make user name appear on the TOAST!
3. Say, “Hello, User Name!”

# TextView
How to change the value of TextView? We need to assign an ID to the View in activity_main.xml.

```java
TextView textView = (TextView) findViewById(R.id.codeNameTextView);
textView.setText(“My Code Name”);
```

# Code Name Generator Challenge:
1. Add a TextView: “What’s your Code Name?”
2. Add another TextView: “Code Name”
3. Add an EditText for user to enter name.
4. Add a Generate Button.
5. Refer to Code Generator snippet. [gitlab](https://gitlab.com/wwcodemanila/WWCodeManila-Android/blob/master/code_snippets/Code%20Name%20Generator/MainActivity.java)
6. Add a Toast "Hello, Code Name!"
7. Change the value of the TextView to display the generated code name.

# More Challenge
1. Initialize the value of the Code Name Text View to a random code name.
2. Make "Name" a required field and display an error message when user didn't enter a name.
4. Handle uppercase, lowercase and non-letters.
# Concepts Tackled in The Exercise

## Data Types
Read the article below to understand the different types Primitive data types.
* https://www.tutorialspoint.com/java/java_basic_datatypes.htm

## Operators
Read the article below to understand how to perform simple operations in Java.
* https://www.tutorialspoint.com/java/java_basic_operators.htm

## Methods
Consider the following code below
```java
public static int methodName(int a, int b) {
   // body
}
```

Here,

* public static − modifier
* int − return type
* methodName − name of the method
* int a, int b − list of parameters

The same is shown in the following syntax −

```java
modifier returnType nameOfMethod (Parameter List) {
   // method body
}
```
The syntax shown above includes −

* modifier − It defines the access type of the method and it is optional to use.
* returnType − Method may return a value.
* nameOfMethod − This is the method name. The method signature consists of the method name and the parameter list.
* Parameter List − The list of parameters, it is the type, order, and number of parameters of a method. These are optional, method may contain zero parameters.
* method body − The method body defines what the method does with the statements.

Focus first on the returnType, nameOfMethod and Parameter list. modifers will be discussed in later sections.


Lets try making a method that adds two numbers and returns it the onCreate method (don't worry about onCreate method yet)

```java  
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare an int variable sum
        int sum;

        //Initialize the value of sum by calling the method that adds two numbers and passing arguments
        sum = add(1,2);

    }

    /**
     *Returns the sum of two integers
     * @param a the first integer
     * @param b the second integer
     * @return the sum of both integers
     */
    private int add(int a, int b){
      return a +b;
    }
```

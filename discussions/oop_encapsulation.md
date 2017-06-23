# Concepts Tackled in The Exercise

## Objects and Classes

Look around you. Everything that you interact with is an Object. You might see a pen, notebook, laptop, air-con, or a mobile phone. Each object has certain characteristics. The mobile phone can be an Android or IOS device, it can have its display turned on or off, its color and be black, white or any other color you could think of. These characteristics in programming is called the *state* of the Object.  This Objects also have certain functionalities the mobile phone's basic features would be to send a SMS or call another phone. It can connect to a bluetooth head phone or connect to a WIFI network. These functionalities in programming are what you call methods (functions) of the Object.

A class acts as the blueprint of the object. Think of building the house. Before you build a house you need to have the architect create a blueprint. This blueprint is what you will use as a guide to build the house. So in this case the blueprint of the house is the Class while the actual house that was built is an Object. In Java, objects built are *instances* of the class it was based on.


Let's create a simple game of a player losing health.

The first thing we have to do is create a class
```java
public Class Player{

}
```
Next thing we will do is define the characteristics of the player that would hold the state of the player. This characteristics are what we call *Instancce Variables*

```java
public Class Player{
  private static final String TAG = "Player";

  public String name;
  public int health;
  public String weapon;
}
```

The player now has 3 characteristics which are name, health and weapon. After this, lets create a constructor for the Player. A constructor is what we call whenever we want to *instantiate* a new object.

```java

public Player(String name, int health, String weapon) {
    //... instance Variables

    this.name = name;
    this.health = health;
    this.weapon = weapon;
}
```
By creating this contructor, we can now create a player object and supplying the parameters name, health, and weapon.
The next thing we will add is to add what can does this character do.

```java
public Class Player{
  //... instance Variables
  //... constructor

  public void sleep(){
    this.health = this.health + 5;
    Log.d(TAG, "Remaining Health: " + this.health);

  }

  public void loseHealth(int damage){
    this.health = this.health - damage
    Log.d(TAG, "Remaining Health: " + this.health);
  }

}
```

In the code snippet above, we can say that a Player has 2 actions. First is to sleep which increases his health to 5. The other action is to lose health which decreases the Player's health based on the damage dealt.

Now that we have a blueprint/Class for our player, lets return to the MainActivity and *instantiate* a new Player and test out his methods.

```java

private static final String TAG = "MainActivity";

@Override
public void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.main);

  Player playerOne = new Player("crusader", 100, "Broad Sword");

  playerOne.loseHealth(10);
  playerOne.loseHealth(20);
  playerOne.sleep();

}
```

```
Output
Remaining Health: 90
Remaining Health: 70
Remaining Health: 75
```

## Encapsulation
Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as *data hiding*.

Consider our previous example above of the Player Object in which I'll add more lines.
```java
private static final String TAG = "MainActivity";

@Override
public void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.main);

  //... previous code
  playerOne.health = -9999;
  Log.d(TAG, "Remaining Health: " + this.health);

}
```

```
Output:
Remaining Health: -9999;
```

By declaring our instance variables in the Player class public allows us to manipulate the player's state without the use of its 2 methods. The resulting health in this case is unrealistic. The advantage of using encapsulation is that constraints and conditions can be placed to ensure that outside class will not be able to access data that its not supposed to.
To fix this, lets go back to our Player Class and change our instance variables to private.

```java
public Class Player{
  private static final String TAG = "Player";

  private String name;
  private int health;
  private String weapon;
}
```

If you try to run the application again notice that you will run to a compile-time error. playerOne.health is now inaccessible in MainActivity. Lets now edit the implementation of our 2 methods to place in constraints.

```java
public Class Player{
  //... instance Variables
  //... constructor

  public void sleep(){
    if(this.health < 100){
      this.health = this.health + 5;
      Log.d(TAG, "Player recovered 5 health");
    }
    Log.d(TAG, "Remaining Health: " + this.health);

  }

  public void loseHealth(int damage){
    this.health = this.health - damage
    if(this.health <= 0){
      Log.d(TAG, this.name + " has died");
      this.health =0;
    }
    Log.d(TAG, "Remaining Health: " + this.health);
  }

}
```

We have placed conditions wherein if the player's health is more than or equal to 100 then no health is added and if the player's health goes down lower than 0 then we say that the player has died and set his health to 0 even if the damage is more than his current health.

Let's change the *arguments* in our 2 methods called in the MainActivity

```java

private static final String TAG = "MainActivity";

@Override
public void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.main);

  Player playerOne = new Player("crusader", 100, "Broad Sword");

  playerOne.sleep();
  playerOne.loseHealth(50);
  playerOne.sleep();
  playerOne.loseHealth(200);

}
```

```
Output
Remaining Health: 100
Remaining Health: 50
Player recovered 5 health
Remaining Health: 55
crusader has died
Remaining Health: 0
```

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
Next thing we will do is define the characteristics of the player that would hold the state of the player

```java
public Class Player{
  public String mFullName;
  public int mHealth;
  public String mWeapon;
}
```

The player now has 3 characteristics which are name, health and weapon. The next thing we will add is the




## Java Collection Framework
A collection — sometimes called a container — is simply an object that groups multiple elements into a single unit. Collections are used to store, retrieve, manipulate, and communicate aggregate data. Typically, they represent data items that form a natural group, such as a poker hand (a collection of cards), a mail folder (a collection of letters), or a telephone directory (a mapping of names to phone numbers).

There are several types of collections. It is very important that as a developer that you choose the most appropriate collection for your group of objects. For this discussion we will focus on HashMaps and ArrayLists.

#### Hashmap
HashMap is used for storing collection of the data in the form of key and value pairs. HashMap is used widely in Android especially in storing, retrieivng and passing information in Activities.

In this example, we have created a hash map where the key is an Integer and the value is the name of the person
```java
  HashMap<Integer,String> hashMap = new HashMap<Integer,String>();  
  hashMap.put(100,"Amit");  
  hashMap.put(101,"Vijay");  
  hashMap.put(102,"Rahul");
  // https://stackoverflow.com/questions/85190/how-does-the-java-for-each-loop-work
  for(Map.Entry m:hm.entrySet()){  
  System.out.println(m.getKey()+" "+m.getValue());  
```
```
Output:102 Rahul
       100 Amit
       101 Vijay
```
### Arraylist
The ArrayList implements the List interface which is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements. ArrayList and Linkedlists are the two general-purpose List implementations, however, the ArrayList is often used because it consumes less resources.

The code example below shows the most common operations when using an ArrayList
```java
import java.util.*;
public class ArrayListDemo {

   public static void main(String args[]) {
      // create an array list
      ArrayList al = new ArrayList();
      System.out.println("Initial size of al: " + al.size());

      // add elements to the array list
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");
      al.add(1, "A2");
      System.out.println("Size of al after additions: " + al.size());

      // display the array list
      System.out.println("Contents of al: " + al);

      // Remove elements from the array list
      al.remove("F");
      al.remove(2);
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);
   }
}
```

## ListView
The display of elements in a list is a very common pattern in mobile applications. The user sees a list of items and can scroll through them. ListView is the basic widget used in Android that has this functionality. The ListView consumes a collection object, normally an ArrayList as one of its arguments. The ListView will then display the contents of the ArrayList on the Android device.

The first order of business is to add a ListView to MainActivity.
Open res/layout/activity_main.xml. As you may know, this is the file that describes the layout of MainActivity. Add a ListView to MainActivity by inserting the following code snippet inside the RelativeLayout/LinearLayout/ConstraintLayout tag:

```xml
<ListView
     android:id="@+id/recipe_list_view"
     android:layout_height="match_parent"
     android:layout_width="match_parent">
 </ListView>
 ```

 Open MainActivity.java and add an instance variable for your ListView with the following line:

```java
private ListView mListView;
```

Add the following snippet below the existing code inside the onCreate method:

```java
mListView = (ListView) findViewById(R.id.recipe_list_view);

// 1
ArrayList<String> recipeList = new ArrayList();

// 2
recipList.add("Fried Chicken");
recipList.add("Spaghetti");
recipList.add("Cheeseburger");


// 3
ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, recipList);
mListView.setAdapter(adapter);
```

So whats happening here.
1. We initialized a new ArrayList of type String called recipeList.
2. We added recipe items into the recipeList ArrayList.
3. This creates and sets a simple adapter for the ListView. The ArrayAdapter takes in the current context, a layout file specifying what each row in the list should look like, and the data that will populate the list as arguments.

In this example, we used a simple built in layout file in Android to display our recipeList.
An ArrayAdapter is an adapter backed by an array of objects. It links the array to the Adapter View.
The default ArrayAdapter converts an array item into a String object putting it into a TextView. The text view is then displayed in the AdapterView (a ListView for example).

*You'll learn more about Context in future lectures :)

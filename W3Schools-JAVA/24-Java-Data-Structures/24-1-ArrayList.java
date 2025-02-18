Java ArrayList 

  ** The ArrayList class is a resizable array, which can be found in the java.util package.

  ** The difference between a built-in array and an ArrayList in Java, is that 
  the size of an array cannot be modified (if you want to add or remove elements 
  to/from an array, you have to create a new one). While elements can be added 
  and removed from an ArrayList whenever you want. The Syntax is also slightly 
  different:

Example

  ** Create an ArrayList object called cars that will store strings:

  import java.util.ArrayList;   // import the ArrayList class

  ArrayList<String> cars = new ArrayList<String>();   // Create an ArrayList object.

---

** If you don't know what a package is, read our Java Packages Tutorial.
    >> https://www.w3schools.com/java/java_packages.asp

---

Add Items

  ** The ArrayList class has many useful methods. For example, to add elements to the list, use the add() method:

Example

  import java.util.ArrayList;

  public class Main {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      System.out.println(cars);
    }
  }

  >>>
    [Volvo, BMW, Ford, Mazda]
  
---

** You can also add an item at a specified position by referring to the index number:

Example

  import java.util.ArrayList;

  public class Main {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");

      cars.add(0, "Mazda");   // Insert element at the beginning of the list (0)

      System.out.println(cars);
    }
  }

  >>>
    [Mazda, Volvo, BMW, Ford]

---

** Remember: Array indexes start with 0: [0] is the first element. [1] is the 
second element, etc.

---

Access an Item

  ** To access an element in the ArrayList, use the get() method and refer to the index number:

Example

  cars.get(0);

-->>

  import java.util.ArrayList;

  public class Main {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      System.out.println(cars.get(0));
    }
  }

---
 
Change an Item 

  ** To modify an element, use the set() method and refer to the index number:

Example

  cars.set(0, "Opel");

  -->
  import java.util.ArrayList;

  public class Main {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      cars.set(0, "Opel");

      System.out.println(cars);
    }
  }

  >>> [Opel, BMW, Ford, Mazda]

---

Remove an Item 
  ** To remove an element, use the remove() method and refer to the index number:

Example

  cars.remove(0)
  -->

  import java.util.ArrayList;

  public class Main {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      cars.remove(0);
      
      System.out.println(cars);
    }
  }

** To remove all the elements in the ArrayList, use the clear() method:

Example

  cars.clear();
  -->
  import java.util.ArrayList;

  public class Main {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      cars.clear();

      System.out.println(cars);
    }
  }

  >>>
    []

---

ArrayList Size 

  ** To find out how many elements on ArrayList have, use the size method:

Example 
  
  cars.size();
  -->

  import java.util.ArrayList;

  public class Main {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      
      System.out.println(cars.size());
    }
  }

  >>> 
    4

---

Loop Through an ArrayList 

  ** Loop through the elements of an ArrayList with a for loop, and use the size()
  method to specify how many times the loop should run:

Example

  import java.util.ArrayList;

  public class Main {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");

      for (int i = 0; i < cars.size(); i++) {
        System.out.println(cars.get(i));
      }
    }
  }

  >>>
    Volvo
    BMW
    Ford
    Mazda

    ---

** You can also loop through an ArrayList with the for-each loop:

Example

  import java.util.ArrayList;

  public class Main {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      
      for (String i : cars) {
        System.out.println(i);
      }
    }
  }

  >>>    
    Volvo
    BMW
    Ford
    Mazda

---

Other Types 
  
  ** Elements in an ArrayList are actually objects. In the example above, we 
  created elements (objects) of type "String". Remember that a String in Java is 
  an object (not a primitive type). To use other types, such as int, you must 
  specify an equivalent wrapper class: Integer. For other primitive types, use:
  Boolean for boolean, Character for char, Double for double, etc:

Example

  ** Create an ArrayList to store numbers (add elements of types Integer):

  import java.util.ArrayList;

  public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> myNumbers = new ArrayList<Integer>();
      myNumbers.add(10);
      myNumbers.add(15);
      myNumbers.add(20);
      myNumbers.add(25);

      for (int i : myNumbers) {
        System.out.println(i);
      }
    }
  }

  >>>
    10
    15
    20
    25

---

Sort an ArrayList

  ** Another useful class in the java.util package is the Collections class, which
  include the sort() method for sorting lists alphabetically or numerically:

Example

  ** Sort an ArrayList of Strings:

  import java.util.ArrayList;
  import java.util.Collections;   // Import the Collections class

  public class Main {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");

      Collections.sort(cars);   // Sort cars
      for (String i : cars) {
        System.out.println(i);
      }
    }
  }

  >>>
    BMW
    Ford
    Mazda
    Volvo

---

Example

  ** Sort an ArrayList of Integers:

  import java.util.ArrayList;
  import java.util.Collections;

  public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> myNumbers = new ArrayList<Integer>();
      myNumbers.add(33);
      myNumbers.add(15);
      myNumbers.add(20);
      myNumbers.add(34);
      myNumbers.add(8);
      myNumbers.add(12);

      Collections.sort(myNumbers);    // Sort myNumbers

      for (int i : myNumbers) {
        System.out.println(i);
      }
    }
  }

  >>>
    8
    12
    15
    20
    33
    34

---

Complete ArrayList Reference

  ** For a complete reference of ArrayList methods, go to our Java ArrayList Reference.
      >> https://www.w3schools.com/java/java_ref_arraylist.asp
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
  
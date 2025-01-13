Java List Sorting 

Java Sort a List 

  ** In the previous chapters, you learned how to use two popular lists in Java: 
  ArrayList and LinkedList, which are found in the java.util package.

  ** Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically.

---

Sort an ArrayList 

  ** Sort an ArrayList of Strings alphabetically in ascending order:

Example
  
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

** Sort an ArrayList of Integers numerically in ascending order:

Example

  import java.util.ArrayList;
  import java.util.Collections;   // Import the Collections class

  public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> myNumbers = new ArrayList<Integers>();
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

Reverse the Order 

  ** You can also sort a list in reverse order, by using the reverseOrder() method.

  ** In the example, we sort an ArrayList of Strings alphabetically in reverse/descending order:

Example

  import java.util.ArrayList;
  import java.util.Collections;   // Import the Collections class

  public class Main {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");

      Collections.sort(cars, Collections.reverseOrder());   // Sort cars

      for (String i : cars) {
        System.out.println(i);
      }
    }
  }

>>>
  Volvo
  Mazda
  Ford
  BMW

---

** Sort an ArrayList of Integers numerically in reverse/descending order:

Example

  import java.util.ArrayList;
  import java.util.Collections;   // Import Collection class

  public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> myNumbers = new ArrayList<Integer>();
      myNumbers.add(33);
      myNumbers.add(15);
      myNumbers.add(20);
      myNumbers.add(34);
      myNumbers.add(8);
      myNumbers.add(12);

      Collection.sort(myNumbers, Collections.reverseOrder());   // Sort myNumbers
    
      for (int i : myNumbers) {
        System.out.println(i);
      }
    }
  }

>>>
  34
  33
  20
  15
  12
  8

        ---
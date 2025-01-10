Java LinkedList 

  ** In the previous chapter, you learned about the ArrayList class. The LinkedList class is almost identical to the ArrayList:

Example

  // Import the LinkedList class
  import java.util.LinkedList;

  public class Main {
    public static void main(String[] args) {
      LinkedList<String> cars = new LinkedList<String>();
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

ArrayList vs. LinkedList

  ** 
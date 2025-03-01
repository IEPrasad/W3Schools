Java How To Sort an Array 

How To Sort an Array 

  ** You can use the sort() method, found in java.util.Arrays, to sort an array:

Example 

  import java.util.Arrays;

  public class Main {
    public static void main(String[] args) {
      String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
      Arrays.sort(cars);
      for (String i : cars) {
        System.out.println(i);
      }
    }
  }

  >>>
    Audi
    BMW
    Fiat
    Ford
    Mazda
    Tesla
    Volvo

---

Related Pages 

  Java Array Tutorial 
      >> https://www.w3schools.com/java/java_arrays.asp
  Java Arrays Class Reference 
      >> https://www.w3schools.com/java/java_ref_arrays.asp

                ----
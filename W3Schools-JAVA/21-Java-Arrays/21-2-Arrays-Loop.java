Java Arrays Loop 

Loop Through an Array

  ** You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run. 

  * The following example outputs all elements in the cars array:

Example 

  public class Main {
    public static void main(String[] args) {
      String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
      for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
      }
    }
  }


---

Loop Through an Array with For-Each 

  ** There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:

Syntax 

  for (type variable : arrayname) {
    ...
  }

** The following example outputs all elements in the cars array, using a "for-each" loop:

Example 

  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
  for (String i : cars) {
    System.out.println(i);
  }


** The example above can be rad like this: for each String element (called i - as in index) in cars, print out the value of i.

** If you compare the for loop and for-each loop, you will see that the for-each method is easier to write, it does not require a counter (using the length property), and it is more readable.

-----------------


Exercise 

  What is the output of the following code?

  String[] cars = {"Volvo", "BMW", "Ford"};
  for (int i = 0; i < cars.length; i++) {
    System.out.println(cars[i]);
  }
 
--- 
// >>>
//   Volvo
//   BMW
//   Ford

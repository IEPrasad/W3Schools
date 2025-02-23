Java How to Add Two Numbers 

Add Two Numbers 

  ** Learn how to add two numbers in Java:

Example

  int x = 5;
  int y = 6;
  int sum = x + y;
  System.out.println(sum);    // Print the sum of x + y

  ---

  public class Main {
    public static void main(String[] args) {
      int x = 5;
      int y = 6;
      int sum = x + y;
      System.out.println(sum);    // Print the sum of x + y
    }
  }

  >>> 11

---

Add Two Numbers with User Input 

  ** Learn how to add two numbers with user input:

Example 

  import java.util.Scanner;   // Import the Scanner class

  class MyClass {
    public static void main(String[] args) {
      int x, y, sum;
      Scanner myObj = new Scanner(System.in);   // Create a Scanner object
      System.out.println("Type a number:");
      x = myObj.nextInt();    // Read user Input

      System.out.println("Type another number:");
      y = myObj.nextInt();    // Read user Input

      sum = x + y;    // Calculate the sum of x + y
      System.out.println("Sum is: " + sum);   // Print the sum 
    }
  }

              ----
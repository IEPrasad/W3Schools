String to an Array 

Convert a String to an Array 

  ** There are many ways to convert a string to an array. The simplest way to use the toCharArray() method:

Example:

  ** Convert a string to char array:
  
  // Create a string
  String myStr = "Hello";

  // Convert the string to a char array
  char[] myArray = myStr.toCharArray();

  // Print the first element of the array
  System.out.println(myArray[0]);

  ---

  public class Main {
    public static void main(String[] args) {
      // Create a string 
      String myStr = "Hello";

      // Convert the string to a char array
      char[] myArray = myStr.toCharArray();

      // Print the first element of the array
      System.out.println(myArray[0]);
    }
  } 

  >>> H

  ** You can also loop through the array to print all array elements:

Example

  // Create a string 
  String myStr = "Hello";

  // Convert the string to a char array
  char[] myArray = myStr.toCharArray();

  // Print array elements 
  for (char i : myArray) {
    System.out.println(i);
  }

  ---

  public class Main {
    public static void main(String[] args) {
      // Create a string 
      String myStr = "Hello";

      // Convert the string to char array 
      char[] myArray = myStr.toCharArray();

      // Print array elements 
      for (char i : myArray) {
        System.out.println(i);
      }
    }
  }

  >>> 
    H
    e   
    l
    l
    o
  
---

Related Pages 

  - Java String Tutorial 
      >> https://www.w3schools.com/java/java_strings.asp
  - Java Arrays Tutorial
      >> https://www.w3schools.com/java/java_arrays.asp
  - The toCharArray() String Method 
      >> https://www.w3schools.com/java/ref_string_tochararray.asp

                        ----
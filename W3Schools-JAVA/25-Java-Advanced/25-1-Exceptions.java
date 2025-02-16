Java Exception - Try...Catch 

Java Exceptions 

  ** When executing Java code, different errors can occur: coding errors by the 
  programmer, errors due to wrong input, or other unforeseeable things.   

  ** When an error occurs, Java will normally stop and generate an error message. 
  The technical term for this is: Java will throw an exception (throw an error).

Java try and catch 

  ** The try statement allows you to define a block of code to be tested for 
  errors while it is being executed. 

  ** The catch statement allows you to define a block of code to be executed, 
  if an error occurs in the try block. 

  ** The try and catch keywords come in pairs:

Syntax

  try {
    // Block of code to try
  } 
  catch(Exception e) {
    // Block of code to handle errors
  }

Consider the following example:

  ** This will generate an error, because myNumbers[10] does not exist.

  public class Main {
    public static void main(String[] args) {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);  // error!
    }
  }

  ** The output will be something like this:

    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
            at Main.main(Main.java:4)

  Note: ArrayIndexOutOfBoundsException occurs when you to access an index number 
  that does not exist. 

---

** If an error occurs, we can use try...catch to catch the error and execute some 
code to handle it: 

Example 
  public class Main {
    public static void main(String[] args) {
      try {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]);
      } catch (Exception e) {
        System.out.println("Something wen wrong.");
      }
    }
  }

** The output will be:

  ** Something went wrong. 

Finally 

  ** The finally statement lets you execute you execute, after try...catch, 
  regardless of the result:

Example 

  public class Main {
    public static void main(String[] args) {
      try {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]);
      } catch (Exception e) {
        System.out.println("Something went wrong.");
      } finally {
        System.out.println("The 'try catch' is finished.");
      }
    }
  }

  ** The output will be:

    Something went wrong.
    The 'try catch' is finished. 

---

The throw keyword 

  ** The throw statement allows you to create a custom error. 
  
  ** The throw statement is used together with an exception type. There are many 
  exception types available in Java: ArithmeticException, FileNotFoundException,
  ArrayIndexOutOfBoundsException, SecurityException, etc:

  Example 

  ** Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted".


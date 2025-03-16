Java How to Loop Through an Enum 

Loop Through an Enum 

  ** The enum type has a values() method, that which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:

Example

  enum Level {
    LOW, 
    MEDIUM, 
    HIGH 
  }

  public class Main {
    public static void main(String[] args) {
      for (Level myVar : Level.values()) {
        System.out.println(myVar);
      }
    }
  }

  >>> 
    LOW
    MEDIUM
    HIGH
---

Related Pages 

  ** Java Enums Tutorial 
      >> https://www.w3schools.com/java/java_enums.asp

        ----
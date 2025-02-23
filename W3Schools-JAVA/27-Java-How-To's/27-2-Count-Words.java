Java how to Count Words 

Count Number of Words in a String 

  ** You can easily count the number of words in a string with the following example:

Example

  String words = "One Two Three Four";
  int countWords = words.split("\\s").length;
  System.out.println(countWords);

  ---

  public class Main {
    public static void main(String[] args) {
      String words = "One Two Three Four";
      int countWords = words.split("\\s").length;
      System.out.println(countWords);
    }
  }

  >>> 4

---

Related Pages 

  Java String Tutorial 
      >> https://www.w3schools.com/java/java_strings.asp
  
  Java String methods 
      >> https://www.w3schools.com/java/java_ref_string.asp

          ----
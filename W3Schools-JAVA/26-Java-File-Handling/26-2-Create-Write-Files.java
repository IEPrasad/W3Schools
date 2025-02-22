Java Create and Write To Files 

Create a File 

  ** To create a file in Java, you can use the createNewFile() method. This method returns a boolean value: true if the file was successfully created, and 
  false if the file already exists. Note that the method is enclosed in a try...catch block. 
  This is necessary because it throws an IOException if an error occurs (if the file cannot be created for some reason):

Example 

  import java.io.File;    // Import the File class 
  import java.io.IOException;   // Import the IOException class to handle errors 

  public class CreateFile {
    public static void main(String[] args) {
      try {
        File myObj = new File("filename.txt");
        if (myObj.createNewFile()) {
          System.out.println("File created: " + myObj.getName());
        } else {
          System.out.println("File already exists.");
        }
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
  }

The output will be: 
  File created: filename.txt 

---

  ** To create a file in a specific directory (requires permission), specify the 
  path of the file and use double backslashes to escape the "\" character (for Windows). 
  On Mac and Linux you can just write the path, like: /Users/name/filename.txt
  "
Example 

  File myObj = new File("C:\\Users\\Myname\\filename.txt");

---
  import java.io.File; 
  import java.io.IOException;
    
  public class CreateFileDir {  
    public static void main(String[] args) {  
      try {  
        File myObj = new File("C:\\Users\\MyName\\filename.txt");  
        if (myObj.createNewFile()) {  
          System.out.println("File created: " + myObj.getName());  
          System.out.println("Absolute path: " + myObj.getAbsolutePath());  
        } else {  
          System.out.println("File already exists.");  
        }  
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();  
      }  
    }  
  } 

  >>> 
    File created: filename.txt
    Absolute path: C:\Users\MyName\filename.txt

---

Write To a File 

  ** In the following example, we use the FileWriter class together with its 
  write() method to write some text to the file we created in the example above.
  Note that when you are done writing to the file, you should close it with the close() method:

Example

  import java.io.FileWriter;    // Import the FileWriter class 
  import java.io.IOException    // Import the IOException class to handle errors

  public class WriteToFile {
    public static void main(String[] args) {
      try {
        FileWriter myWriter = new FileWriter("filename.txt");
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
  }

  ** The output will be: 

    >>> Successfully wrote to the file. 

---

** To read the file above, go to the Java Read Files chapter. 
    >> https://www.w3schools.com/java/java_files_read.asp

              ----
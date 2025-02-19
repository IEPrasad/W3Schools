Java Files 

  ** File handling is an important part of any application. 

  ** Java has several methods for creating, reading, updating, and deleting files. 

Java File Handling 

  ** The file class from the java.io package, allows us to work with files. 

  ** To use the File class, create and object of the class, and specify the filename or directory name:

Example 

  import java.io.File;    // Import the File class 
  
  File myObj = new File("Filename.txt");    // Specify the filename 

--- 

** If you don't know what a package is, read our Java Package Tutorial. 
    >> https://www.w3schools.com/java/java_packages.asp

---

The File class has many useful methods for creating and getting information about files. For example:


  Method              Type            Description 

  canRead()           Boolean         Tests whether the file is readable or not 
  canWrite()          Boolean         Tests whether the file is writable or not
  createNewFile()     Boolean         Creates an empty file 
  delete()            Boolean         Deletes a file 

  


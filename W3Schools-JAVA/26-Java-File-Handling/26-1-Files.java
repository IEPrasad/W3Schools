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
  exits()             Boolean         Tests whether the file exists
  getName()           String          Returns the name of the file 
  getAbsolutePath()   String          Returns the absolute pathname of the file 
  length()            Long            Returns the size of the file in bytes 
  list()              String[]        Returns an array of the files in the directory  
  mkdir()             Boolean         Create a directory 

  You will learn how to create, write, read and delete files in the next chapter:

  Create/Write Files >> https://www.w3schools.com/java/java_files_create.asp
  Read Files >> https://www.w3schools.com/java/java_files_read.asp
  Delete Files >> https://www.w3schools.com/java/java_files_delete.asp


                      ----
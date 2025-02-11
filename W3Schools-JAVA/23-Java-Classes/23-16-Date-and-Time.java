Java Date and Time 

Java Dates 

  ** Java does not have a built-in Data class, but we can import the java.time package to work with the date and time API. The package includes many date and time classes. For example:

    Class                 Description 
    
    LocalDate             Represents a date (year, month, day (yyyy-MM-dd))
    
    LocalTime             Represents a time (hour, minute, second and nanoseconds 
                          (HH-mm-ss-ns))
    
    LocalDateTime         Represents both a date and a time 
                          (yyyy-MM-dd-HH-mm-ss-ns)
    
    DateTimeFormatter     Formatter for displaying and parsing date-time objects


** If you don't know package is, read our Java Packages Tutorial.
    >> https://www.w3schools.com/java/java_packages.asp

---

Display Current Date 

  ** To display the current date, import the java.time.LocalDate class, and use its now() method:

Example

  import java.time.LocalDate;    // Import the LocalDate class  

  public class Main {
    public static void main(String[] args) {
      LocalDate myObj = localDate.now();    // Create a date object 
      System.out.println(myObj);    // Display the current date 
    }
  }

** The output will be:

  >>> 2025-01-04

---

Display Current

  ** To display the current time (hour, minute, second, and nanoseconds), import 
  the java.time.LocalTime class, and use its now() method:

Example 

  import java.time.LocalTime;    // Import the LocalTime class

  public class Main {
    public static void main(String[] args) {
      LocalTime myObj = LocalTime.now();
      System.out.println(myObj);
    }
  }

** This example displays the server's local time, which may differ from your local time: '

  >>> 20.19.27.144068

---

Display Current Date and Time 

  ** To display the currecnt date and time, import the java.time.LocalTime class,
  and use its now() method:


Example

  import java.time.LocalDateTime;    // Import the LocalDateTime class

  public class Main {
    public static void main(String[] args) {
      LocalDateTime myObj = LocalDateTime.now();
      System.out.println(myObj);
    }
  }

  ** The output will be something like this 
  >>> 
    2025-01-04T20:19:27.145969

---

Formatting Date and Time 

  ** The "T" in the example above is used to separate the date from the time.
  You can use the DateTimeFormatter clss with the ofPattern() method in the same 
  package to format or parse date-time objects. The following example will remove 
  both the "T" and nanoseconds from the date-time:

Example 

  import java.time.LocalDateTime;    // Import the LocalDateTime class
  import java.time.format.DateTimeFormatter;    // Import the DateTimeFormatter class

  public class Main {
    public static void main(String[] args) {
      LocalDateTime myDateObj = LocalDateTime.now();
      System.out.println("Before formatting: " + myDateObj);
      DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

      String formatteDate = myDateObj.format(myFormatObj);
      System.out.println("After formatting: " + formatteDate);
    }
  }

** The output will be:

  >>> 
    Before formatting: 2025-01-04T20:19:27.145530
    After formatting: 04-01-2025 20:19:27

---

The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format. For example:

  Vale                              Example 

  yyyy-MM-dd                        "1988-09-29"
  dd/MM/yyyy                        "29/09/1988"
  dd-MMM-yyyy                       "29-SEP-1988"
  E, MMM dd yyyy                    "Thu, Sep 29 1988"

---

Example 

  import java.time.LocalDateTime;    // Import the LocalDateTime class
  import java.time.format.DateTimeFormatter;    // Import the DateTimeFormatter class

  public class Main {
    public static void main(String[] args) {
      LocalDateTime myDateObj = LocalDateTime.now();
      System.out.println("Before Formatting: " + myDateObj);
      DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd YYYY  HH:mm:ss");

      String formatteDate = myDateObj.format(myFormatObj);
      System.out.println("After Formatting: " + formatteDate);
    }
  }

  // Note: This example displays the server's local time, which many differ from your local time.

>>>
  Before Formatting: 2025-01-05T11:59:46.897641
  After Formatting: Sun, Jan 05 2025 11:59:46
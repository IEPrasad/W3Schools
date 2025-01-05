PHP Variables 

  ** Variables are "containers" for storing information.
  
Creating (Declaring) PHP Variables

  ** In PHP, a variable starts with the $ sign, followed by the name of the variable:

Example 

  $x = 5;
  $y = "John";

---

** In the example above, the variable $x will hold the value 5, and the variable $y will hold the value "John".

** Note: When you assign a text value to a variable, put quotes around the value.

** Note: Unlike other programming language, PHP has no command for declaring a 
variable. It is created the moment you first assign a value to it.

** Think fo variables as containers for storing data.

---

PHP Variables 

  ** A variable can have a short name (like $x and $y) or a more descriptive name ($age, $carname, $total_volume).

  ** Rules for PHP variables:

      ** A variable starts with the $ sign, followed by the name of the variable.
      ** A variable name must start with a letter or the underscore character.
      ** A variable name cannot start with a number.
      ** A variable name can only contain alpha-numeric characters and underscores (A-z, 0-9, and _).
      ** Variable names are case-sensitive ($age and $AGE are two different variables).


** Remember that PHP variable names are case-sensitive!

---

Output Variables

  ** The PHP echo statement is often used to output data to the screen.
  
  ** The following example will show how to output text and a variable:

Example

  <?php 
    $text = "W3Schools.com";
    echo "I love $text!";
  ?>

** The following example will output the sum of two variables:

Example
  
  <?php
    $x = 5;
    $y = 4;
    echo $x + $y;
  ?>

---

** Note: You will learn more about echo statement and how to output data to the screen in the PHP Echo/Print chapter.
    >>https://www.w3schools.com/php/php_echo_print.asp

---

PHP is a Loosely Typed Language

  ** In the example above, notice that we did not have to tell PHP which data type the variable is.

  ** PHP automatically associates a data type to the variable, depending on its value. Since the data types are not set in a strict sense, you can do things like adding a string to an integer without causing an error.

  ** In PHP 7, type declarations were added. This gives an option to specify the data type expected when declaring a function, and by enabling the strict requirement, it will throw a "Fatal Error" on a type mismatch.

  ** You will learn more about strict and non-strict requirements, and data type declarations in the PHP Functions chapter.
    >> https://www.w3schools.com/php/php_functions.asp

---

Variable Types 

  ** In the example above, notice that we did not have to tell PHP which date types the variable is.

  ** PHP automatically associates a data types to the variable, depending on its 
  value. Since the data types are not set in a strict sense, you can do things 
  like adding a string to an integer without causing an error.

  ** In PHP 7, types declarations were added. This gives an option to specify the 
  data type expected when declaring a function, and by enabling the strict 
  requirement, it will throw a "Fatal Error" on a type mismatch.

  ** You will learn more about strict and non-strict requirements, and date type 
  declarations in the PHP Functions chapter.
    >> https://www.w3schools.com/php/php_functions.asp

---

Variable Types 

  ** PHP has no command for declaring a variable, and the date type depends on 
  the data type depends on the value of the variable.
  
Example
  
  <?php
    $x = 5;      // $x is an integer
    $y = "John"; // $y is a string
    echo $x;
    echo $y;
  ?>

  >>> 5John

---

** PHP supports the following data types:

  String
  Integer
  Float (floating point numbers - also called double)
  Boolean
  Array
  Object
  NULL
  Resource
    
---

Get the Type 
 
  ** To get the data type of a variable, use the var_dump() function.

Example

  <?php
    $x = 5;
    var_dump($x);
  ?>

  >>> int(5)

Example

  ** See what var_dump() returns for other data types:

  <?php
    var_dump(5);
    var_dump("John");
    var_dump(3.14);
    var_dump(true);
    var_dump([2, 3, 56]);
    var_dump(NULL);
  ?>

    >>> 
      int(5)
      string(4) "John"
      float(3.14)
      bool(true)
      array(3) {
        [0]=>
        int(2)
        [1]=>
        int(3)
        [2]=>
        int(56)
      }
      NULL

---

Assign String to a Variable 

  ** Assigning a string to a variable is done with the variable name followed by 
  an equal sign and the string:
  
Example

  <?php
    $x = "John";
    echo $x;
  ?>

---

  ** String variables can be declared either by using double or single quotes,
  but you should be aware of the difference. Learn more about the difference in the PHP String chapter.
      >> https://www.w3schools.com/php/php_string.asp
---

Assign Multiple Values 

  ** You can assign the same value to multiple variables in one line:

Example 

  ** All three variables get the value "Fruit":
  
  <?php
    $x = $y = $z ="Fruit";
  ?>

<!DOCTYPE html>
<html>
  <body>

    <?php
      $x = $y = $z = "Fruit";

      echo $x;
      echo $y;
      echo $z;

    ?>

  </body>
</html>

>>> FruitFruitFruit


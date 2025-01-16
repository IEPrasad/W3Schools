PHP Data Types 

  ** Variables can store data of different types, and different data
  types can do different things.

  ** PHP supports the following data types:
      ** String 
      ** Integer 
      ** Float (floating point numbers - also called double)
      ** Boolean 
      ** Array
      ** Object 
      ** NULL 
      ** Resource 

---

Getting the Data Type 

  ** You can get the data types of any object by using the var_dump()
  function.

Example
  ** The var_dump() function returns the data type and the value:

   <?php 
    $x = 5;
    echo var_dump($x);
  ?> 

PHP String 

  ** A string is a sequence of characters, like "Hello World!". 

  ** A string can be any text inside quotes. You can use single or double quotes:

Example

  <?php
    $x = "Hello world!";
    $y = 'Hello world!';

    var_dump($x);
    echo "<br>";
    var_dump($y);
  ?>

PHP Integer 

  ** An integer data type is a non-decimal number between 
  -2, 147, 483, 648 and 2, 147, 483, 647.

  Rules for integers:
    
    ** An integer must have at least one digit
    ** An integer can be either positive or negative
    ** Integers can be specified in: decimal (base 10), hexadecimal
    (base 16), octal (base 8), or binary (base 2) notation

  ** In the following example $x is an integer: The PHP var_dump()
  function returns the data type and value:

---

Example

    <?php
      $x = 5985;
      var_dump($x);
    ?>

PHP Float
A float (floating point number) is a number with a decimal point or a number in exponential form.

In the following example $x is a float. The PHP var_dump() function returns the data type and value:


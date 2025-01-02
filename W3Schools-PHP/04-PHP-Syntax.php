PHP Syntax 

  ** A PHP script is executed on the server, and the plain HTML result is sent back to the browser.

Basic PHP Syntax 
  ** A PHP script can be placed anywhere in the document.
  ** A PHP script starts with <?php and ends with ?>:

Example
  <?php
    // PHP code goes here
  ?>

  ** The default file extension for PHP files is ".php".

  ** A PHP file normally contains HTML tags, and some PHP scripting code.

  ** Below, we have an example of a simple PHP file, with a PHP script that uses a built-in PHP function "echo" to output the text "Hello World!" on a web page:

---

Example 

  **  A simple .php filw with both HTML code and PHP code:

  <!DOCTYPE html>
  <html>
    <body>

      <h1>My first PHP page</h1>

      <?php
        echo "Hello World!";
      ?>

    </body>
  </html>

Note: PHP statements end with a semicolon (;).

---

PHP Case Sensitivity 

  ** In PHP, keywords (e.g. if, else, while, echo, etc.), classes, functions, and user-defined functions are NOT case-sensitive.

  ** In the example below, all three echo statements below are legal (and equal):

Example

  ** ECHO is the same as echo:

  <!DOCTYPE html>
  <html>
    <body>

      <?php
        ECHO "Hello World!<br>";
        echo "Hello World!<br>";
        EcHo "Hello World!<br>";
      ?>

    </body>
  </html>

---

Note: However, all variable names are case-sensitive!

---

** Look at eh example below; only the first statement will display the value of the $color variable!
This is because $color, $COLOR, and $coLOR are treated as three different variables:

Example

  $COLOR is not the same as #color:

  <!DOCTYPE html>
  <html>
    <body>
      <$php 
        
        echo "My car is " . $color . "<br>";
        echo "My house is " . $COLOR . "<br>";
        echo "My boat is " . $coLOR . "<br>";
      ?>
    </body>
  </html>
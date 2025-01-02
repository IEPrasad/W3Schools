PHP Comments 

Comments in PHP

  ** A comment in PHP code is a line that is not executed as a part of the 
  program. Its only purpose is to be read by someone who is looking at the code. 

  ** Comments can be used to:
    > Let others understand your code 
    > Remind yourself of what you did - Most programmers have experienced coming 
    back to their own work a year or two later and having to re-figure out what 
    they did. Comments can help you understand what you were doing in each part of your code.
    > Leave out some parts of your code

  ** PHP supports several ways of commenting:

Example 

  Syntax for commenting in PHP code:

    // This is a single-line comment

    # This is also a single-line comment

    /*
      This is a multiple-lines comment block
      that spans over multiple
      lines
    */

---

Single Line Comments

  Single line comments start with //.

  Any text between // and the end of the line will be ignored (will not be executed).

  You can also use # for single line comments, but in this tutorial we will use //.

  The following examples uses a single-line comment as an explanation:

---

Example

  ** A comment before the code:

  // Outputs a welcome message:
  echo "Welcome Home!";

Example

  ** A comment at the end of the line:
  echo "Welcome Home!"; // Outputs a welcome message

---

Comments to Ignore Code 

  ** We can use comments to prevent code lines from being executed:

Example

  ** Do not display a welcome message:

  // echo "Welcome Home!";


----

PHP Multiline Comments 

  Multi-line comments start with /* and end with */.

  Any text between /* and */ will be ignored.

  The following example uses a multi-line comment as an explanation:

---

ExampleGet your own PHP Server
  
  Multi-line comment as an explanation:

  /*
  The next statement will
  print a welcome message
  */
  echo "Welcome Home!";

---

Multi-line Comments to Ignore Code
  
  We can use multi-line comments to prevent blocks of code from being executed:

  Example
  Multi-line comment to ignore code:

  /*
  echo "Welcome to my home!";
  echo "Mi casa su casa!";
  */
  echo "Hello!";

---

Comments in the Middle of the Code
  The multi-line comment syntax can also be used to prevent execution of parts inside a code-line:

  Example
  The  + 15 part will be ignored in the calculation:

  $x = 5 /* + 15 */ + 5;
  echo $x;


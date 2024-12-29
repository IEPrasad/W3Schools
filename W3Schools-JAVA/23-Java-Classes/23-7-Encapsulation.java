Java Encapsulation 

Encapsulation 

  ** The meaning of Encapsulation is to make sure that "sensitive" data is hidden from users. To achieve this you must:

    ** declare class variables/attributes as private
    ** provide public get and set methods to access and update the value of a private variable

Get and Set 

  ** You learned from the previous chapter that private variable can only 
  accessed within the same class (an outside class has no access to it). 
  However, it is possible to access them if we provide public get and set methods.

  ** The get method returns the variable value, and the set method sets the value.

  ** Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case: 

Example

  public class Person {
    private String name;    // private = restricted access

    // Getter 
    public String getName() {
      return name;
    }

    // Setter 
    public void setName(String newName) {
      this.name = newName;
    }
  }

Example explained 

  ** The get method returns the value of the variable name.

  ** The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer o the current object.

  ** However, as the name variable is declared as private, we cannot access it from outside this class:

  





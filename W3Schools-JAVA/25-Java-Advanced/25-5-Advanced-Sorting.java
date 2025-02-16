Java Advanced Sorting (Comparator and Comparable)

Java Advanced Sorting

  ** In the List Sorting Chapter, you learned how to sort lists alphabetically and numerically, but what if the list has objects in it?

  ** To sort objects you need to specify a rule that decides how objects should be sorted. For example, if you have a list of cars you might want to sort them by year, the rule could be that cars with an earlier year go first.

  ** The Comparator and Comparable interfaces allow you to specify what rule is used to sort objects.

  ** Being able to specify a sorting rule also allows you to change how strings and numbers are sorted.

---

Comparators
 
  **An object that implements the Comparator interface is called a comparator.

  ** The Comparator interface allows you to create a class with a compare() method that compares two objects to decide which one should go first in a list.

  ** The compare() method should return a number which is:

      Negative if the first object should go first in a list.
      Positive if the second object should go first in a list.
      Zero if the order does not matter.

  ** A class that implements the Comparator interface might look something like this:

  // Sort Car objects by year
  class SortByYear implements Comparator {
    public int compare(Object obj1, Object obj2) {
      // Make sure that the objects are Car objects
      Car a = (Car) obj1;
      Car b = (Car) obj2;
      
      // Compare the objects
      if (a.year < b.year) return -1; // The first car has a smaller year
      if (a.year > b.year) return 1;  // The first car has a larger year
      return 0; // Both cars have the same year
    }
  }
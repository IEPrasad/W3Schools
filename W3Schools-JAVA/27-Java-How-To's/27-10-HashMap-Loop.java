Java How To Loop Through a HashMap 

Loop Through a HashMap 

  ** Loop through the items of a HashMap with a for-each loop.

  ** Note: Use the keySet() method if you only want the keys, and use the values() method if you only want to the values:

Example:

  // Print keys 
  for (String i : capitalCities.keySet()) {
    System.out.println(i);
  }


  >>> 
    USA
    Norway
    England
    Germany
---

Example

  // Print values 
  for (String i : capitalCities.values()) {
    System.out.println(i);
  }

  >>>
    Washington DC
    Oslo
    London
    Berlin
---

Example

  // Print keys and values 
  for (String i : capitalCities.keySet()) {
    System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
  }

  >>>
    key: USA value: Washington DC
    key: Norway value: Oslo
    key: England value: London
    key: Germany value: Berlin

---

Related Pages 

  ** Java HashMap Tutorial 
      >> https://www.w3schools.com/java/java_hashmap.asp
  
  ** Java HashMap Methods
      >> https://www.w3schools.com/java/java_ref_hashmap.asp

        ----
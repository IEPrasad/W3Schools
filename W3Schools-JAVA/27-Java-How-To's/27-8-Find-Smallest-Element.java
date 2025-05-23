Java How To Find the Smallest Element in an Array 

  ** Create a program that finds the lowest age among different ages:

Example:

  // An array storing different ages
  int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

  // Create a 'lowest age' variable and assign the first array element of ages to it 
  int lowestAge = ages[0];

  // Loop through the elements of the array
  for (int age : ages) {
    // Check if the current age is less than the current 'lowest age'
    if (lowestAge > age) {
      // If the smaller age is found, update 'lowest age' with that element 
      lowestAge = age;
    }
  } 

  // Output the value of the lowest age 
  System.out.println("The lowest age is: " + lowestAge);


          ----
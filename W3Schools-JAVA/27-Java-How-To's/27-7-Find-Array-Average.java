Java How To Find the Average of Array Elements 

How To Calculate the Average of Array ELements 

  ** Create a program that calculate the average of different ages:

Example:

  // An array storing different ages
  int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

  float avg, sum = 0;

  // Get the length of the array
  int length = ages.length;

  // Loop through the elements of the array
  for (int age : ages) {
    sum += age;
  }

  // Calculate the average by dividing the sum by the length 
  avg = sum / length;

  // Print the average j
  System.out.println("The average age is: " + avg);

---

Related Pages 

  ** Java Array Tutorial 
      >> https://www.w3schools.com/java/java_arrays.asp

                ----
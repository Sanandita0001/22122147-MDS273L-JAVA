<<<<<<< HEAD
Create a java program that performs the following operation:
The program should collect an integer array from the user
After the array is entered, you need to create a menu of items
Find the Mean Value
Find the Median Value
Find the Mode Value
From the user-given array.
The program should have a minimum of 3 functions apart from the main function; each of the functions implements the Mean, Median, and Mode computation by accepting the array user has entered as a parameter and returning the value as a result. From the main method, you will display the result.

* Create a main function,that take inputs for :
a) Size of the array,elemets of the array.
b)  user choice about what the user wants to compute out of:-
1.Mean
2.Median
3.Mode
Following the creation of corresponding functions for the above three options.
* MEAN function will have int array as arguement input,and a loop to iterate through the length of the array and find its sum.It will return the mean of the array elements.
* MEDIAN function will have the same int array as arguement input and then checks if the length of the array is even or odd and then return the median of the middlemost value(s).
=======
Create a java program that performs the following operation:
The program should collect an integer array from the user
After the array is entered, you need to create a menu of items
Find the Mean Value
Find the Median Value
Find the Mode Value
From the user-given array.
The program should have a minimum of 3 functions apart from the main function; each of the functions implements the Mean, Median, and Mode computation by accepting the array user has entered as a parameter and returning the value as a result. From the main method, you will display the result.

* Create a main function,that take inputs for :
a) Size of the array,elemets of the array.
b)  user choice about what the user wants to compute out of:-
1.Mean
2.Median
3.Mode
Following the creation of corresponding functions for the above three options.
* MEAN function will have int array as arguement input,and a loop to iterate through the length of the array and find its sum.It will return the mean of the array elements.
* MEDIAN function will have the same int array as arguement input and then checks if the length of the array is even or odd and then return the median of the middlemost value(s).
>>>>>>> fc56f9cf06cc943c731c33dd1df3bb943cb28593
* MODE function finds the mode value of the array by first initializing mode to the first element of the array, and modeCount to 1. Then, it loops through the array and for each element, it counts the number of times that value appears in the array. This is done with the inner for loop, which compares the current element with every other element in the array.If the count of the current value is greater than modeCount, the mode value is updated to the current value, and modeCount is set to the count of the current value. This ensures that the final mode value is the value that appears the most frequently in the array.At the end of the loop, the mode value is returned to the calling function, which can then be used to display the mode value to the user.
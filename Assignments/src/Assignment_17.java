


//1. Create a program using arrays that sorts a list of integers in descending order. 
//	Descending order is highest value to lowest.
//  In other words if the array had the values in int 106,26,81,5,15 
//	your program should ultimately have an array with 106,81,26,15,5 in it.
//2. Set up the program so that the numbers to sort are read in from the keyword.
//3. Implement the following methods - getIntegers, printArray, and sortIntegers.
//    getIntegers returns an array of entered integers from keyword.
//    printArray prints out the contents of the array and 
//sortIntegers should sort the array and return a new array containing the sorted numbers
//4. You will have to figure out how to copy the array elements from passed array into a new array 
//
//and sort them and return the new sorted array.\

public class Assignment_17 {
  
	public static void main (String [] args) {
   
		int [] array = {106,26,81,5,15};
		int [] orderedArray = orderArray(array);
		for (int x:orderedArray) {
			  System.out.println(x);
		}
	}
	
	public static int[] orderArray (int[] array) {
		int temp;
		for (int i = 1; i < array.length; i++) {
			
			for (int j = i; j > 0; j--) {
				
				if (array[j] < array [j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}
}

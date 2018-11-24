import java.util.*;

//1. Create a program using arrays that sorts a list of integers in descending order. 
//	Descending order is highest value to lowest.
//    In other words if the array had the values in int 106,26,81,5,15 
//    your program should ultimately have an array with 106,81,26,15,5 in it.
//2. Set up the program so that the numbers to sort are read in from the keyword.
//3. Implement the following methods - getIntegers, printArray, and sortIntegers.
//    getIntegers returns an array of entered integers from keyword.
//    printArray prints out the contents of the array and sortIntegers should sort the array 
//    and return a new array containing the sorted numbers
//4. You will have to figure out how to copy the array elements from passed array into a new array 
//	and sort them and return the new sorted array.
public class Assignment_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] array = new int[] {3,4,6,9,15,106,26,81,5,15};
		int[] array = getInteger();
		int[] sortedArray = bubbleSort(array);
		printArray(sortedArray);
		
	}
	
	
	public static int [] getInteger () {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("How many numbers would you like to enter?");
		int inputNumber = scanner.nextInt();
		
		while (inputNumber<0||inputNumber>10){
			inputNumber = scanner.nextInt();
		} 
		
		int [] arrayUserInput = new int[inputNumber];
		
		for (int i = 0; i < inputNumber ; i++) {
			System.out.println("Please enter number #"+(i+1));
			arrayUserInput[i] = scanner.nextInt();
		}	
		scanner.close();
		return arrayUserInput;
		
	}
	
	public static void printArray (int [] array) {
		System.out.println("-------------Printing... ------------");
		for (int element : array) {
			System.out.println(element);
		}
		System.out.println("=====Printing successfully completed=====");
	}
	
	
	public static int[] bubbleSort(int [] array)  { 
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) 
                if (array[j] < array[j+1]) 
                { 
                    // swap temp and arr[i] 
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                } 
        }
        System.out.println("=====Sorting Array successfully completed=====");
        return array;
    }
	
}

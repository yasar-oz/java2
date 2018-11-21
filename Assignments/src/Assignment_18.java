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
		int[] array = new int[] {3,4,6,9,15,106,26,81,5,15};
		int[] sortedArray = new int [array.length];
		sortedArray = bubbleSort(array);
		for (int element : array) {
			System.out.println(element);
		}
		
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
        return array;
    }

}

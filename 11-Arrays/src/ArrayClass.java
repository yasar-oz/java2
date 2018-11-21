import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myIntArray = new int [10];
		myIntArray[0]=35;
		myIntArray[1]=30;
		
		int[] myIntArray2 = {1,20,30,4,5};
		
		System.out.println(myIntArray[2]+"|"+myIntArray2[4]);
		
		int[] array = getIntegers(2);
//		System.out.println(Array.toString(array));
		System.out.println(getAverage(array));
		
		
	}
	
	public static int[] getIntegers(int number) {
        int [] myReturnArr = new int[number];
        Scanner scanner= new Scanner(System.in);
        int count=0,num=0;
    while(count<number) {
        System.out.println("Enter a number " + count+1 + ":");
        boolean bool=scanner.hasNextInt();
        if(bool) {
            num=scanner.nextInt();
            myReturnArr[count]=num;
            count++;
        }else {
            System.out.println("Invalid Number");
            
        }
    
    }
    return myReturnArr;
    }
	
	public static double getAverage(int[] array) {
		double avg; int sum = 0;
		for (int i=0;i<array.length;i++) {
			sum = array[i];
		}
		return (double)sum/array.length;
	}
}

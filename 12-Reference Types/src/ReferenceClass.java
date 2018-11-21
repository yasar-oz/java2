import java.util.Arrays;

public class ReferenceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myIntValue = 10;
		int anotherInt = myIntValue;
		
		System.out.println(myIntValue);
		System.out.println(anotherInt);
		
		anotherInt=anotherInt+1;
		System.out.println(myIntValue);
		System.out.println(anotherInt);
		
		int[] myIntArray = new int[5];
		int[] anotherArray = myIntArray;
		
		System.out.println(myIntArray);
		System.out.println(anotherArray);
		System.out.println(Arrays.toString(myIntArray));
		System.out.println(Arrays.toString(anotherArray));
		
		anotherArray[1]=1;
		System.out.println(Arrays.toString(myIntArray));
		System.out.println(Arrays.toString(anotherArray));
		
	}

}

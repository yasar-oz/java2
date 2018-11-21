//Write a method hasEqualSum with 3 parameters of type int
//
//The method should return boolean and it needs to return true 
//if sum of first and second parameter is equal to third parameter. Otherwise return false.
//
//Sample Outputs:

public class Assignment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasEqualSum(1,1,1)); //= > false
		System.out.println(hasEqualSum(1,1,2)); //= > true
		System.out.println(hasEqualSum(1,-1,0)); //= > true
	}
	
	public static boolean hasEqualSum (int a, int b, int c) {
		if (a+b==c) {
			return true;
		}
		return false;
	}
		
}

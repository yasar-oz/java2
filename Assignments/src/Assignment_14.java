//Write a method called isPalindrome with one int parameter called number.
//The method needs to return a boolean.
//It should return true if the number is a palindrome number otherwise it should return false.
//
//Sample Output:
//
//
//Hint:
//What is a Palindrome number? A palindrome number is a number which when reversed is equal to the original number.
//For example: 121, 12321, 1001 etc
//
//Logic to check a palindrome number:
//Find the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
//If both are the same then the number is a palindrome otherwise it is not.
//
//Logic to reverse a number:
//Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
//Extract the last digit to some variable say lastDigit = num % 10
//Increase the place value of reverse by one.
//To increase place value multiply reverse variable by 10 e.g reverse = reverse * 10
//Add lastDigit to reverse
//Since last digit of num is processed, remove last digit of num. To remove last digit divide num by 10
//Repeat steps until num is not equal to (or greater than) zero.

public class Assignment_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome(-1221)); // - > should return true
		System.out.println(isPalindrome(707)); //- > should return true
		System.out.println(isPalindrome(11212));// - > should return false because reverse is 21211 and that is not equal to 11212
	
	}

	public static boolean isPalindrome (int number) {
		int reverse=0;
		int temp=number;
		while(number!=0) {
			int lastDigit=number%10;       
			reverse=(reverse*10)+lastDigit;
			number=number/10;              
			
		}
		if (temp==reverse) {
			System.out.println("Number "+temp+" is a palindrome number");
			return true;
		} else {
			System.out.println("Number "+temp+" is NOT a palindrome number");
			return false;
		}
	}
}

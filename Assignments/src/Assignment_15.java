

//Write a method names sumFirstAndLastDigit with one parameter of type int called number.
//The method needs to find the first and last digit of the parameter number passed to the method, 
//using a loop and return the sum of the first and last digit of that number.
//If the number is negative then the method needs to return -1 to indicate an invalid value.

public class Assignment_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumFirstAndLastDigit(252)); //should return 4, first digit 2 and the last is 2 which gives us 2+2 and the sum is 4
		System.out.println(sumFirstAndLastDigit(257)); //should return 9, first digit 2 and the last is 9 which gives us 2+7 and the sum is 9
		System.out.println(sumFirstAndLastDigit(0)); //should return 0, first digit 0 and the last is 0 which gives us 0+0 and the sum is 0
		System.out.println(sumFirstAndLastDigit(5)); //should return 10, first digit 5 and the last is 5 which gives us 5+5 and the sum is 10
		System.out.println(sumFirstAndLastDigit(-10)); //should return -1, because the parameter is negative
	}
	
	static int sumFirstAndLastDigit(int number) {
		int output;
		if (number<0) {
			output=-1;
			return output;
		}
		output=number%10;
		while ((number/10)>1) {
			number=number/10;
		}
		output+=number;
		return output;
	}
	
	

}

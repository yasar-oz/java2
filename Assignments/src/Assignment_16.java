//Write a method named getEvenDigitSum with one parameter of type int called number. 
//The method should return the sum of the even digits within the number. 
//If the number is negative, the method should return -1 to indicate an invalid value.
//
//Sample Output:

public class Assignment_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getEvenDigitSum(123456789)); //should return 20 since 2+4+6+8=20.
		System.out.println(getEvenDigitSum(252)); //should return 4 since 2+2=4.
		System.out.println(getEvenDigitSum(-22)); //should return -1 since the number is negative.
	}
	
	public static int getEvenDigitSum (int number) {
		int sum = 0;
		if (number<0) {
			sum = -1;
			return sum;
		}
		
		while (number>0) {
			if ((number%10)%2 ==0) {
				sum+=number%10;
			}
			number=number/10;
		}
		return sum;
	}

}

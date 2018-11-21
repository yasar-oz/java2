import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
//		System.out.println("Enter a byte value");
//		byte b1 = scanner.nextByte();
//		System.out.println("My byte value is "+b1);
//		
		System.out.println("Enter a short value");
		short b1 = scanner.nextShort();
		System.out.println("My short value is "+b1);
		
//		scanner.nextLine();
		System.out.println("Enter a String value");
		String b2 = scanner.next();
		System.out.println("My String value is "+b2);
		
		scanner.close();
	}

}

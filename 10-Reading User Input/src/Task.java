import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		byte count = 1;
		int sum = 0;
		while (count<11) {
			System.out.println("Enter number #"+count);
			boolean bool=scanner.hasNextInt();
			if (bool==false) {
				System.out.println("Enter a valid number");
			} else {
			int number = scanner.nextInt();
			count++;
			sum+=number;
			}
			// CAUTION When string is used although an integer is required it is a must!!!
			scanner.nextLine();
		} 
		scanner.close(); 
		System.out.println("Total of 10 numbers is "+sum);
		
		
	}

}

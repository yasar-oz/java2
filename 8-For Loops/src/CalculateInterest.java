
public class CalculateInterest {

	public static void main(String[] args) {
		// interest of $10000 for %2 interest
		// interest of $10000 for %3 interest
		// interest of $10000 for %4 interest
		// interest of $10000 for %5 interest
		
		for (int i=2;i<6;i++) {
			System.out.println(calculateInterest (10000,i));
		}	
	}
	
	public static double calculateInterest (double amount, double interestRate) {
		return amount * (interestRate/100);
	}

}

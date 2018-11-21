//Write a JAVA program to calculate the tax:
//
//income ≤ 150,000,000 tax ratio %25
//income ≤ 300,000,000 tax ratio %30
//income ≤ 600,000,000 tax ratio %35
//income ≤ 1,200,000,000 tax ratio %40
//income > 1,200,000,000 tax ratio %50
//
//Create needed variables and print the tax 




public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long income=400_000_000L;
		double totalTax=0;
		if (income>=0 && income >= 150_000_000) {
			totalTax = income*.25;
			
		} else if (income > 150_000_000&& income <= 300_000_000) {
			totalTax = 150_000_000*.25 + (income-150_000_000)*.30;
			
		} else if (income > 300_000_000&& income <= 600_000_000) {
			totalTax = 150_000_000*.25 + 150_000_000*.30 + (income-300_000_000)*.35;
			
		} else if (income > 600_000_000&& income <= 1.200_000_000) {
			totalTax = 150_000_000*.25 + 150_000_000*.30 + 300_000_000*.35 + (income-600_000_000)*.40;
			
		} else if (income > 1_200_000_000) {
			totalTax = 150_000_000*.25 + 150_000_000*.30 + 300_000_000*.35 + 600_000_000*.40 + (income-1.200_000_000)*.50;
			
		} else if (income <0) {
			System.out.println("Please enter a valid number");
		} 
		System.out.println("Total Tax : "+totalTax);
	}

}

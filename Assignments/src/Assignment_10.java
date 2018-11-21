//
//Write a method printYearsAndDays with parameter of type long named minutes
//The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter
//If parameter is less than 0, print "Invalid Value"
//Otherwise if parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d"
//XX represents the original value minutes. YY represents the calculated years. ZZ represents the calculated days.
//
//Sample Outputs:

//Tips:
//
//Use the remainder operator
//hour = 60 minutes
//1 day = 24 hours
//1 year = 365 days

public class Assignment_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printYearsAndDays(525600);// = > "525600 min = 1 y and 0 d"
		printYearsAndDays(1051200);// = > "1051200 min = 2 y and 0 d"
		printYearsAndDays(561600);// = > "561600 min = 1 y and 25 d"

	}
	
	public static void printYearsAndDays(long minutes) {
		
		if (minutes < 0 ) {
			System.out.println("Invalid value");
		}
		int years=(int) minutes/(365*24*60);
		minutes=(int)(minutes%(365*24*60));
		int days=(int)minutes/(24*60);
		System.out.println(minutes+"minutes : "+years+" years and "+days+" days ");
	}

}

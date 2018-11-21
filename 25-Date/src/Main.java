import java.text.ParseException; //another solution for exception handling
import java.text.SimpleDateFormat; //another solution for exception handling
import java.util.*;

public class Main {

	public static void main(String[] args) throws ParseException { //one solution for exception handling

		//Simple format is a concrete class for formatting and parsing date which inherits
		//java.text.Dateformat class 
		//formatting means converting date to string, and parsing means converting string to date
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");//M months, m minutes 
		String strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("MM/dd/yyyy");
		strDate=formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate=formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd MMM yy"); //abbreviated month + short year
		strDate=formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy"); //full name
		strDate=formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy hh:mm:ss zzzz"); //zzzz timezone
		strDate=formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("EEEE,dd MMMM yyyy hh:mm:ss z"); //z timezone, E gives Wed, Tue EEEE full day name
		strDate=formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd/MM/yyyy");//M months, m minutes 
		try {
			date=formatter.parse("31/03/2015");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(date);
		
	}

}

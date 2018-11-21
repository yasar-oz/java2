
public class FeetInchCentimeterConversion {

	public static void main(String[] args) {
		
		calcFeetAndInchesToCentimeters(100);
	

	}
	
	public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
		
		if(feet<0 || (inches<0 || inches>12)) {
			System.out.println("Invalid feet or inches");
			return -1;
		}
		
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		
		System.out.println(feet +" feet, " + inches + "inches=" + centimeters + " centimeters" );
	
		
		return centimeters;
		
	}  
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if(inches<0) {
			return -1;
		}
		
		double feet = (int)inches / 12 ;
		double remainingInches = (int)inches % 12;
		
		System.out.println(inches  + " inches=" + feet + " feet and " + remainingInches + " inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}
	
	
	
}




//public class FeetInchCentimeterConversion {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		double result = calcFeetAndInchesToCentimeters (125);
//		result = calcFeetAndInchesToCentimeters(6,0);
//		result = calcFeetAndInchesToCentimeters(-10, 0);
//		result = calcFeetAndInchesToCentimeters(0, 1);
//		result = calcFeetAndInchesToCentimeters(100);
//		result = calcFeetAndInchesToCentimeters(156);
//
//	}
//	
//	public static double calcFeetAndInchesToCentimeters (double feet, double inch) {
//		double result;
//		if (feet>=0 && (inch>=0 && inch <=12)) {
//			result=12*feet+inch;
//			System.out.println(feet+"feet, "+inch+" inches equal to"+result+" centimeters");
//		} else {
//			System.out.println("Invalid feet and/or Invalid inches ");
//			result = -1;
//		}
//		return result;
//		
//	}
//	
//	public static double calcFeetAndInchesToCentimeters (double inch) {
//		double result,feet=0;
//		if (inch>=0) {
//			feet=(inch-inch%12)/12;
//			inch=inch%12;
//			System.out.println(inch+" inches equal to "+feet+" feets and "+(inch)+" inches");
//		} else {
//			result = -1;
//			System.out.println("Invalid inches ");
//		}
//		result = calcFeetAndInchesToCentimeters (feet, inch);
//		
//		return result;
//		
//	}
//
//}

package Computer;

public class Main {

	public static void main(String[] args) {
		
		Dimensions theDimensions = new Dimensions (20,20,5);
		
		Case theCase = new Case ("2208", "Dell", "240", theDimensions);
		
		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		
		Monitor theMonitor = new Monitor("27 inch Beat", "Acer", 27, new Resolution(2540,1440));
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		
		//The PC only has access to PC class/reference 
		
		thePC.getTheMonitor().drawPixelAt(1, 2, "blue");
		thePC.getTheMotherboard().loadProgram("windows 1.0");
		thePC.getTheCase().pressPowerButton();
		thePC.getTheMonitor().getResolution1().getHeight();
	}

}

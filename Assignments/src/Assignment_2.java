/*The cat spend most of the day playing. 
 * In particular, they play if the temperature is between 25 and 35(inclusive). 
 * Unless it is summer, then the upper limit is 45(inclusive) instead of 35.

Write a method isCatPlaying that has 2 parameters. 
Method needs to return true if cat is playing, otherwise return false.
First parameter should be of type boolean and be named summer it represents if it is summer. 
Second parameter represents the temperature and is of type int with the name temperature.

Sample Outputs:

isCatPlaying(true,10) = > false
isCatPlaying(false,36) = > false
isCatPlaying(false,35) = > true*/


public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isCatPlaying(true,10)); //= > false
		System.out.println(isCatPlaying(false,36)); //= > false
		System.out.println(isCatPlaying(false,35)); //= > true

	}
	
	public static boolean isCatPlaying (boolean summer,int temperature) {
		int lowerLimit=25;
		int upperLimit=35;
		if (summer) {
			upperLimit = 45;
		}
		
		if (temperature <lowerLimit ||temperature >upperLimit) {
			return false;
		}

		return true;
	}

}

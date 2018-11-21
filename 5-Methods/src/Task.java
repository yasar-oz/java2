
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String playerName = "Mike Smith";
		displayHighScorePosition(playerName,calculateHighScorePosition (1500));
		displayHighScorePosition(playerName,calculateHighScorePosition (900));
		displayHighScorePosition(playerName,calculateHighScorePosition (400));
		displayHighScorePosition(playerName,calculateHighScorePosition (50));
	}
	
	
	public static void displayHighScorePosition (String playerName,int position) {
		
		System.out.println(playerName+" managed to get into position "+position);
		
	}
	
	public static int calculateHighScorePosition (int score) {
		byte position;
		if (score >= 1000) {
			position = 1;
		} else if (score >= 500&&score<1000){
			position = 2;
		} else if (score >= 100&&score<500){
			position = 3;
		} else {
			position = 4;
		} 
		return position;
	}

}

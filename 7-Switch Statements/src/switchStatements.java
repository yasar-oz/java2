
public class switchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int switchValue=3;
		switch(switchValue) {
		case 1:
			System.out.println("value was 1");
			break;
		
		case 2:
			System.out.println("value was 2");
			break;
		
		case 3: case 4: case 5:
			System.out.println("value was 3, or 4, or 5");
			break;
	
		default:
			System.out.println("value was not a correct one");
			break;
		}
	}
}

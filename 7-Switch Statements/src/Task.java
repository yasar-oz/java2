
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char selection='A';
		
		switch (selection) {
		case 'A': case 'B': case 'C': case 'D': case 'E': 
			System.out.println(selection+" was found");
			break;
		
		default:
			System.out.println(selection+" was not found");
		}
	}

}

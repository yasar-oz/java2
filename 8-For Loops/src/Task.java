
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0; byte counter=0;
		for (int i=1;i<=1000&&counter!=5;i++) {
			if (i%(3*5)==0 ) {
				System.out.println(i);
				counter++;
				sum+=i;
			}
		}
		System.out.println(sum);	
		

		
		
	}
}

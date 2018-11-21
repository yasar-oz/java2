
public class StaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<10;i++) {
			
			StaticTest static1 = new StaticTest("instance-"+i);
			System.out.println(static1.getName()+" is instance number "+static1.getNumInstance());	
			
		}
		
	}

}

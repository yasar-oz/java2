
public class StaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abc x = new Abc();
		x.show2();
		Abc.show1();
	}
}

class Abc {
	public static void show1() {
		System.out.println("hi");

	}
	public void show2() {
		System.out.println("hi");
		
	}
	public void show3() {
		System.out.println("hi");
		
	}
	public static void show4() {
		System.out.println("hi");
	}	

}

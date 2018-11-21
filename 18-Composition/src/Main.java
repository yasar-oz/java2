
public class Main {

	public static void main(String[] args) {
		Honda h1 = new Honda ("red", 200, new Engine(3)); // or assign Engine e1 = new Engine() and then send e1 as a parameter
		h1.carInfo();
		h1.startHonda();
	}

}


public class Dog extends Animal{

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	//Animal a = new Animal();
	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,
			String coat) {
		super(name, brain, body, size, weight); 
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	public void chew () {
		System.out.println("chewing");
	}
	
	public void walk () {
		System.out.println("walking");
		super.move(50);
	}
	
	@Override 
	public void eat () { //object.eat() called, it will print this method. It will override
		System.out.println("Dog.eat() called. eating");
		super.eat();
		walk();
	}
	
	
}

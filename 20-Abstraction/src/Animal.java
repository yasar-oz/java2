
public abstract class Animal { //abstract class

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public abstract void eat (); //abstract method does not have body
	public abstract void breathe ();
	
	public String getName() {  //concrete 
		return name;
	}
	
}

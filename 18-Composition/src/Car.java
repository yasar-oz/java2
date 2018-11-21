
public class Car {
	
	private String color;
	private int MaxSpeed;
	
	public void carInfo() {
		System.out.println("car color: "+color+"Max speed: "+MaxSpeed);
	}
	
	public Car(String color, int maxSpeed) {
		this.color = color;
		this.MaxSpeed = maxSpeed;
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return MaxSpeed;
	}
	
	
	
	
	
}

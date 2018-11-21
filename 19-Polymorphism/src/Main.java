
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bird bird1 = new Bird();
//		bird1.speak();
//		
//		Dog dog1 = new Dog();
//		dog1.speak();
//		
//		Cat cat1 = new Cat();
//		cat1.speak();
		
//		Animal c1 = new Cat(); //Reference object = new Class()
//		c1.speak();
//		Animal a1 = new Dog(); //Reference object =
//		a1.speak();
//		Animal b1 = new Bird(); //Reference object = 
//		b1.speak();
		
//		Animal a = new Dog();
//		a.speak();
//		
//		a=new Cat();
//		a.speak();
//		
//		a=new Bird();
//		a.speak();
		
		Animal animal[]=new Animal[]{new Dog(),new Cat(),new Bird()};
        for(int i=0; i<3; i++){
            animal[i].speak();
        }
		
		
		
	}

}

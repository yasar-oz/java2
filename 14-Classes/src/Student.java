
public class Student {

	public String name;
	public int age;
	public char gender;
	public int year;
	public String course;
	public static String university="Cybertek";
	
	
	public Student(String name, int age, char gender, int year, String course) {
	
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;

	}

	public Student(String studentName, int age, char gender) {

		name = name;
		this.age = age;
		this.gender = gender;
	}


	public void attendLecture() {
		System.out.println(name+" Attending class at "+university);

	}
	
	public void submitAssignment() {
		System.out.println(name+" Attending Assignment");

	}
	
	public void attendLab() {
		System.out.println(name+" Attending Lab");

	}
	
}

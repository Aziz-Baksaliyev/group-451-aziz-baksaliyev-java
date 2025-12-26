package homework_1;

public class Animal {
	String name;
	String habitat;
	int age;
	
	public Animal(String name, String habitat, int age) {
		this.name = name;
		this.habitat = habitat;
		this.age = age;
		showInfo();
	}
	
	public void showInfo() { 
		System.out.println("Name:" + this.name + ", " + "Habitat: " + this.habitat + ", " + "Age: " + this.age);
	}
}

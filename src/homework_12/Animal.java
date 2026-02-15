package homework_12;

public class Animal {
	    String name;
	    int age;
	    int hunger = 0;

	    public Animal(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void makeSound() {
	        System.out.println(name + " издает звук");
	    }

	    public void feed() {
	        hunger = hunger - 5;
	        if (hunger < 0) hunger = 0;
	        System.out.println(name + " поел. Голод: " + hunger);
	        ////................ не смог
	    }
}

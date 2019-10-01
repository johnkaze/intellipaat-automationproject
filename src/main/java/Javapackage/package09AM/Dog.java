package Javapackage.package09AM;

public class Dog extends Animal {

	void bow() {
		System.out.println("Dog can say bow");
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.eat();
		
		dog.walk();
		
		//dog.run();
		
		dog.bow();
	}
}

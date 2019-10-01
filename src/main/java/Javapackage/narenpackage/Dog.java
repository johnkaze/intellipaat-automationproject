package Javapackage.narenpackage;

public class Dog extends Animal {

	void bow() {
		System.out.println("Dog can say bow");
	}

	public static void main(String[] args) {

		Dog dog = new Dog();

		System.out.println(dog.name);
		System.out.println(dog.age);

		dog.bow();
		dog.eat();
		dog.walk();
		dog.run();

	}


}

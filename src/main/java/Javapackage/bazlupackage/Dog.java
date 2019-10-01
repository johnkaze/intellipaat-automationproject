package Javapackage.bazlupackage;


public class Dog extends Animal {

	void bow() {
		System.out.println("Dog can say bow");
	}

	public static void main(String[] args) {

		Dog dog = new Dog();

		dog.walk();

		dog.eat();

		dog.run();

		dog.bow();

		dog.name = "Dog";
		dog.age = 10;

		System.out.println(dog.name);
		System.out.println(dog.age);


	}


}

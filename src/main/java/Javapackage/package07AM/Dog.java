package Javapackage.package07AM;


import Javapackage.package08am.Animal2;

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

		System.out.println(dog.name);
		System.out.println(dog.age);
		System.out.println(dog.rno);

		Animal2 obj = new Animal2();

		obj.walk();
		obj.eat();
		obj.run();

		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.rno);

	}


}

package Javapackage.navathapackage;

public class Cat extends Animal {

	void meow() {
		System.out.println("Cat can say meow");
		name = "Cat";
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		cat.walk();
		
		cat.eat();
		
		cat.run();
		
		cat.meow();

	}

}

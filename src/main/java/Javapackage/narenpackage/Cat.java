package Javapackage.narenpackage;

public class Cat extends Animal {
	String name = "Cat";

	Cat() {
		super();
	}
	
	void meow() {
		System.out.println("Cat can say meow");
		System.out.println(super.name);
		System.out.println(this.name);
		super.eat();
	}

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		cat.walk();
		
		cat.eat();
		
		cat.run();
		
		cat.meow();
		
	}
	
	
}

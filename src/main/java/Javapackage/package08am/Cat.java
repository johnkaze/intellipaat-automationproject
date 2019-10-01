package Javapackage.package08am;

public class Cat extends Animal {
	
	void meow() {
		System.out.println("Cat can say meow");
	}

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		cat.walk();
		
		cat.eat();
		
		cat.run();
		
		cat.meow();

		cat.name = "Cat1";

		System.out.println(cat.name);
		
	}
	
	
}

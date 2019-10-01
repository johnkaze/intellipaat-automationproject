package Javapackage.package09AM;

public class Cat extends Animal {
	
	String name1;
	
	Cat(){
		//super();
		System.out.println("Defult constructor");
	}
	
	Cat(String name1) {
		//this();
		super();
		System.out.println("Parameterized constructor");
		this.name1 = name1;
	}
	
	void jump() {
		System.out.println("Cat can jump");
		System.out.println(super.name);
		System.out.println(this.name1);
	}
	
	void meow() {
		System.out.println("Cat can say meow");
		super.walk();
		this.display();
	}
	
	void display() {
		System.out.println("display method");
	}
	
	String run(String name, int b) {
		System.out.println("Cat can run");
		return "";
	}
	
	// static methods cannot be overridden
	/*void walk() {
		System.out.println("Any animal can walk");
	}*/
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		Animal.walk();
		
		cat.eat();
		
		cat.jump();
		
		//cat.run();
		
		System.out.println(cat.name);
	}

}

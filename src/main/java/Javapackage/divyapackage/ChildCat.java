package Javapackage.divyapackage;

public class ChildCat extends Cat {
	
	void feed() {
		System.out.println("Child Cat can get feed from parent cat");
	}

	public static void main(String[] args) {
		
		ChildCat cat = new ChildCat();
		
		cat.walk();
		
		cat.eat();
		
		cat.run();
		
		cat.meow();
		
		cat.feed();

		cat.name = "ChildCat";

		cat.age = 1;

		System.out.println(cat.name);
		System.out.println(cat.age);
		
	}
	
	
}

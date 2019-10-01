package Javapackage.package06AM;

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
		
	}
	
	
}

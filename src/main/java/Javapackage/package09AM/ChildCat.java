package Javapackage.package09AM;

public class ChildCat extends Cat {
	
	void feed() {
		System.out.println("Child cat can get feed by parent cat");
	}

	public static void main(String[] args) {
		ChildCat cc = new ChildCat();
		
		cc.jump();
		cc.eat();
		cc.walk();
		//cc.run();
		cc.meow();
		cc.feed();
		
	}
	
}

package Javapackage.package09AM;

public class Animal {
	
	String name = "Animal";
	
	static String country = "India";
	
	String run(String str, int a) {
		System.out.println("Any animal can run");
		return "";
	}
	
	void eat() {
		System.out.println("Any animal can eat");
	}
	
	// static methods cannot be overridden
	static void walk() {
		System.out.println("Any animal can walk");
	}

}

package Javapackage.package06AM;

public class ConstructorExample {

	/**
	 * Constructor of a class is a special type of method which is not having any return type.
	 * 
	 * Constructor name must be same as the class name.
	 * 
	 * Types:: 
	 * 1. Default 
	 * 2. Parameterized
	 * 
	 * 
	 */

	ArrayExample arrayExample;
	
	String name;
	int age;
	int rno;

	ConstructorExample() {
		System.out.println("I am default constructor");
		arrayExample = new ArrayExample();
	}
	
	ConstructorExample(String name1, int age1, int rno1) {
		name = name1;
		age = age1;
		rno = rno1;
	}

	void m1() {
		System.out.println("Method m1()");
		System.out.println("String type of data :: "+m2());
		System.out.println("int type of data :: "+m3());
		System.out.println("long type of data :: "+m4());
		arrayExample.m1();
	}

	String m2() {
		System.out.println("Returning string type of data");
		return "Java";
	}

	public static int m3() {
		return 1;
	}

	long m4() {
		return 9912127022L;
	}

	void m5(int a) {

	}
	
	void display() {
		System.out.println("Name is :: "+name+" age is :: "+age+" rno is :: "+rno);
	}

	public static void main(String[] args) {
		
		ConstructorExample obj = new ConstructorExample();
		obj.display();
		
		//obj.m1();
		
		ConstructorExample obj1 = new ConstructorExample("Java", 10, 1);
		
		obj1.display();
		
		
		ConstructorExample obj2 = new ConstructorExample("Python", 11, 2);
		
		obj2.display();
		
		ConstructorExample obj3 = new ConstructorExample("c#", 12, 3);
		
		obj3.display();
		
	}

}

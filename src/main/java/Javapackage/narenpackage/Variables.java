package Javapackage.narenpackage;


public class Variables {

	/**
	 
	 Variable :: Temporary memory location which hold only one value at a time. 
	 
	 Syntax :: 
	 
	 datatype varname1 = value;
	 
	 datatype varname2;
	 
	  Types :: 
	  1. Local Variable :: Declared inside a method
	  2. Instance Variable :: Declared inside a class and out side a method
	  3. Static Variable :: Declared inside a class and out side a method with static keyword
	  
	  
	 */
	
	String name = "Java"; // Instance Variable
	int age = 30;
	
	static String country = "India"; // Static Variable
	
	void m1() {
		int rno = 10; // Local Variable
		System.out.println(name);
	}
	
	void m2() {
		int rno = 10; // Local Variable
		System.out.println(rno);
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {

		Variables variables = new Variables();
		
		variables.m1();
		variables.m2();

		System.out.println(variables.name);

	}
	
	
	
	
	
	
	
	
	
	
	
}

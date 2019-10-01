package Javapackage.package07AM;

public class VariablesExample {
	/*
	 * Variable :: Temporary memory location to store single value at a time.
	 * 
	 * Syntax :: 
	 * 
	 * datatype varname;
	 * 
	 * datatype varname = value;
	 * 
	 * Types of variables ::
	 * 
	 * 1. instance
	 * 2. static
	 * 3. local
	 * 
	 */
	
	// Instance variables
	int rno = 10;

	long mno = 9912127022L;
	
	float money = 1000.50f;
	
	// static variables
	static String country = "India";
	
	void m1(int age) {
		String name = "Java"; // Local variables
		System.out.println(name);
		System.out.println(age);
		System.out.println(money);
		System.out.println(VariablesExample.country);
	}
	
	void m3() {
		//System.out.println(name);
		//System.out.println(age);
	}
	
	static void m2() {
		System.out.println(country);
		
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(country);
		
		
	}
	
	
	
	
	
	
	
	
}

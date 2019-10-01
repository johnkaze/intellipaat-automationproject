package Javapackage.package09AM;

public class VariablesExample {
	
	/*
	 * Variable :: Temporary memory location to store a single value
	 * 
	 * Syntax :: 
	 * 
	 * 	datatype nameofvariable = valueofvariable;
	 * 
	 * datatype nameofvariable;
	 * 
	 * long phonenum = 9912127022L;
	 * 
	 * int rollno = 10;
	 * 
	 * String name = "Java"; // null
	 * 
	 * boolean var; // false
	 * 
	 * Types of Variable ::
	 * 1. Local
	 * 2. Instance
	 * 3. Static
	 * 
	 * nameofvariable = 10;
	 * 
	 */
	
	String sname = "Chandra"; // Instance Variable
	
	static String country = "USA"; // static Variable
	
	void m1(String name) {
		System.out.println(name);// name :: Local variable
		int rno = 10; // Local Variable. // = Assignment operator
	}
	
	void m2() {
		System.out.println(sname);
		//System.out.println(name);
	}
	
	void add(int b) {
		int a = m3();
		System.out.println(a); // 400
		System.out.println(a+b); // 600
	}
	
	int m3() {
		int x = 400;
		return x;
	}
	
	
	public static void main(String[] args) {
		
		VariablesExample obj = new VariablesExample();
		
		//obj.m1("java"); // java
		//obj.m2(); // Chandra
		
		//System.out.println(obj.sname); // Chandra
		
		//System.out.println(VariablesExample.country1); // USA
		
		obj.add(200);
		
	}

}

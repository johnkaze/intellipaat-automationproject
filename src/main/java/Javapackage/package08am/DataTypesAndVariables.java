package Javapackage.package08am;

class DataTypesAndVariables {

	// instance variables
	
	//List<Object> list = new ArrayList<String>();
	
	byte b = 0001;
	
	short s = 9;
	
	int i = 10;
	
	long num = 9912127022L;
	
	double num1 = 12345.123d;
	
	float num2 = 1223.12f;
	
	boolean var = true;
	
	char c;
	
	String name = "Java";

	// static variable
	
	static String name2 = "Java";
	static String country = "India";
	
	void m1() {
		
		int var1 = 123; // local variable
		
		System.out.println("Hello java");
		System.out.println(var1);
		System.out.println(b);
		System.out.println(num);
		System.out.println(DataTypesAndVariables.name2);
	}
	
	void m2() {
		
		String var2 = "Java"; // local variable
		
		System.out.println(var2);
		System.out.println(b);
		System.out.println(num);
		System.out.println(DataTypesAndVariables.name2);
		System.out.println(DataTypesAndVariables.country);
		
	}
	
	static void m3() {
		System.out.println("Static method");
	}
	
	public static void main(String[] args) {
		
		DataTypesAndVariables t = new DataTypesAndVariables(); // object creation / instantiation
		
		t.m1(); // Hello java
		t.m2();
		
		DataTypesAndVariables.m3();
		
		System.out.println(t.c);
		System.out.println(t.name); // Java
		System.out.println(t.var); // true
		
		System.out.println(DataTypesAndVariables.country);
		
	}
	

}

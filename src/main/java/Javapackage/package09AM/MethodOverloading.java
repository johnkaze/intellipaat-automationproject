package Javapackage.package09AM;

public class MethodOverloading {
	/*
	 * Polymorphism :: 
	 * 
	 * 1. Method Overloading ::
	 * 		1. Method name can be same
	 * 		2. By changing Number of parameters.
	 * 		3. By changing type of parameters
	 * 		4. By changing only return type of method we cannot achieve method over loading
	 * 
	 * Use :: For readability 
	 * 
	 * 
	 * 2. Method Overriding ::
	 * 
	 * 1. Method name must same
	 * 2. Return type of method must be same
	 * 3. Number of parameters and type of parameters must be same
	 * 4. Two classes must be in parent child relationship
	 * 
	 * class A -> m();
	 * 
	 * class B -> m();
	 * 
	 * 
	 */
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	String add(int a, double b) {
		System.out.println(a+b);
		return "";
	}
	
	void add(float a, int b) {
		System.out.println(a+b);
	}
	
	void add(int a, float b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	void add(int a, double b, int c) {
		System.out.println(a+b+c);
	}
	
	static void add(double a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	static int[] arr = {10};
	static String[] arr2 = {"Java"};
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(10, 20);
		obj.add(10.50f, 30);
		obj.add(10, 20, 30);
		MethodOverloading.add(10.50d, 20, 30);
		MethodOverloading.main(arr);
		MethodOverloading.main(arr, arr2);
	}
	
	public static void main(int[] args) {
		System.out.println("int main method");
		//MethodOverloading obj = new MethodOverloading();
		//add(10, 20);
		//add(10.50f, 30);
		//add(10, 20, 30);
		MethodOverloading.add(10.50d, 20, 30);
	}
	
	public static void main(int[] args, String[] arrgs) {
		System.out.println("int, String main method");
		//MethodOverloading obj = new MethodOverloading();
		//add(10, 20);
		//add(10.50f, 30);
		//add(10, 20, 30);
		MethodOverloading.add(10.50d, 20, 30);
	}

}

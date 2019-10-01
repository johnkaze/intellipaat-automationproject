package Javapackage.package09AM;

public class Operators {

	/*
	 * Arithmetic Operators:
	 * 
	 * 1. Addition :: 
	 * 2. Subtraction :: 
	 * 3. Multiplication :: 
	 * 4. Division :: quotient
	 * 5. Modulus :: Remainder
	 * 
	 * 10)100(10
	 * 	  100
	 * 
	 * 	   0
	 * 
	 * 
	 * Unary Operators :: 
	 * 1. prefix :: pre-increament(++expression), pre-decreament(--expression)
	 * 2. postfix :: post-increament(expre++), post-Decreament(expr--)
	 * 
	 * 
	 * 
	 * 
	 */

	void arithmeticOperators() {
		System.out.println(10 + 20); // Addition // 30
		System.out.println(20 - 10); // Subtraction //10
		System.out.println(10 * 20); // Multiplication // 200
		System.out.println(100 / 10); // Division // 10
		System.out.println(100 % 10); // Modulus // 0
	}

	void unaryOperators() {

		int a = 10;
		System.out.println("Initially a is :: "+a);
		int b;

		/*b = ++a;
		System.out.println("After pre incre a is :: "+a);
		System.out.println("After pre incre b is :: "+b);*/

		/*b = --a; 
		System.out.println("After pre decre a is :: "+a);
		System.out.println("After pre decre b is :: "+b);*/

		/*b = a++; // b = 10, a=11
		System.out.println("After post incre a is :: "+a);
		System.out.println("After post incre b is :: "+b);*/

		b = a--; // b = 10, a=9
		System.out.println("After post decre a is :: "+a);
		System.out.println("After post decre b is :: "+b);


	}

	void relationalOperators() {

		int a = 10;
		int b = 20;
		int c = 20;

		System.out.println(a < b); // true
		System.out.println(a > b); // false
		System.out.println(b < a); // false
		System.out.println(b > a); // true

		System.out.println(a <= b); // true
		System.out.println(a >= b); // false
		System.out.println(b <= a); // false
		System.out.println(b >= a); // true

		System.out.println(a == b);// false
		System.out.println(a != b); // true
		System.out.println(b == c); // true

	}

	void bitwseLogicalOperators() {

		// OR
		System.out.println(true || true); // true
		System.out.println(false || true); // true
		System.out.println(true || false); // true
		System.out.println(false || false); // false
			

		// AND
		System.out.println(true && true); // true
		System.out.println(false && true); // false
		System.out.println(true && false); // false
		System.out.println(false && false); // false



	}

	public static void main(String[] args) {
		Operators obj = new Operators();
		//obj.arithmeticOperators();
		//obj.unaryOperators();
		//obj.relationalOperators();
		obj.bitwseLogicalOperators();


	}

}

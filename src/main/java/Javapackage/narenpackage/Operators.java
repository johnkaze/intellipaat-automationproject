package Javapackage.narenpackage;

public class Operators {

	void unaryOperators() {

		int a = 10;
		System.out.println("Intial value of variable a is :: "+a);
		int b; // 0

		// pre-increment operator

		/*b = ++a; // a = 11, b = 11
		System.out.println("After pre increment a is :: "+a);
		System.out.println("After pre increment b is :: "+b);*/

		// pre decrement operator

		/*b = --a; // a = 9, b = 9
		System.out.println("After pre decrement a is :: "+a);
		System.out.println("After pre decrement b is :: "+b);*/

		// post increment operator

		/*b = a++; // a = 11, b = 10
		System.out.println("After post increment a is :: "+a);
		System.out.println("After post increment b is :: "+b);*/

		// post decrement operator

		b = a--; // a = 9, b = 10
		System.out.println("After post decrement a is :: "+a);
		System.out.println("After post cecrement b is :: "+b);


	}

	void arithmeticOperators() {

		System.out.println(10 + 20);
		System.out.println(20 - 10);
		System.out.println(10 * 20);
		System.out.println(20 / 10); // quotient
		System.out.println(20 % 10); // remainder

	}

	void relationalOperators() {

		int a = 10;
		int b = 20;
		int c = 20;

		/*System.out.println(a < b); // true
		System.out.println(b < a); // false

		System.out.println(a > b); // false
		System.out.println(b > a); // true 

		System.out.println(a <= b); // true
		System.out.println(b <= a); // false 

		System.out.println(b >= a); // true
		System.out.println(a >= b); // false 

		System.out.println(a == b); // false
		System.out.println(b == c); // true */

		System.out.println(a != b); // true
		System.out.println(b != c); // false

	}

	static void bitwiseOperators() {

		/*System.out.println(true | true);  // true
		System.out.println(true | false);   // true
		System.out.println(false | true);   // true
		System.out.println(false | false);  // false 
		 */	

		System.out.println(true & true);  // true
		System.out.println(true & false);  // false
		System.out.println(false & true);  // false
		System.out.println(false & false); // false 

	}

	static void logicalOperators() {

		System.out.println(true || true);  // true
		System.out.println(true || false);   // true
		System.out.println(false || true);   // true
		System.out.println(false || false);  // false 

		/*System.out.println(true && true);  // true
		System.out.println(true && false);  // false
		System.out.println(false && true);  // false
		System.out.println(false && false); // false 
*/

	}


	public static void main(String[] args) {
		//unaryOperators();
		//arithmeticOperators();
		//relationalOperators();
		//bitwiseOperators();
		Operators.logicalOperators();

		Animal obj = new Animal();

		System.out.println(obj.name);
		obj.run();
	}

}

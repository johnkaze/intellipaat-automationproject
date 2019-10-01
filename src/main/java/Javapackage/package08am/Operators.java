package Javapackage.package08am;

public class Operators {

	static void unaryOperators() {
		
		int a = 10;
		int b;
		System.out.println("Initial value of a is :: " + a); // 10

		// pre-Increment(++expression)

		//a = a+1; //10+1;

		/*b = ++a; // a=11, b=11
		System.out.println("After pre increment a value is :: "+a); // 11
		System.out.println("After pre increment b value is :: "+b); // 11
*/
		// pre-decrement(--expression)

		//a = a-1; //10-1;

		/*b = --a; // a=9, b=9
		System.out.println("After pre decrement a value is :: "+a); // 9
		System.out.println("After pre decrement b value is :: "+b); // 9
*/
		// post-increment(expression++)

		//a = a+1; //10+1;

		/*b = a++; // a=11, b=10
		System.out.println("After post increment a value is :: "+a); // 11
		System.out.println("After post increment b value is :: "+b); // 10
*/
		// post-decrement(expression--)

		b = a--; // a=9, b=10
		System.out.println("After post decrement a value is :: "+a); // 9
		System.out.println("After post decrement b value is :: "+b); // 10


	}

	static void arithmeticOperators() {

		System.out.println(10 + 20); // 30
		System.out.println(20 - 10); // 10
		System.out.println(10 - 20); // -10
		System.out.println(10 * 20); // 200
		System.out.println(20 / 10); // 2 (Quotient)
		System.out.println(20 % 10); // 0  (Modulus :: Remainder)


		/*
		 * 10) 20 (2 
		 *     20
		 *    -----
		 *     0
		 */

	}

	static void relationalOperators() {

		int a = 10;
		int b = 20;
		int c = 20;

		System.out.println( a < b ); // true
		System.out.println( b < a ); // false

		System.out.println( a <= b); // true
		System.out.println( b <= a); // false

		System.out.println( b > a); // true
		System.out.println( a > b); // false

		System.out.println( b >= a); // true
		System.out.println( a >= b); // false

		System.out.println( b == c ); // true
		System.out.println( b == a ); // false

		System.out.println(a != b); // true
		System.out.println( b != c); // false

	}

	static void bitwiseOperators() {

		/*System.out.println(true  | true);  // true
		System.out.println(true  | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false); // false  	
*/		
		System.out.println(true  & true);  // true
		System.out.println(true  & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false); // false
		
	}

	static void logicalOperators() {

		/*System.out.println(true  || true);  // true
		System.out.println(true  || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false 	
*/		
		System.out.println(true  && true);  // true
		System.out.println(true  && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false    
		
	}

	public static void main(String[] args) {
		//unaryOperators();
		//arithmeticOperators();
		//relationalOperators();
		//bitwiseOperators();
		logicalOperators();
	}

}

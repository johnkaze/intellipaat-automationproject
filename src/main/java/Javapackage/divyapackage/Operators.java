package Javapackage.divyapackage;

public class Operators {

	 /*

	 Operators ::
	  1. Unary Operators ::
	  		1. Pre fix operators :: ++expression, --expression
	  		2. post fix operators ::
	  2. Arithmetic Operators :: +, -, *, /, %
	  3. Relational Operators :: <, <=, >, >=, ==, !=
	  4. Binary operators :: AND, OR
	  5. Logical Operators :: AND, OR
	  6. Assignment Operator :: =

	  */


    void unaryOperators() {
        // Pre-fix operators

        int a = 10;
        System.out.println("Initial value of a is :: " + a); // 10
        int b;

        // Pre-Increament Operator

        // a = a+1; // a = 10+1

        /*b = ++a; // a = 11, b = 11

        System.out.println("Incremented value of a is :: " + a); //11
        System.out.println("Value of b is :: " + b);//11
*/
        // pre-decrement operator
        //a = a - 1; a = 10-1

		/*b = --a; // a = 9, b = 9
		System.out.println("Decremented value of a is :: "+a); //9
		System.out.println("Value of b is :: "+b);//9*/


        // post-Increment Operator

        // a = a+1; // a = 10+1

		/*b = a++; // b = 10, a = 11
		System.out.println("Incremented value of a is :: "+a); //11
		System.out.println("Value of b is :: "+b);//10*/

        // post-decrement Operator

        // a = a+1; // a = 10+1

		b = a--; // b = 10, a = 9
		System.out.println("decremented value of a is :: "+a); //9
		System.out.println("Value of b is :: "+b);//10

    }

    void arithmeticOperators() {

        System.out.println("Addition is :: " + (10 + 20)); // 30
        System.out.println("Subtraction is :: " + (10 - 20)); // -10
        System.out.println("Multiplication is :: " + (10 * 20)); // 200
        System.out.println("Division is :: " + (30 / 10)); // Quotient (3)
        System.out.println("Modulus is :: " + (30 % 10)); // Remainder (0)

     /*

        10 ) 30 ( 3 = Quotient
             30
             -----
              0 = Remainder
             ------
*/
    }

    void relationalOperators() {

        int a = 10;
        int b = 20;
        int c = 20;

        System.out.println(a < b); // true
        System.out.println(b < a); // false

        System.out.println(b > a); // true
        System.out.println(a > b); // false

        System.out.println(a <= b); // true
        System.out.println(b <= a); // false

        System.out.println(b >= a); // true
        System.out.println(a >= b); // false

        System.out.println(b == c); // true
        System.out.println(a == b); // false

        System.out.println(b != a); // true
        System.out.println(c != b); // false

    }

    void bitwiseOperators() {

        // Bitwise OR operator
		System.out.println(true | true); // t
		System.out.println(true | false); // t
		System.out.println(false | true); // t
		System.out.println(false | false); // f

        // Bitwise AND operator
        System.out.println(true & true); // t
        System.out.println(true & false); // f
        System.out.println(false & true); // f
        System.out.println(false & false); // f


    }

    void logicalOperators() {

        // Logical OR operator
        System.out.println( true || true ); // t
        System.out.println(true || false); // t
        System.out.println(false || true); // t
        System.out.println(false || false); // f

        // Logical AND operator
        System.out.println(true && true); // t
        System.out.println(true && false); // f
        System.out.println(false && true); // f
        System.out.println(false && false); // f

    }

    public static void main(String[] args) {

        Operators obj = new Operators();

        //obj.unaryOperators();
        //obj.arithmeticOperators();
        //obj.relationalOperators();
        //obj.bitwiseOperators();
        obj.logicalOperators();
    }


}

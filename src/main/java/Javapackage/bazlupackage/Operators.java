package Javapackage.bazlupackage;

public class Operators {

	 /*

	 Operators ::
	  1. Arithmetic Operators :: +, -, *, /, %
	  2. Relational Operators :: <, <=, >, >=, ==, !=
	  3. Binary operators :: AND, OR
	  4. Assignment Operator :: =

	  */


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

    public static void main(String[] args) {

        Operators obj = new Operators();

        //obj.arithmeticOperators();
        //obj.relationalOperators();
        //obj.bitwiseOperators();
    }


}

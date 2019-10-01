package Javapackage.divyapackage;

public class ConstructorExample {

    /**
     * Constructor of a class is a special type of method which is not having return type.
     *
     * Constructor name must be same as the class name.
     *
     * Types::
     *
     * 1. Default ::
     * 2. Parameterized ::
     *
     */

    String name;
    int age;
    long ph;

    ConditionalStmts conditionalStmts;

    ConstructorExample() {
        System.out.println("I am a default constructor");
        conditionalStmts = new ConditionalStmts();
    }

	ConstructorExample(String name1, int age1, long ph1) {
		name = name1;
		age = age1;
		ph = ph1;
	}

    void display() {
        System.out.println("Name is :: " + name + " age is :: " + age + " ph is :: " + ph);
    }

    public static void main(String[] args) {

        ConstructorExample obj = new ConstructorExample();

        obj.display();

		ConstructorExample obj1 = new ConstructorExample("Java", 10, 1);
		
		obj1.display();

		ConstructorExample obj2 = new ConstructorExample("Python", 11, 2);
		
		obj2.display();
		
		ConstructorExample obj3 = new ConstructorExample("c#", 12, 3);
		
		obj3.display();

        ConstructorExample obj4 = new ConstructorExample("chandrashekhar", 30, 9999999999L);

        obj4.display();

    }

}

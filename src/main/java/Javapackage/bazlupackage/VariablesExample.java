package Javapackage.bazlupackage;

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
     * 1. Local :: Declared inside a method.
     * 2. Instance :: declared inside a class and outside a method.
     * 3. Static ::  declared inside a class and outside a method using static keyword.
     *
     */

    // Instance variables
    int rno;// = 10;

    long mno = 123456789L;

    float money = 1000.50f;

    // static variables
    static String country = "India";

    void m1(int age) {

        String name = "Java"; // Local variable

        System.out.println(name);
        System.out.println(rno);
        System.out.println(country);
    }

    void m2() {
        System.out.println(mno);

    }

    static void m3() {

        int n = 10;

        float m = 10.5f;

        //System.out.println(name);
        //System.out.println(money);

        System.out.println(country);

    }


    public static void main(String[] args) {


        System.out.println(country);


    }


}

package Javapackage.navathapackage;

public class VariablesExample {

    // instance variable

    int numstudents = 30;

    // static variables

    static String country = "India";
    static String country2 = "Usa";

    void m1() {

        // local variable
        int rno = 10;
        String name = "Java";
        System.out.println(rno);
        System.out.println(numstudents);
        System.out.println(country);

    }

    void methodOneExample() {
        //System.out.println(rno);
        System.out.println(numstudents);
        System.out.println(country);
    }


    void m3() {

        System.out.println("method m3()");

        int var = m4();

        System.out.println(var);

        long var1 = m5();

        System.out.println(var1);

    }

    int m4() {
        System.out.println("method m4()");
        return 10;
    }

    long m5() {
        System.out.println("method m5()");
        return 1000L;
    }


    public static void main(String[] arg) {

        VariablesExample obj = new VariablesExample();

        obj.m3();

        /*System.out.println(obj.numstudents);
        System.out.println(obj.country);

        System.out.println(VariablesExample.country2);*/

    }




}

package Javapackage.package08am;

public abstract class AbstractExample {

    String name;
    int age;
    int rno;

    // Non abstract method
    void m1() {
        System.out.println("I am non abstract method");
        System.out.println(name);
    }

    // abstract method
    abstract void m2();

}

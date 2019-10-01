package Javapackage.narenpackage;

public class Animal {
    /*
     * Inheritance ::
     *
     * extends
     *
     * Types ::
     *
     * 1. Single ::
     * 2. Multilevel ::
     * 3. Hierarchical ::
     * 4. multiple ::
     * 5. Hybrid
     *
     */

    public Animal() {
        System.out.println("Super constructor");
    }

    public String name = "Animal";
    public int age;

    public void walk() {
        System.out.println("Animals can Walk");
    }

    public void eat() {
        System.out.println("Animals can Eat");
    }

    public void run() {
        System.out.println("Animals can Run");
    }

    public static void m1() {
        System.out.println("Static method");
    }


}

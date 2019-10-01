package Javapackage.navathapackage;

public class Dog extends Animal {

    void bow() {
        name = "Dog";
        System.out.println(name);
        System.out.println("Dog can say bow");
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.bow();
        dog.eat();
        dog.walk();
        dog.run();

    }


}

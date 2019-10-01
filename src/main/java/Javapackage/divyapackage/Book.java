package Javapackage.divyapackage;

public class Book {

    int id;
    String name;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Id is :: " + this.id + " Name is :: " + this.name);
    }

}

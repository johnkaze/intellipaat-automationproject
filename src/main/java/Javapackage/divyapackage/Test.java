package Javapackage.divyapackage;

import java.util.LinkedList;
import java.util.List;

class Test {

    public static void main(String[] args) {

        Book b1 = new Book(1, "Java1");
        Book b2 = new Book(2, "Java2");
        Book b3 = new Book(3, "Java3");
        Book b4 = new Book(4, "Java4");
        Book b5 = new Book(5, "Java5");

        List<Book> books = new LinkedList<>();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        for (Book b : books) {
            b.display();
        }

    }

}

package students.ernests_subhankulovs.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("A1", "B1"));
        books.add(new Book("A2", "B2"));
        System.out.println("Book list:");
        for (Book b : books) {
            System.out.println("Author: " + b.getAuthor() + ", Title: " + b.getTitle());
        }
        System.out.println();
        Book bookInTheList = new Book("A1", "B1");
        System.out.println("Book \"B1\" is in the list: " + books.contains(bookInTheList));
        Book bookNotInTheList = new Book("A3", "B3");
        System.out.println("Book \"B3\" is in the list: " + books.contains(bookNotInTheList));
    }
}

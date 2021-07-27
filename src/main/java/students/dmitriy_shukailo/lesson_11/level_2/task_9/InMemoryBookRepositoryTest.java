package students.dmitriy_shukailo.lesson_11.level_2.task_9;

import java.util.Optional;

class InMemoryBookRepositoryTest {

    public static void main(String[] args) {

        InMemoryBookRepositoryTest test = new InMemoryBookRepositoryTest();

        test.shouldDeleteBooksById();
        test.shouldDeleteBooks();
        test.shouldFoundBooksById();
    }

    public void shouldDeleteBooksById() {

        var subject = new InMemoryBookRepository();
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        Book book3 = new Book("A3", "B3");

        subject.save(book1);
        subject.save(book2);
        subject.save(book3);

        Assertions.assertTrue(subject.delete(0L), "shouldDeleteBooksById (#0)");
        Assertions.assertTrue(subject.delete(1L), "shouldDeleteBooksById (#1)");
        Assertions.assertTrue(subject.delete(2L), "shouldDeleteBooksById (#2)");

        Assertions.assertFalse(subject.delete(0L), "shouldDeleteBooksById (#3)");
        Assertions.assertFalse(subject.delete(1L), "shouldDeleteBooksById (#4)");
        Assertions.assertFalse(subject.delete(2L), "shouldDeleteBooksById (#5)");

        System.out.println();
    }

    public void shouldDeleteBooks() {

        var subject = new InMemoryBookRepository();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        Book book3 = new Book("A3", "B3");

        subject.save(book1);
        subject.save(book2);
        subject.save(book3);

        Assertions.assertTrue(subject.delete(book1), "shouldDeleteBooks (#0)");
        Assertions.assertTrue(subject.delete(book2), "shouldDeleteBooks (#1)");
        Assertions.assertTrue(subject.delete(book3), "shouldDeleteBooks (#2)");

        Assertions.assertFalse(subject.delete(book1), "shouldDeleteBooks (#3)");
        Assertions.assertFalse(subject.delete(book2), "shouldDeleteBooks (#4)");
        Assertions.assertFalse(subject.delete(book3), "shouldDeleteBooks (#5)");

        System.out.println();
    }

    public void shouldFoundBooksById() {

        var subject = new InMemoryBookRepository();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        Book book3 = new Book("A3", "B3");

        subject.save(book1);
        subject.save(book2);
        subject.save(book3);

        Optional<Book> bookFindById0 = subject.findById(0L);
        Optional<Book> bookFindById1 = subject.findById(1L);
        Optional<Book> bookFindById2 = subject.findById(2L);

        Assertions.assertTrue(bookFindById0.isPresent(), "shouldFoundBooksById (#0)");
        Assertions.assertTrue(bookFindById1.isPresent(), "shouldFoundBooksById (#1)");
        Assertions.assertTrue(bookFindById2.isPresent(), "shouldFoundBooksById (#2)");

        subject.delete(book1);
        subject.delete(book2);
        subject.delete(book3);

        Optional<Book> bookFindById3 = subject.findById(0L);
        Optional<Book> bookFindById4 = subject.findById(1L);
        Optional<Book> bookFindById5 = subject.findById(2L);

        Assertions.assertFalse(bookFindById3.isPresent(), "shouldFoundBooksById (#3)");
        Assertions.assertFalse(bookFindById4.isPresent(), "shouldFoundBooksById (#4)");
        Assertions.assertFalse(bookFindById5.isPresent(), "shouldFoundBooksById (#5)");
    }

}
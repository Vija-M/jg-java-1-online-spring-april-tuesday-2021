package students.dmitriy_shukailo.lesson_11.level_2.task_13;

import java.util.List;
import java.util.Optional;

class InMemoryBookRepositoryTest {

    public static void main(String[] args) {

        InMemoryBookRepositoryTest test = new InMemoryBookRepositoryTest();

        test.shouldDeleteBooksById();
        test.shouldDeleteBooks();
        test.shouldFoundBooksById();
        test.shouldFoundBooksByAuthor();
        test.shouldFoundBooksByTitle();
        test.shouldCountBooks();
        test.shouldDeleteBooksByAuthor();
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

        System.out.println();
    }

    public void shouldFoundBooksByAuthor() {

        var subject = new InMemoryBookRepository();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A1", "B2");
        Book book3 = new Book("A2", "B3");

        subject.save(book1);
        subject.save(book2);
        subject.save(book3);

        List<Book> expectedBooksByAuthor1 = List.of(book1, book2);
        List<Book> expectedBooksByAuthor2 = List.of(book3);

        List<Book> actualBooksByAuthor1 = subject.findByAuthor("A1");
        List<Book> actualBooksByAuthor2 = subject.findByAuthor("A2");

        Assertions.assertEquals(expectedBooksByAuthor1, actualBooksByAuthor1, "shouldFoundBooksByAuthor (#0)");
        Assertions.assertEquals(expectedBooksByAuthor2, actualBooksByAuthor2, "shouldFoundBooksByAuthor (#1)");

        // --- первый вариант ---
        List<Book> expectedBooksByAuthor3 = List.of();
        List<Book> actualBooksByAuthor3 = subject.findByAuthor("A4");

        Assertions.assertEquals(expectedBooksByAuthor3, actualBooksByAuthor3, "shouldFoundBooksByAuthor (#2)");

        // --- второй вариант ---
        List<Book> actualBooksByAuthor4 = subject.findByAuthor("A4");

        Assertions.assertTrue(actualBooksByAuthor4.isEmpty(), "shouldFoundBooksByAuthor (#3)");

        // --- третий вариант ---
        List<Book> expectedBooksByAuthor5 = List.of();
        List<Book> actualBooksByAuthor5 = subject.findByAuthor("A1");

        Assertions.assertNotEquals(expectedBooksByAuthor5, actualBooksByAuthor5, "shouldFoundBooksByAuthor (#5)");

        System.out.println();
    }


    public void shouldFoundBooksByTitle() {

        var subject = new InMemoryBookRepository();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B1");
        Book book3 = new Book("A3", "B2");

        subject.save(book1);
        subject.save(book2);
        subject.save(book3);

        List<Book> expectedBooksByTitle1 = List.of(book1, book2);
        List<Book> expectedBooksByTitle2 = List.of(book3);

        List<Book> actualBooksByTitle1 = subject.findByTitle("B1");
        List<Book> actualBooksByTitle2 = subject.findByTitle("B2");

        Assertions.assertEquals(expectedBooksByTitle1, actualBooksByTitle1, "shouldFoundBooksByTitle (#0)");
        Assertions.assertEquals(expectedBooksByTitle2, actualBooksByTitle2, "shouldFoundBooksByTitle (#1)");

        // --- первый вариант ---
        List<Book> expectedBooksByTitle3 = List.of();
        List<Book> actualBooksByTitle3 = subject.findByTitle("B3");

        Assertions.assertEquals(expectedBooksByTitle3, actualBooksByTitle3, "shouldFoundBooksByTitle (#2)");

        // --- второй вариант ---
        List<Book> actualBooksByTitle4 = subject.findByTitle("B3");

        Assertions.assertTrue(actualBooksByTitle4.isEmpty(), "shouldFoundBooksByTitle (#3)");

        // --- третий вариант ---
        List<Book> expectedBooksByTitle5 = List.of();
        List<Book> actualBooksByTitle5 = subject.findByTitle("B1");

        Assertions.assertNotEquals(expectedBooksByTitle5, actualBooksByTitle5, "shouldFoundBooksByTitle (#5)");

        System.out.println();
    }

    public void shouldCountBooks() {

        var subject = new InMemoryBookRepository();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");


        int countBooks = subject.count();
        Assertions.assertEquals(countBooks, 0, "shouldCountBooks (#0)");

        subject.save(book1);
        int countBooks1 = subject.count();
        Assertions.assertEquals(countBooks1, 1, "shouldCountBooks (#1)");

        subject.save(book2);
        int countBooks2 = subject.count();
        Assertions.assertEquals(countBooks2, 2, "shouldCountBooks (#2)");

        subject.delete(book1);
        int countBooks3 = subject.count();
        Assertions.assertEquals(countBooks3, 1, "shouldCountBooks (#3)");

        subject.delete(book2);
        int countBooks4 = subject.count();
        Assertions.assertEquals(countBooks4, 0, "shouldCountBooks (#3)");

        System.out.println();
    }

    public void shouldDeleteBooksByAuthor() {

        var subject = new InMemoryBookRepository();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A1", "B2");
        Book book3 = new Book("A2", "B3");

        subject.save(book1);
        subject.save(book2);
        subject.save(book3);

        subject.deleteByAuthor("A1");
        List<Book> expectedBooksByAuthor1 = List.of(book3);
        List<Book> actualBooksByAuthor1 = subject.findByAuthor("A1");
        Assertions.assertNotEquals(expectedBooksByAuthor1, actualBooksByAuthor1, "shouldDeleteBooksByAuthor (#0)");

        subject.deleteByAuthor("A2");
        List<Book> expectedBooksByAuthor2 = List.of(book1, book2);
        List<Book> actualBooksByAuthor2 = subject.findByAuthor("A2");
        Assertions.assertNotEquals(expectedBooksByAuthor2, actualBooksByAuthor2, "shouldDeleteBooksByAuthor (#1)");

        subject.deleteByAuthor("A3");
        List<Book> expectedBooksByAuthor3 = List.of(book1, book2, book3);
        List<Book> actualBooksByAuthor3 = subject.findByAuthor("A3");
        Assertions.assertNotEquals(expectedBooksByAuthor3, actualBooksByAuthor3, "shouldDeleteBooksByAuthor (#2)");

        System.out.println();
    }

}
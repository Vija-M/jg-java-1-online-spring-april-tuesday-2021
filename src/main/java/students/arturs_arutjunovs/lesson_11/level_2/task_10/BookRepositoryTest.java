package students.arturs_arutjunovs.lesson_11.level_2.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookRepositoryTest {
    public static void main(String[] args) {

        BookRepositoryTest test = new BookRepositoryTest();
        test.bookRemovedByIdTest();
        test.bookNotRemovedByIdTest();
        test.shouldDeleteBooks();
        test.foundBookByIdTest();
        test.wasNotFoundBookByIdTest();
        test.foundBookByAuthor();
        test.notFoundBookByAuthor();
    }

    public void bookRemovedByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        assertTestResult(bookRep.delete(3L), true, "Book was found and removed (by id");

    }

    public void bookNotRemovedByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.delete(2L);
        assertTestResult(bookRep.delete(2L), false, "Book was`t found and not removed (by id");
    }

    public void shouldDeleteBooks() {
        var subject = new InMemoryBookRepository();
        subject.save(new Book("AUTHOR1", "TITLE1"));
        subject.save(new Book("AUTHOR2", "TITLE2"));
        subject.save(new Book("AUTHOR3", "TITLE3"));

        var b0 = new Book("AUTHOR1", "TITLE1");
        b0.setId(1L);
        var b1 = new Book("AUTHOR2", "TITLE2");
        b1.setId(2L);
        var b2 = new Book("AUTHOR3", "TITLE3");
        b2.setId(3L);
        var b3 = new Book("AUTHOR1", "TITLE1");
        assertTrue(subject.delete(b0), "shouldDeleteBooks (#0) by id");
        assertTrue(subject.delete(b1), "shouldDeleteBooks (#1) by id");
        assertTrue(subject.delete(b2), "shouldDeleteBooks (#2) by id");

        assertFalse(subject.delete(b0), "shouldDeleteBooks (#3) by id");
        assertFalse(subject.delete(b1), "shouldDeleteBooks (#4) by id");
        assertFalse(subject.delete(b2), "shouldDeleteBooks (#5) by id");

        assertFalse(subject.delete(b3), "shouldDeleteBooks (#6) by id");

    }

    public void foundBookByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        Optional<Book> isBookFound = bookRep.findById(1L);
        assertTestResult(isBookFound.isPresent(), true, "Book was found by id");
    }

    public void wasNotFoundBookByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.delete(1L);
        Optional<Book> isBookFound = bookRep.findById(1L);
        assertTestResult(isBookFound.isPresent(), false, "Book was`t found by id");
    }

    public void foundBookByAuthor() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        List<Book> booksFound = bookRep.findByAuthor("AUTHOR1");
        List<Book> booksMustBeFound = new ArrayList<>();
        booksMustBeFound.add(new Book("AUTHOR1", "TITLE1"));
        assertBookListTestResult(booksFound, booksMustBeFound, "Book was found by author");
    }

    public void notFoundBookByAuthor() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.save(new Book("AUTHOR4", "TITLE4"));
        List<Book> booksFound = bookRep.findByAuthor("AUTHOR1");
        List<Book> booksMustBeFound = new ArrayList<>();
        assertBookListTestResult(booksFound, booksMustBeFound, "Book was`t found by author");
    }

    private void assertTrue(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }

    private void assertFalse(boolean actualResult, String testName) {
        if (!actualResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }

    private void assertTestResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }

    private void assertBookListTestResult(List<Book> actualResult, List<Book> expectedResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}
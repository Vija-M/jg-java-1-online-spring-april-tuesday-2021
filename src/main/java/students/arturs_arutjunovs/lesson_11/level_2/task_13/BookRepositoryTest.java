package students.arturs_arutjunovs.lesson_11.level_2.task_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookRepositoryTest {
    public static void main(String[] args) {

        BookRepositoryTest test = new BookRepositoryTest();
        test.bookRemovedByIdTest();
        test.bookNotRemovedByIdTest();
        test.foundBookByIdTest();
        test.notFoundBookByIdTest();
        test.foundBookByAuthor();
        test.notFoundBookByAuthor();
        test.countBookListSize();
        test.shouldDeleteBooks();
        test.deleteBooksByAuthor();
        test.notDeleteBooksByAuthor();
        test.findBookByTitle();
        test.notFoundBookByTitle();

    }

    public void bookRemovedByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        assertTestResult(bookRep.delete(3L), true, "Book was found and removed by id");

    }

    public void bookNotRemovedByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.delete(2L);
        assertTestResult(bookRep.delete(2L), false, "Book was`t found and not removed by id");

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

    public void notFoundBookByIdTest() {
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
        List<Book> bookFound = bookRep.findByAuthor("AUTHOR1");
        List<Book> bookMustBeFound = new ArrayList<>();
        bookMustBeFound.add(new Book("AUTHOR1", "TITLE1"));
        assertBookListTestResult(bookFound, bookMustBeFound, "Book was found by author");
    }

    public void notFoundBookByAuthor() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.save(new Book("AUTHOR4", "TITLE4"));
        List<Book> bookFound = bookRep.findByAuthor("AUTHOR1");
        List<Book> bookMustBeFound = new ArrayList<>();
        assertBookListTestResult(bookFound, bookMustBeFound, "Book was`t found by author");
    }

    public void findBookByTitle() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE1"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        List<Book> bookFound = bookRep.findByTitle("TITLE1");
        List<Book> bookMustBeFound = new ArrayList<>();
        bookMustBeFound.add(new Book("AUTHOR1", "TITLE1"));
        bookMustBeFound.add(new Book("AUTHOR2", "TITLE1"));
        assertBookListTestResult(bookFound, bookMustBeFound, "Book was found by title");
    }

    public void notFoundBookByTitle() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.save(new Book("AUTHOR4", "TITLE4"));
        List<Book> bookFound = bookRep.findByTitle("TITLE1");
        List<Book> bookMustBeFound = new ArrayList<>();
        assertBookListTestResult(bookFound, bookMustBeFound, "Book was`t found by title");
    }

    public void countBookListSize() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        int bookActualSize = bookRep.count();
        assertTestCountResult(bookActualSize, 3, "Book in database: " + bookActualSize);
        bookRep.delete(1L);
        bookActualSize = bookRep.count();
        assertTestCountResult(bookActualSize, 2, "Book in database after removing: " + bookActualSize);
        bookRep.save(new Book("AUTHOR4", "TITLE4"));
        bookRep.save(new Book("AUTHOR5", "TITLE5"));
        bookActualSize = bookRep.count();
        assertTestCountResult(bookActualSize, 4, "Book in database after addition: " + bookActualSize);

    }

    public void deleteBooksByAuthor() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR1", "TITLE2"));
        bookRep.save(new Book("AUTHOR2", "TITLE3"));
        bookRep.save(new Book("AUTHOR3", "TITLE4"));
        bookRep.save(new Book("AUTHOR1", "TITLE5"));
        bookRep.deleteByAuthor("AUTHOR1");
        List<Book> bookMustBeFound = new ArrayList<>();
        bookMustBeFound.add(new Book("AUTHOR2", "TITLE3"));
        bookMustBeFound.add(new Book("AUTHOR3", "TITLE4"));
        assertBookListTestResult(bookRep.getBookList(), bookMustBeFound, "Books was removed by author");
    }

    public void notDeleteBooksByAuthor() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.deleteByAuthor("AUTHOR4");
        List<Book> bookMustBeFound = new ArrayList<>();
        bookMustBeFound.add(new Book("AUTHOR1", "TITLE1"));
        bookMustBeFound.add(new Book("AUTHOR2", "TITLE2"));
        bookMustBeFound.add(new Book("AUTHOR3", "TITLE3"));
        assertBookListTestResult(bookRep.getBookList(), bookMustBeFound, "Books was`t removed by author");

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

    private void assertTestCountResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}
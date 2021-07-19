package students.arturs_arutjunovs.lesson_11.level_2.task_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookRepositoryTest {
    public static void main(String[] args) {

        BookRepositoryTest test = new BookRepositoryTest();
        test.bookRemovedByIdTest();
        test.bookNotRemovedByIdTest();
        test.bookRemovedByParamTest();
        test.bookNotRemovedByParamTest();
        test.foundBookByIdTest();
        test.wasNotFoundBookByIdTest();
        test.foundBookByAuthor();
        test.notFoundBookByAuthor();
        test.findBookByTitle();
        test.notFoundBookByTitle();
    }

    public void bookRemovedByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        assertTestResult(bookRep.delete((long) 3), true, "Book was found and removed");

    }

    public void bookNotRemovedByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.delete((long) 2);
        assertTestResult(bookRep.delete((long) 2), false, "Book was`t found and not removed");
    }

    public void bookRemovedByParamTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        assertTestResult(bookRep.delete(new Book("AUTHOR1", "TITLE1")), true, "Book was found and removed");

    }

    public void bookNotRemovedByParamTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.delete(new Book("AUTHOR1", "TITLE1"));
        assertTestResult(bookRep.delete(new Book("AUTHOR1", "TITLE1")), false, "Book was`t found and not removed");

    }

    public void foundBookByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        Optional<Book> isBookFound = bookRep.findById((long) 1);
        assertTestResult(isBookFound.isPresent(), true, "Book was found by Id");
    }

    public void wasNotFoundBookByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.delete((long) 1);
        Optional<Book> isBookFound = bookRep.findById((long) 1);
        assertTestResult(isBookFound.isPresent(), false, "Book was`t found by Id");
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
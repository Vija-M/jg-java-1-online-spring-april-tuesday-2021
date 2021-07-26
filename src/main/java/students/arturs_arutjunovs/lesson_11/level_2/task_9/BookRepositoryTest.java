package students.arturs_arutjunovs.lesson_11.level_2.task_9;

import java.util.Objects;
import java.util.Optional;

class BookRepositoryTest {
    public static void main(String[] args) {

        BookRepositoryTest test = new BookRepositoryTest();
        test.bookRemovedByIdTest();
        test.bookNotRemovedByIdTest();
        test.findBookByIdTest();
        test.notFindBookByIdTest();
        test.shouldDeleteBooks();

    }

    public void bookRemovedByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        assertTestResult(bookRep.delete(3L), true, "Book was found and removed");

    }

    public void bookNotRemovedByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.delete(2L);
        assertTestResult(bookRep.delete(2L), false, "Book was`t found and not removed");
    }


    public void findBookByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        Optional<Book> isBookFound = bookRep.findById(1L);
        assertEqual(isBookFound.isPresent(), true, "Book was found (by id)");
    }

    public void notFindBookByIdTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.delete(1L);
        Optional<Book> isBookFound = bookRep.findById(1L);
        assertEqual(isBookFound.isPresent(), false, "Book was`t found (by id");
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
        assertTrue(subject.delete(b0), "shouldDeleteBooks (#0)");
        assertTrue(subject.delete(b1), "shouldDeleteBooks (#1)");
        assertTrue(subject.delete(b2), "shouldDeleteBooks (#2)");

        assertFalse(subject.delete(b0), "shouldDeleteBooks (#3)");
        assertFalse(subject.delete(b1), "shouldDeleteBooks (#4)");
        assertFalse(subject.delete(b2), "shouldDeleteBooks (#5)");

        assertFalse(subject.delete(b3), "shouldDeleteBooks (#6)");
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

    private void assertEqual(Object o1, Object o2, String testName) {
        if (Objects.equals(o1, o2)) {
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
}
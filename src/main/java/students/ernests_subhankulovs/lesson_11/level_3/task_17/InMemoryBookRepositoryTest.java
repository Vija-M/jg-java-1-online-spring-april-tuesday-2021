package students.ernests_subhankulovs.lesson_11.level_3.task_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryBookRepositoryTest {
    public static void main(String[] args) {
        InMemoryBookRepositoryTest test = new InMemoryBookRepositoryTest();
        test.testBookRemoved();
        test.testBookNotRemoved();
        test.testBookRemovedByValue();
        test.testBookNotRemovedByValue();
        test.testBookFound();
        test.testBookNotFound();
        test.testBookFoundByAuthor();
        test.testBookNotFoundByAuthor();
        test.testBookFoundByTitle();
        test.testBookNotFoundByTitle();
        test.testBookCount();
        test.testBookRemovedByAuthor();
        test.testBookNotRemovedByAuthor();
        test.testBookRemovedByTitle();
        test.testBookNotRemovedByTitle();
        test.testAuthorSearchCriteria();
        test.testAuthorSearchCriteriaNegative();
        test.testTitleSearchCriteria();
        test.testTitleSearchCriteriaNegative();
    }

    public void testBookRemoved() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));

        assertTestResult(true, bookRepository.delete(1L), "Book is successfully removed (by index)");
    }

    public void testBookNotRemoved() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.delete(2L);
        assertTestResult(false, bookRepository.delete(2L), "Book is not found and thus not removed (by index)");
    }

    public void testBookRemovedByValue() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        assertTestResult(true, bookRepository.delete(new Book("A2", "B2")), "Book is successfully removed (by value)");
    }

    public void testBookNotRemovedByValue() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.delete(new Book("A2", "B2"));
        assertTestResult(false, bookRepository.delete(new Book("A2", "B2")), "Book is not found and thus not removed (by value)");
    }

    public void testBookFound() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        Optional<Book> bookFound = bookRepository.findById(1L);
        assertTestResult(true, bookFound.isPresent(), "Book is successfully found (by value)");
    }

    public void testBookNotFound() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        Optional<Book> bookFound = bookRepository.findById(3L);
        assertTestResult(false, bookFound.isPresent(), "Book is not found (by value)");
    }

    public void testBookFoundByAuthor() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A2", "B3"));
        List<Book> booksFound = bookRepository.findByAuthor("A2");
        List<Book> booksShouldBeFound = new ArrayList<>();
        booksShouldBeFound.add(new Book("A2", "B2"));
        booksShouldBeFound.add(new Book("A2", "B3"));
        assertBookTestResult(booksShouldBeFound, booksFound, "Book is successfully found (by author)");
    }

    public void testBookNotFoundByAuthor() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A2", "B3"));
        List<Book> booksFound = bookRepository.findByAuthor("A3");
        List<Book> booksShouldBeFound = new ArrayList<>();
        assertBookTestResult(booksShouldBeFound, booksFound, "Book is not found (by author)");
    }

    public void testBookFoundByTitle() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A3", "B2"));
        List<Book> booksFound = bookRepository.findByTitle("B2");
        List<Book> booksShouldBeFound = new ArrayList<>();
        booksShouldBeFound.add(new Book("A2", "B2"));
        booksShouldBeFound.add(new Book("A3", "B2"));
        assertBookTestResult(booksShouldBeFound, booksFound, "Book is successfully found (by title)");
    }

    public void testBookNotFoundByTitle() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A3", "B2"));
        List<Book> booksFound = bookRepository.findByTitle("B3");
        List<Book> booksShouldBeFound = new ArrayList<>();
        assertBookTestResult(booksShouldBeFound, booksFound, "Book is not found (by title)");
    }

    public void testBookCount() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A3", "B2"));
        int bookCount = bookRepository.count();
        assertNumericTestResult(3, bookCount, "Books counted correctly");
        bookRepository.delete(2L);
        bookCount = bookRepository.count();
        assertNumericTestResult(2, bookCount, "Books counted correctly (after removal)");
    }

    public void testBookRemovedByAuthor() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A2", "B3"));
        bookRepository.save(new Book("A2", "B4"));
        bookRepository.deleteByAuthor("A2");
        List<Book> booksShouldBeFound = new ArrayList<>();
        booksShouldBeFound.add(new Book("A1", "B1"));
        assertBookTestResult(booksShouldBeFound, bookRepository.getBookDataBase(), "Book is successfully removed (by author)");
    }

    public void testBookNotRemovedByAuthor() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A2", "B3"));
        bookRepository.save(new Book("A2", "B4"));
        bookRepository.deleteByAuthor("A3");
        List<Book> booksShouldBeFound = new ArrayList<>();
        booksShouldBeFound.add(new Book("A1", "B1"));
        booksShouldBeFound.add(new Book("A2", "B2"));
        booksShouldBeFound.add(new Book("A2", "B3"));
        booksShouldBeFound.add(new Book("A2", "B4"));
        assertBookTestResult(booksShouldBeFound, bookRepository.getBookDataBase(), "Book is not removed (by author)");
    }

    public void testBookRemovedByTitle() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A3", "B1"));
        bookRepository.save(new Book("A4", "B3"));
        bookRepository.deleteByTitle("B1");
        List<Book> booksShouldBeFound = new ArrayList<>();
        booksShouldBeFound.add(new Book("A2", "B2"));
        booksShouldBeFound.add(new Book("A4", "B3"));
        assertBookTestResult(booksShouldBeFound, bookRepository.getBookDataBase(), "Book is successfully removed (by title)");
    }

    public void testBookNotRemovedByTitle() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A2", "B3"));
        bookRepository.save(new Book("A2", "B4"));
        bookRepository.deleteByTitle("B5");
        List<Book> booksShouldBeFound = new ArrayList<>();
        booksShouldBeFound.add(new Book("A1", "B1"));
        booksShouldBeFound.add(new Book("A2", "B2"));
        booksShouldBeFound.add(new Book("A2", "B3"));
        booksShouldBeFound.add(new Book("A2", "B4"));
        assertBookTestResult(booksShouldBeFound, bookRepository.getBookDataBase(), "Book is not removed (by title)");
    }

    public void testAuthorSearchCriteria() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");
        boolean realResult =  authorSearchCriteria.match(new Book("A1", "B1"));
        assertTestResult(true, realResult, "Author search criteria returns true");
    }

    public void testAuthorSearchCriteriaNegative() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");
        boolean realResult =  authorSearchCriteria.match(new Book("A2", "B1"));
        assertTestResult(false, realResult, "Author search criteria returns false");
    }

    public void testTitleSearchCriteria() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("B1");
        boolean realResult =  titleSearchCriteria.match(new Book("A1", "B1"));
        assertTestResult(true, realResult, "Title search criteria returns true");
    }

    public void testTitleSearchCriteriaNegative() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("B2");
        boolean realResult =  titleSearchCriteria.match(new Book("A1", "B1"));
        assertTestResult(false, realResult, "Title search criteria returns false");
    }

    private void assertTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Actual result: " + realResult);
        }
    }

    private void assertNumericTestResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Actual result: " + realResult);
        }
    }

    private void assertBookTestResult(List<Book> expectedResult, List<Book> realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Actual result: " + realResult);
        }
    }
}

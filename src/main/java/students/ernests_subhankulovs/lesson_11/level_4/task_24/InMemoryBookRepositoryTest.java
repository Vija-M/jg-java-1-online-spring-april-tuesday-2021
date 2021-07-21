package students.ernests_subhankulovs.lesson_11.level_4.task_24;

import java.util.*;

class InMemoryBookRepositoryTest {

    Assertions assertions = new Assertions();

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
        test.testFind();
        test.testFindUniqueAuthors();
        test.testFindUniqueTitles();
    }

    public void testBookRemoved() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        assertions.assertTestResult(true, bookRepository.delete(1L), "Book is successfully removed (by index)");
    }

    public void testBookNotRemoved() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.delete(2L);
        assertions.assertTestResult(false, bookRepository.delete(2L), "Book is not found and thus not removed (by index)");
    }

    public void testBookRemovedByValue() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        assertions.assertTestResult(true, bookRepository.delete(new Book("A2", "B2")), "Book is successfully removed (by value)");
    }

    public void testBookNotRemovedByValue() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.delete(new Book("A2", "B2"));
        assertions.assertTestResult(false, bookRepository.delete(new Book("A2", "B2")), "Book is not found and thus not removed (by value)");
    }

    public void testBookFound() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        Optional<Book> bookFound = bookRepository.findById(1L);
        assertions.assertTestResult(true, bookFound.isPresent(), "Book is successfully found (by value)");
    }

    public void testBookNotFound() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        Optional<Book> bookFound = bookRepository.findById(3L);
        assertions.assertTestResult(false, bookFound.isPresent(), "Book is not found (by value)");
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
        assertions.assertBookTestResult(booksShouldBeFound, booksFound, "Book is successfully found (by author)");
    }

    public void testBookNotFoundByAuthor() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A2", "B3"));
        List<Book> booksFound = bookRepository.findByAuthor("A3");
        List<Book> booksShouldBeFound = new ArrayList<>();
        assertions.assertBookTestResult(booksShouldBeFound, booksFound, "Book is not found (by author)");
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
        assertions.assertBookTestResult(booksShouldBeFound, booksFound, "Book is successfully found (by title)");
    }

    public void testBookNotFoundByTitle() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A3", "B2"));
        List<Book> booksFound = bookRepository.findByTitle("B3");
        List<Book> booksShouldBeFound = new ArrayList<>();
        assertions.assertBookTestResult(booksShouldBeFound, booksFound, "Book is not found (by title)");
    }

    public void testBookCount() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A3", "B2"));
        int bookCount = bookRepository.count();
        assertions.assertNumericTestResult(3, bookCount, "Books counted correctly");
        bookRepository.delete(2L);
        bookCount = bookRepository.count();
        assertions.assertNumericTestResult(2, bookCount, "Books counted correctly (after removal)");
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
        assertions.assertBookTestResult(booksShouldBeFound, bookRepository.getBookDataBase(), "Book is successfully removed (by author)");
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
        assertions.assertBookTestResult(booksShouldBeFound, bookRepository.getBookDataBase(), "Book is not removed (by author)");
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
        assertions.assertBookTestResult(booksShouldBeFound, bookRepository.getBookDataBase(), "Book is successfully removed (by title)");
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
        assertions.assertBookTestResult(booksShouldBeFound, bookRepository.getBookDataBase(), "Book is not removed (by title)");
    }

    public void testFind() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1", "1997"));
        bookRepository.save(new Book("A2", "B1", "1998"));
        bookRepository.save(new Book("A2", "B2", "1999"));
        bookRepository.save(new Book("A2", "B3", "1999"));
        List<Book> booksShouldBeFound = new ArrayList<>();
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A2");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("B1");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1999");
        AndSearchCriteria authorAndTitleSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        AndSearchCriteria authorAndYearSearchCriteria = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        OrSearchCriteria authorOrTitleOrYearSearchCriteria = new OrSearchCriteria(authorSearchCriteria, new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria));
        booksShouldBeFound.add(new Book("A2", "B1", "1998"));
        assertions.assertBookTestResult(booksShouldBeFound, bookRepository.find(authorAndTitleSearchCriteria), "Search by author and title");
        booksShouldBeFound.remove(0);
        booksShouldBeFound.add(new Book("A2", "B2", "1999"));
        booksShouldBeFound.add(new Book("A2", "B3", "1999"));
        assertions.assertBookTestResult(booksShouldBeFound, bookRepository.find(authorAndYearSearchCriteria), "Search by author and year");
        booksShouldBeFound.remove(1);
        booksShouldBeFound.remove(0);
        booksShouldBeFound.add(new Book("A1", "B1", "1997"));
        booksShouldBeFound.add(new Book("A2", "B1", "1998"));
        booksShouldBeFound.add(new Book("A2", "B2", "1999"));
        booksShouldBeFound.add(new Book("A2", "B3", "1999"));
        assertions.assertBookTestResult(booksShouldBeFound, bookRepository.find(authorOrTitleOrYearSearchCriteria), "Search by author or title or year");
    }

    public void testFindUniqueAuthors() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A2", "B3"));
        bookRepository.save(new Book("A2", "B4"));
        Set<String> uniqueAuthors = bookRepository.findUniqueAuthors();
        Set<String> uniqueAuthorsToBeFound = new HashSet<>();
        uniqueAuthorsToBeFound.add("A1");
        uniqueAuthorsToBeFound.add("A2");
        assertions.assertSetTestResult(uniqueAuthorsToBeFound, uniqueAuthors, "Unique authors found correctly");
    }

    public void testFindUniqueTitles() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.save(new Book("A3", "B2"));
        bookRepository.save(new Book("A4", "B3"));
        Set<String> uniqueTitles = bookRepository.findUniqueTitles();
        Set<String> uniqueTitlesToBeFound = new HashSet<>();
        uniqueTitlesToBeFound.add("B1");
        uniqueTitlesToBeFound.add("B2");
        uniqueTitlesToBeFound.add("B3");
        assertions.assertSetTestResult( uniqueTitlesToBeFound, uniqueTitles, "Unique titles found correctly");
    }
}

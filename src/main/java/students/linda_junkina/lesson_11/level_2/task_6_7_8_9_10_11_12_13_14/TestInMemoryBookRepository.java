package students.linda_junkina.lesson_11.level_2.task_6_7_8_9_10_11_12_13_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

class TestInMemoryBookRepository {
    public static void main(String[] args) {
        TestInMemoryBookRepository test = new TestInMemoryBookRepository();
        test.shouldDeleteById();
        test.shouldDeleteByAuthorAndName();
        test.shouldFindById();
        test.shouldFindByAuthor();
        test.shouldFindByTitle();
        test.shouldCountBooks();
        test.shouldDeleteByAuthor();
        test.shouldDeleteByTitle();
    }

    public void shouldDeleteById() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        Book book1 = new Book("Foo1", "Bar1");
        Book book2 = new Book("Foo2", "Bar2");
        List<Book> expected = List.of(book1);
        inMemoryBookRepository.save(book1);
        inMemoryBookRepository.save(book2);
        checkTestResultBool(true, inMemoryBookRepository.delete(1L), "Book deleted by ID (#1)");
        checkTestResultList(expected, inMemoryBookRepository.getBooksDataBase(), "Book deleted by ID (#2)");
    }

    public void shouldDeleteByAuthorAndName() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        Book book1 = new Book("Foo1", "Bar1");
        Book book2 = new Book("Foo2", "Bar2");
        inMemoryBookRepository.save(book1);
        inMemoryBookRepository.save(book2);
        inMemoryBookRepository.delete(book1);
        List<Book> expected = List.of(book2);
        checkTestResultList(expected, inMemoryBookRepository.getBooksDataBase(),
                "Book is removed by the Author and Name");
    }

    public void shouldFindById() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        Book book1 = new Book("Foo1", "Bar1");
        Book book2 = new Book("Foo2", "Bar2");
        inMemoryBookRepository.save(book1);
        inMemoryBookRepository.save(book2);
        Optional<Book> bookFound = inMemoryBookRepository.findById(1L);
        checkTestResultBool(true, bookFound.isPresent(), "Book found by ID");
    }

    public void shouldFindByAuthor() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        Book book1 = new Book("Foo1", "Bar1");
        Book book2 = new Book("Foo2", "Bar2");
        inMemoryBookRepository.save(book1);
        inMemoryBookRepository.save(book2);
        List<Book> expected = List.of(book1);
        checkTestResultList(expected, inMemoryBookRepository.findByAuthor("Foo1"), "Book found by Author");
    }

    public void shouldFindByTitle() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        Book book1 = new Book("Foo1", "Bar1");
        Book book2 = new Book("Foo2", "Bar2");
        inMemoryBookRepository.save(book1);
        inMemoryBookRepository.save(book2);
        List<Book> expected = List.of(book1);
        checkTestResultList(expected, inMemoryBookRepository.findByTitle("Bar1"), "Book found by Title");
    }

    public void shouldCountBooks() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        Book book1 = new Book("Foo1", "Bar1");
        Book book2 = new Book("Foo2", "Bar2");
        inMemoryBookRepository.save(book1);
        inMemoryBookRepository.save(book2);
        checkTestResultInt(2, inMemoryBookRepository.count(), "Books counted");
    }

    public void shouldDeleteByAuthor() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        Book book1 = new Book("Foo1", "Bar1");
        Book book2 = new Book("Foo2", "Bar2");
        inMemoryBookRepository.save(book1);
        inMemoryBookRepository.save(book2);
        inMemoryBookRepository.deleteByAuthor("Foo1");
        List<Book> expected = List.of(book2);
        checkTestResultList(expected, inMemoryBookRepository.getBooksDataBase(), "Book deleted by Author");

    }

    public void shouldDeleteByTitle() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        Book book1 = new Book("Foo1", "Bar1");
        Book book2 = new Book("Foo2", "Bar2");
        inMemoryBookRepository.save(book1);
        inMemoryBookRepository.save(book2);
        inMemoryBookRepository.deleteByTitle("Bar2");
        List<Book> expected = List.of(book1);
        checkTestResultList(expected, inMemoryBookRepository.getBooksDataBase(), "Book deleted by Title");
    }

    private void checkTestResultBool(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " FAILED!");
        }
    }

    private void checkTestResultList(List<Book> expected, List<Book> actual, String testName) {
        if (Objects.equals(expected, actual)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " FAILED!");
        }
    }

    private void checkTestResultInt(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " FAILED!");
        }
    }
}

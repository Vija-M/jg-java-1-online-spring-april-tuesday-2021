package students.dmitrijs_matrenicevs.lesson_11.level_2.task_7_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookRepositoryTest {

    public static void main(String[] args) {
        BookRepositoryTest bookRepositoryTest = new BookRepositoryTest();
        bookRepositoryTest.deleteBookTestID();
        bookRepositoryTest.notDeleteBookTestID();
        bookRepositoryTest.shouldDeleteBooks();
        bookRepositoryTest.searchBookTest();
        bookRepositoryTest.searchNotBookTest();
        bookRepositoryTest.searchFindByAuthorTest();
        bookRepositoryTest.notSearchFindByAuthorTest();
        bookRepositoryTest.searchFindByTitleTest();
        bookRepositoryTest.notSearchFindByTitleTest();
        bookRepositoryTest.countBooksSizeTest();
        bookRepositoryTest.deleteByAuthorTest();
        bookRepositoryTest.deleteByNotAuthorTest();
        bookRepositoryTest.deleteByTitleTest();
        bookRepositoryTest.deleteByNotTitleTest();
    }

    //TASK7

    public void deleteBookTestID() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        assertResultTest(inMemoryBookRepository.delete(1L), true, "Книга найдена и удалена (ID)!");
    }

    public void notDeleteBookTestID() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.delete(2L);
        assertResultTest(inMemoryBookRepository.delete(2L), false, "Книга не найдена и не удалена (ID)!");
    }

    //TASK8

    public void shouldDeleteBooks() {
        var subject = new InMemoryBookRepository();
        subject.save(new Book("JAVA1", "WORLD1"));
        subject.save(new Book("JAVA2", "WORLD2"));
        subject.save(new Book("JAVA3", "WORLD3"));

        var b0 = new Book("JAVA1", "WORLD1");
        b0.setId(0L);
        var b1 = new Book("JAVA2", "WORLD2");
        b1.setId(1L);
        var b2 = new Book("JAVA3", "WORLD3");
        b2.setId(2L);
        var b3 = new Book("JAVA1", "WORLD1");
        b2.setId(3L);

        assertTrue(subject.delete(b0), "shouldDeleteBooks (#0)");
        assertTrue(subject.delete(b1), "shouldDeleteBooks (#1)");
        assertTrue(subject.delete(b2), "shouldDeleteBooks (#2)");

        assertFalse(subject.delete(b0), "shouldDeleteBooks (#3)");
        assertFalse(subject.delete(b1), "shouldDeleteBooks (#4)");
        assertFalse(subject.delete(b2), "shouldDeleteBooks (#5)");

        assertFalse(subject.delete(b3), "shouldDeleteBooks (#6)");
    }

    //TASK9

    public void searchBookTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        Optional<Book> searchBook = inMemoryBookRepository.findById(1L);
        assertResultTest(searchBook.isPresent(), true, "Книга найдена!");
    }

    public void searchNotBookTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        Optional<Book> searchBook = inMemoryBookRepository.findById(3L);
        assertResultTest(searchBook.isPresent(), false, "Книга не найдена!");
    }

    //TASK10

    public void searchFindByAuthorTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        List<Book> findByAuthor = inMemoryBookRepository.findByAuthor("JAVA1");
        List<Book> list = new ArrayList<>();
        list.add(new Book("JAVA1", "WORLD1"));
        assertResultBookTest(list, findByAuthor, "Книга найдена автором!");
    }

    public void notSearchFindByAuthorTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        List<Book> findByAuthor = inMemoryBookRepository.findByAuthor("JAVA4");
        List<Book> list = new ArrayList<>();
        assertResultBookTest(list, findByAuthor, "Книга не найдена автором!");
    }

    //TASK11

    public void searchFindByTitleTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        List<Book> findByTitle = inMemoryBookRepository.findByTitle("JAVA1");
        List<Book> list = new ArrayList<>();
        list.add(new Book("JAVA1", "WORLD1"));
        list.add(new Book("JAVA2", "WORLD1"));
        assertResultBookTest(list, findByTitle, "Книга найдена по названию!");
    }

    public void notSearchFindByTitleTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        List<Book> findByTitle = inMemoryBookRepository.findByTitle("WORLD4");
        List<Book> list = new ArrayList<>();
        assertResultBookTest(list, findByTitle, "Книга не найдена по названию!");
    }

    //TASK12

    public void countBooksSizeTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        int countBooksSize = inMemoryBookRepository.count();
        assertCountBooksSizeResult(countBooksSize, 3, "Книги посчитаны правильно!");
        inMemoryBookRepository.delete((long) 1);
        countBooksSize = inMemoryBookRepository.count();
        assertCountBooksSizeResult(countBooksSize, 2, "Книги посчитаны правильно после удалением!");
    }

    //TASK13

    public void deleteByAuthorTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD4"));
        inMemoryBookRepository.save(new Book("JAVA5", "WORLD5"));
        inMemoryBookRepository.deleteByAuthor("JAVA1");
        List<Book> deleteAuthor = new ArrayList<>();
        deleteAuthor.add(new Book("JAVA3", "WORLD3"));
        deleteAuthor.add(new Book("JAVA5", "WORLD5"));
        assertResultBookTest(deleteAuthor, inMemoryBookRepository.getBooks(), "Книги были удалены автором!");
    }

    public void deleteByNotAuthorTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD3"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD3"));
        inMemoryBookRepository.deleteByAuthor("JAVA6");
        List<Book> deleteAuthor = new ArrayList<>();
        deleteAuthor.add(new Book("JAVA1", "WORLD1"));
        deleteAuthor.add(new Book("JAVA2", "WORLD2"));
        deleteAuthor.add(new Book("JAVA2", "WORLD3"));
        deleteAuthor.add(new Book("JAVA2", "WORLD3"));
        assertResultBookTest(deleteAuthor, inMemoryBookRepository.getBooks(), "Книги не были удалены автором!");
    }

    //TASK14

    public void deleteByTitleTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        inMemoryBookRepository.save(new Book("JAVA4", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA5", "WORLD5"));
        inMemoryBookRepository.deleteByTitle("WORLD1");
        List<Book> deleteTitle = new ArrayList<>();
        deleteTitle.add(new Book("JAVA3", "WORLD3"));
        deleteTitle.add(new Book("JAVA5", "WORLD5"));
        assertResultBookTest(deleteTitle, inMemoryBookRepository.getBooks(), "Книги были удалены по названию!");
    }

    public void deleteByNotTitleTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD3"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD3"));
        inMemoryBookRepository.deleteByTitle("WORLD6");
        List<Book> deleteTitle = new ArrayList<>();
        deleteTitle.add(new Book("JAVA1", "WORLD1"));
        deleteTitle.add(new Book("JAVA2", "WORLD2"));
        deleteTitle.add(new Book("JAVA2", "WORLD3"));
        deleteTitle.add(new Book("JAVA2", "WORLD3"));
        assertResultBookTest(deleteTitle, inMemoryBookRepository.getBooks(), "Книги не были удалены по названию!");
    }

    private void assertResultTest(boolean actualResult, boolean expectedResult, String name) {
        if (actualResult == expectedResult) {
            System.out.println(name + " = TEST TRUE");
        } else {
            System.out.println(name + " = TEST FALSE");
        }
    }

    private void assertResultBookTest(List<Book> expectedResult, List<Book> actualResult, String name) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(name + " = TEST TRUE");
        } else {
            System.out.println(name + " = TEST FALSE");
        }
    }

    private void assertCountBooksSizeResult(int actualResult, int expectedResult, String name) {
        if (actualResult == expectedResult) {
            System.out.println(name + " = TEST TRUE");
        } else {
            System.out.println(name + " = TEST FALSE");
        }
    }

    private void assertTrue(boolean actualResult, String name) {
        if (actualResult) {
            System.out.println(name + " = TEST TRUE");
        } else {
            System.out.println(name + " = TEST TRUE");
        }
    }

    private void assertFalse(boolean actualResult, String name) {
        if (!actualResult) {
            System.out.println(name + " = TEST TRUE");
        } else {
            System.out.println(name + " = TEST TRUE");
        }
    }

}

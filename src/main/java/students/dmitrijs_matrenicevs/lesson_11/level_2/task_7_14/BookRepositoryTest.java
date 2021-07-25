package students.dmitrijs_matrenicevs.lesson_11.level_2.task_7_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookRepositoryTest {

    public static void main(String[] args) {
        BookRepositoryTest bookRepositoryTest = new BookRepositoryTest();
        bookRepositoryTest.deleteBookTestID();
        bookRepositoryTest.notDeleteBookTestID();
        bookRepositoryTest.deleteBookTest();
        bookRepositoryTest.notDeleteBookTest();
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
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        assertResultTest(inMemoryBookRepository.delete(1L), true, "Книга найдена и удалена (ID)!");
    }

    public void notDeleteBookTestID() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        assertResultTest(inMemoryBookRepository.delete(1L), false, "Книга не найдена и не удалена (ID)!");
    }

    //TASK8




    public void deleteBookTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        assertResultTest(inMemoryBookRepository.delete(new Book("JAVA1", "WORLD1")), true, "Книга найдена и удалена!");
    }

    public void notDeleteBookTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        inMemoryBookRepository.delete(new Book("JAVA1", "WORLD1"));
        assertResultTest(inMemoryBookRepository.delete(new Book("JAVA1", "WORLD1")), false, "Книга не найдена и не удалена!");
    }

    //TASK9

    public void searchBookTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        Optional<Book> searchBook = inMemoryBookRepository.findById(3L);
        assertResultTest(true, searchBook.isPresent(), "Книга найдена!");
    }

    public void searchNotBookTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        Optional<Book> searchBook = inMemoryBookRepository.findById(1L);
        assertResultTest(false, searchBook.isPresent(), "Книга не найдена!");
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
        assertResultBookTest(findByAuthor, list, "Книга найдена автором!");
    }

    public void notSearchFindByAuthorTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        List<Book> findByAuthor = inMemoryBookRepository.findByAuthor("JAVA4");
        List<Book> list = new ArrayList<>();
        assertResultBookTest(findByAuthor, list, "Книга не найдена автором!");
    }

    //TASK11

    public void searchFindByTitleTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        List<Book> findByTitle = inMemoryBookRepository.findByAuthor("WORLD2");
        List<Book> list = new ArrayList<>();
        list.add(new Book("JAVA1", "WORLD1"));
        list.add(new Book("JAVA2", "WORLD2"));
        assertResultBookTest(findByTitle, list, "Книга найдена по названию!");
    }

    public void notSearchFindByTitleTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        List<Book> findByTitle = inMemoryBookRepository.findByTitle("WORLD4");
        List<Book> list = new ArrayList<>();
        assertResultBookTest(findByTitle, list, "Книга не найдена по названию!");
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
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD3"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD4"));
        inMemoryBookRepository.deleteByAuthor("JAVA2");
        List<Book> deleteAuthor = new ArrayList<>();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        assertResultBookTest(deleteAuthor,inMemoryBookRepository.getBooks(), "Книги были удалены автором!");
    }

    public void deleteByNotAuthorTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD3"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD4"));
        inMemoryBookRepository.deleteByAuthor("JAVA4");
        List<Book> deleteAuthor = new ArrayList<>();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD3"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD4"));
        assertResultBookTest(deleteAuthor,inMemoryBookRepository.getBooks(), "Книги не были удалены автором!");
    }

    //TASK14

    public void deleteByTitleTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA4", "WORLD2"));
        inMemoryBookRepository.deleteByAuthor("WORLD2");
        List<Book> deleteTitle = new ArrayList<>();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA4", "WORLD4"));
        assertResultBookTest(inMemoryBookRepository.getBooks(), deleteTitle, "Книги были удалены по названию!");
    }

    public void deleteByNotTitleTest() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        inMemoryBookRepository.save(new Book("JAVA4", "WORLD4"));
        inMemoryBookRepository.deleteByAuthor("JAVA5");
        List<Book> deleteAuthor = new ArrayList<>();
        inMemoryBookRepository.save(new Book("JAVA1", "WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2", "WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3", "WORLD3"));
        inMemoryBookRepository.save(new Book("JAVA4", "WORLD4"));
        assertResultBookTest(inMemoryBookRepository.getBooks(), deleteAuthor, "Книги не были удалены по названию!");
    }

    private void assertResultTest(boolean actualResult, boolean expectedResult, String name) {
        if (actualResult == expectedResult) {
            System.out.println(name + " = TEST TRUE");
        } else {
            System.out.println(name + " = TEST FALSE");
        }
    }

    private void assertResultBookTest(List<Book> actualResult, List<Book> expectedResult, String name) {
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
}

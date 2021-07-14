package students.dmitrijs_matrenicevs.lesson_11.level_2.task_7_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryBookRepository implements BookRepository {

    ArrayList<Book> books = new ArrayList<>();

    @Override
    public Long save(Book book) {
        Long bookID = (long) (books.size() + 1);
        book.setId(bookID);
        books.add(book);
        return bookID;
    }

    @Override
    public boolean delete(Long bookId) {
        return false;
    }

    @Override
    public boolean delete(Book book) {
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> findByTitle(String title) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void deleteByAuthor(String author) {

    }

    @Override
    public void deleteByTitle(String title) {

    }
}

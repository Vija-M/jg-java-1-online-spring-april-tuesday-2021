package students.linda_junkina.lesson_11.level_2.task_6_7_8_9_10_11_12_13_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryBookRepository implements BookRepository {

    List<Book> booksDataBase = new ArrayList<>();
    private Long id = 0L;

    public List<Book> getBooksDataBase() {
        return booksDataBase;
    }

    @Override
    public Long save(Book book) {
        book.setId(id++);
        booksDataBase.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
            return booksDataBase.removeIf(book -> book.getId().equals(bookId));
    }

    @Override
    public boolean delete(Book book) {
        return booksDataBase.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : booksDataBase) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> filtered = new ArrayList<>();
        for (Book book : booksDataBase) {
            if (book.getAuthor().equals(author)) {
                filtered.add(book);
            }
        }
        return filtered;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> filtered = new ArrayList<>();
        for (Book book : booksDataBase) {
            if (book.getTitle().equals(title)) {
                filtered.add(book);
            }
        }
        return filtered;
    }

    @Override
    public int count() {
        return booksDataBase.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        booksDataBase.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        booksDataBase.removeIf(book -> book.getTitle().equals(title));
    }
}

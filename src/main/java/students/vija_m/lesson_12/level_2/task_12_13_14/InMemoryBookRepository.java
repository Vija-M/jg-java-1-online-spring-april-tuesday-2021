package students.vija_m.lesson_12.level_2.task_12_13_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryBookRepository implements BookRepository {
    List<Book> bookDataBase = new ArrayList<>();

    public List<Book> getBooksDataBase() {
        return bookDataBase;
    }

    @Override
    public Long save(Book book) {
        Long newID = (long) ( bookDataBase.size() + 1 );
        book.setId(newID);
        bookDataBase.add(book);
        return newID;
    }

    @Override
    public boolean delete(Long bookId) {
        return bookDataBase.removeIf(book -> book.getId().equals(bookId));
    }

    @Override
    public boolean delete(Book book) {
        return bookDataBase.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for ( Book book : bookDataBase ) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        ArrayList<Book> booksFoundByAuthor = new ArrayList<>();
        for ( Book book : bookDataBase ) {
            if (book.getAuthor().equals(author)) {
                booksFoundByAuthor.add(book);
            }
        }
        return booksFoundByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        ArrayList<Book> booksFoundByTitle = new ArrayList<>();
        for ( Book book : bookDataBase ) {
            if (book.getTitle().equals(title)) {
                booksFoundByTitle.add(book);
            }
        }
        return booksFoundByTitle;
    }

    @Override
    public int count() {
        return bookDataBase.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        bookDataBase.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        bookDataBase.removeIf(book -> book.getTitle().equals(title));
    }
}
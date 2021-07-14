package students.ernests_subhankulovs.lesson_11.level_2.task_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryBookRepository implements BookRepository {
    ArrayList<Book> bookDataBase = new ArrayList<>();

    @Override
    public Long save(Book book) {
        Long newBookId = (long) (bookDataBase.size() + 1);
        book.setId(newBookId);
        bookDataBase.add(book);
        return newBookId;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : bookDataBase) {
            if (book.getId().equals(bookId)) {
                bookDataBase.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book savedBook : bookDataBase) {
            if (savedBook.getAuthor().equals(book.getAuthor()) && savedBook.getTitle().equals(book.getTitle())) {
                bookDataBase.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookDataBase) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        ArrayList<Book> booksFoundByAuthor = new ArrayList<>();
        for (Book book : bookDataBase) {
            if (book.getAuthor().equals(author)) {
                booksFoundByAuthor.add(book);
            }
        }
        return booksFoundByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        ArrayList<Book> booksFoundByTitle = new ArrayList<>();
        for (Book book : bookDataBase) {
            if (book.getTitle().equals(title)) {
                booksFoundByTitle.add(book);
            }
        }
        return booksFoundByTitle;
    }
}

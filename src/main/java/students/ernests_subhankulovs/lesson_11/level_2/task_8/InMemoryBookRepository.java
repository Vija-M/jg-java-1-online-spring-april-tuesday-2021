package students.ernests_subhankulovs.lesson_11.level_2.task_8;

import java.util.ArrayList;
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
}

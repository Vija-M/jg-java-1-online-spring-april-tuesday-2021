package students.arturs_arutjunovs.lesson_11.level_2.task_9;

import java.util.ArrayList;
import java.util.Optional;

class InMemoryBookRepository implements BookRepository {
    private ArrayList<Book> bookList = new ArrayList<>();
    private Long newId = 1L;

    @Override
    public Long save(Book book) {
        bookList.add(book);
        book.setId(newId++);
        return newId;
    }

    @Override
    public boolean delete(Long bookId) {
        return bookList.removeIf(book -> book.getId().equals(bookId));
    }

    @Override
    public boolean delete(Book book) {
        return book.getId() != null && bookList.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}

package students.arturs_arutjunovs.lesson_11.level_2.task_8;

import java.util.ArrayList;

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
}

package students.dmitriy_shukailo.lesson_11.level_2.task_8;

import java.util.ArrayList;

class InMemoryBookRepository implements BookRepository {

    private ArrayList<Book> books = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Long save(Book book) {
        book.setId(id++);
        books.add(book);
        return id;
    }

    @Override
    public boolean delete(Long bookId) {
        return books.removeIf(book -> book.getId().equals(bookId));
    }

    @Override
    public boolean delete(Book book) {
        return book.getId() != null && books.remove(book);
    }

}
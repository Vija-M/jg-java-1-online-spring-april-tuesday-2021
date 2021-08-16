package students.vija_m.lesson_11.level_2.task_8;


import java.util.ArrayList;
import java.util.List;

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
}
package students.dmitrijs_matrenicevs.lesson_11.level_2.task_6;

import java.util.ArrayList;
import java.util.List;

class InMemoryBookRepository implements BookRepository {

    List<Book> books = new ArrayList<>();

    @Override
    public Long save(Book book) {
        Long bookID = (long) (books.size() + 1);
        book.setId(bookID);
        books.add(book);
        return bookID;
    }
}

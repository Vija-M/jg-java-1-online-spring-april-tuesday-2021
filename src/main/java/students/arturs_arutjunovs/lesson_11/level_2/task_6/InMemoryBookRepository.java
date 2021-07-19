package students.arturs_arutjunovs.lesson_11.level_2.task_6;

import java.util.ArrayList;

class InMemoryBookRepository implements BookRepository {
    ArrayList<Book> bookList = new ArrayList<>();

    @Override
    public Long save(Book book) {
        Long newId = (long)bookList.size() + 1;
        bookList.add(book);
        book.setId(newId);
        return newId;
    }
}

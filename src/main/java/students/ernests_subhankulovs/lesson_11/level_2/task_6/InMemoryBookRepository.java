package students.ernests_subhankulovs.lesson_11.level_2.task_6;

import java.util.ArrayList;

class InMemoryBookRepository implements BookRepository {
    ArrayList<Book> bookDataBase = new ArrayList<>();

    @Override
    public Long save(Book book) {
        Long newBookId = (long) (bookDataBase.size() + 1);
        book.setId(newBookId);
        bookDataBase.add(book);
        return newBookId;
    }
}

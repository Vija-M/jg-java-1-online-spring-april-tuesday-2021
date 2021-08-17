package students.vija_m.lesson_11.level_2.task_6;

import java.util.ArrayList;

class InMemoryBookRepository implements BookRepository {
    ArrayList<Book> bookDataBase = new ArrayList<>();

    @Override
    public Long save(Book book) {
        Long newID = (long) ( bookDataBase.size() + 1 );
        book.setId(newID);
        bookDataBase.add(book);
        return newID;
    }
}

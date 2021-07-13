package students.dmitriy_shukailo.lesson_11.level_2.task_6;

import java.util.ArrayList;

class InMemoryBookRepository implements BookRepository {

    ArrayList<Book> books = new ArrayList<>();

    @Override
    public Long save(Book book) {
        Long newBookId = (long) (books.size() + 1);
        book.setId(newBookId);
        books.add(book);
        return newBookId;
    }

}
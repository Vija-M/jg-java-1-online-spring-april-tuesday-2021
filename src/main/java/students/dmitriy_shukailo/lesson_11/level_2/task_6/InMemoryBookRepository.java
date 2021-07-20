package students.dmitriy_shukailo.lesson_11.level_2.task_6;

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

}
package students.dmitriy_shukailo.lesson_11.level_2.task_7;

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
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

}
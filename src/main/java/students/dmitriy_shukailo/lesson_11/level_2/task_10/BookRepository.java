package students.dmitriy_shukailo.lesson_11.level_2.task_10;

import java.util.List;
import java.util.Optional;

interface BookRepository {

    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);
    List<Book> findByAuthor(String author);

}
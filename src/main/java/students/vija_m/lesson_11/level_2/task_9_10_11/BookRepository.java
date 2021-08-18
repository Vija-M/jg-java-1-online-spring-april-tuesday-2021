package students.vija_m.lesson_11.level_2.task_9_10_11;


import java.util.List;
import java.util.Optional;

interface BookRepository {
    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);
}
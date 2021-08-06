package students.linda_junkina.lesson_11.level_2.task_6_7_8_9_10_11_12_13_14;

import java.util.List;
import java.util.Optional;

interface BookRepository {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int count();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);
}
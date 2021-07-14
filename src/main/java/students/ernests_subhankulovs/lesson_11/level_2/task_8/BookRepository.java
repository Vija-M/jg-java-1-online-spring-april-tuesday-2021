package students.ernests_subhankulovs.lesson_11.level_2.task_8;

import java.util.Optional;

interface BookRepository {
    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);
}

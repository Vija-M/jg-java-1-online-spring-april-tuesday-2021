package students.arturs_arutjunovs.lesson_11.level_2.task_7;

interface BookRepository {

     Long save(Book book);
     boolean delete(Long bookId);
}

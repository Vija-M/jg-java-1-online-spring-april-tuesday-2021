package students.dmitrijs_matrenicevs.lesson_11.level_2.task_7_14;

interface BookRepository {

    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
}

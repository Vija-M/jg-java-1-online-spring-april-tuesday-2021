package students.dmitriy_shukailo.lesson_11.level_2.task_8;

interface BookRepository {

    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);

}
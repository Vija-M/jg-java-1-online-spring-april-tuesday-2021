package students.ernests_subhankulovs.lesson_10.level_5.task_15;

interface BookReader {
    Book[] getElectronicLibrary();
    boolean addBook(Book book);
    boolean isDuplicate(Book book);
    boolean validateTitleAndAuthor(Book book);
    boolean removeBook(Book book);
}

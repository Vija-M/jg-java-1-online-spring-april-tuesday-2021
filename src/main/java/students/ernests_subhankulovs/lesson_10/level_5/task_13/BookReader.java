package students.ernests_subhankulovs.lesson_10.level_5.task_13;

interface BookReader {
    Book[] getElectronicLibrary();
    boolean addBook(Book book);
    boolean isDuplicate(Book newBook);
}

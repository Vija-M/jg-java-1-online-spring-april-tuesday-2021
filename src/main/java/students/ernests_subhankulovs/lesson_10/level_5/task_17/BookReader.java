package students.ernests_subhankulovs.lesson_10.level_5.task_17;

interface BookReader {
    boolean addBook(Book book);
    boolean isDuplicate(Book book);
    boolean validateTitleAndAuthor(Book book);
    boolean removeBook(Book book);
    String[] listAllBooks();
    Book[] findBookByAuthor(String author);
}

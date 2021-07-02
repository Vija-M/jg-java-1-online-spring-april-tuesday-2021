package students.ernests_subhankulovs.lesson_10.level_6.task_20;

interface BookReader {
    Book[] getElectronicLibrary();
    boolean addBook(Book book);
    boolean isDuplicate(Book book);
    boolean validateTitleAndAuthor(Book book);
    boolean removeBook(Book book);
    String[] listAllBooks();
    Book[] findBookByAuthor(String author);
    Book[] findBookByBeginningOfAuthorName(String author);
    Book[] findBookByTitle(String title);
    Book[] findBookByBeginningOfTitle(String title);
}

package students.ernests_subhankulovs.lesson_11.level_6.task_38;

class BookLibraryApplication {
    public static void main(String[] args) {
        BookRepository repository = new InMemoryBookRepository();
        BookLibrary bookLibrary = new BookLibrary(repository);
        bookLibrary.run();
    }
}
package students.ernests_subhankulovs.lesson_11.level_7.task_39;

class BookLibraryApplication {
    public static void main(String[] args) {
        BookRepository repository = new InMemoryBookRepository();
        BookLibrary bookLibrary = new BookLibrary(repository);
        bookLibrary.run();
    }
}

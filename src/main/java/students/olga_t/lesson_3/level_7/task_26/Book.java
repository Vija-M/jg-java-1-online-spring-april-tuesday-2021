package students.olga_t.lesson_3.level_7.task_26;

class Book {
    String bookName;
    String bookAuthor;
    int bookPages;

    Book(String bookName, String bookAuthor, int bookPages) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPages = bookPages;
    }

    void showBook() {
        System.out.println(this.bookName + ", " + this.bookAuthor + ", " + this.bookPages + " pages");
    }
}

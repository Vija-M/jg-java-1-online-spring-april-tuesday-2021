package students.olga_t.lesson_3.level_4.task_13;

class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.GetTitle();
        System.out.println("Book title = " + bookTitle);
    }
}

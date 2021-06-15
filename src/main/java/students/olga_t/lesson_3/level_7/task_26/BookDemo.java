package students.olga_t.lesson_3.level_7.task_26;

class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("ABC", "John Doe", 123);
        Book book2 = new Book("DEF", "Johny Donny", 456);
        Book book3 = new Book("GHI", "Johny Bonny", 789);

        book1.showBook();
        book2.showBook();
        book3.showBook();
    }
}

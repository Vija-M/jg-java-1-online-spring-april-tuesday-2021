package students.jevgenij_leshkevich.lesson_3.level_4.task_13;

class Book {

    String title; // добавлен знак ;

    Book(String bookTitle) {
        this.title = bookTitle; // исправлено на bookTitle и добавлен знак ;
    }

    String getTitle() {
        return this.title;
    }
}

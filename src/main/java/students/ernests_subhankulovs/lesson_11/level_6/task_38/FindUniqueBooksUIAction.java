package students.ernests_subhankulovs.lesson_11.level_6.task_38;

import java.util.Set;

class FindUniqueBooksUIAction implements UIAction {
    private BookRepository repository;

    public FindUniqueBooksUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        System.out.println("Found books:");
        Set<Book> uniqueBooks = repository.findUniqueBooks();
        for (Book book : uniqueBooks) {
            if (book.getYearOfIssue().matches("\\d{4}")) {
                System.out.println("Author: " + book.getAuthor() + " Title: " + book.getTitle() + " Year: " + book.getYearOfIssue());
            }
            else {
                System.out.println("Author: " + book.getAuthor() + " Title: " + book.getTitle());
            }
        }
    }
}

package students.ernests_subhankulovs.lesson_11.level_6.task_38;

import java.util.List;
import java.util.Scanner;

class FindUIAction implements UIAction {
    private BookRepository repository;

    public FindUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        List<Book> booksFoundByTitle = repository.findByTitle(title);
        for (Book book : booksFoundByTitle) {
            if (book.getYearOfIssue().matches("\\d{4}")) {
                System.out.println("Author: " + book.getAuthor() + " Title: " + book.getTitle() + " Year: " + book.getYearOfIssue());
            }
            else {
                System.out.println("Author: " + book.getAuthor() + " Title: " + book.getTitle());
            }
        }
    }
}

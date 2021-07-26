package students.ernests_subhankulovs.lesson_11.level_6.task_34;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction {
    private BookRepository repository;

    public FindByTitleUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        List<Book> booksFoundByTitle = repository.findByTitle(title);
        for (Book book : booksFoundByTitle) {
            System.out.println("Author: " + book.getAuthor() + " Title:" + book.getTitle());
        }
    }
}

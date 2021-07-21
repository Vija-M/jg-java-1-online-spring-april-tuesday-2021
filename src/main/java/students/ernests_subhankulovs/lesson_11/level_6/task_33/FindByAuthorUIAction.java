package students.ernests_subhankulovs.lesson_11.level_6.task_33;

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction {
    private BookRepository repository;

    public FindByAuthorUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        List<Book> booksFoundByAuthor = repository.findByAuthor(author);
        for (Book book : booksFoundByAuthor) {
            System.out.println("Author: " + book.getAuthor() + " Title:" + book.getTitle());
        }
    }
}

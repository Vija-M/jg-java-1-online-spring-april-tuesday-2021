package students.ernests_subhankulovs.lesson_11.level_6.task_38;

import java.util.Scanner;

class DeleteByBookUIAction implements UIAction {
    private BookRepository repository;

    public DeleteByBookUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the author of the book to be deleted:");
        String author = scanner.nextLine();
        System.out.println("Enter the title of the book to be deleted:");
        String title = scanner.nextLine();
        System.out.println("Enter the publishing year of the book to be deleted:");
        String year = scanner.nextLine();
        Book bookToBeDeleted;
        if (year.trim().equals("")) {
            bookToBeDeleted = new Book(author, title);
        }
        else {
            bookToBeDeleted = new Book(author, title, year);
        }
        boolean bookDeleted = repository.delete(bookToBeDeleted);
        if (bookDeleted) {
            System.out.println("Book deleted successfully.");
        }
        else {
            System.out.println("Book was not found and not deleted.");
        }
    }
}

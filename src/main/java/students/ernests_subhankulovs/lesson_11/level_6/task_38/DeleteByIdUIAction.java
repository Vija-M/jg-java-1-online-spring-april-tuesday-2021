package students.ernests_subhankulovs.lesson_11.level_6.task_38;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {
    private BookRepository repository;

    public DeleteByIdUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID of the book to be deleted:");
        long id = scanner.nextLong();
        boolean bookDeleted = repository.delete(id);
        if (bookDeleted) {
            System.out.println("Book with ID " + id + " deleted successfully.");
        }
        else {
            System.out.println("Book with ID " + id + " was not deleted.");
        }
    }
}

package students.ernests_subhankulovs.lesson_11.level_6.task_38;

import java.util.Scanner;

class DeleteByAuthorUIAction implements UIAction {
    private BookRepository repository;

    public DeleteByAuthorUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the author of the books to be deleted:");
        String author = scanner.nextLine();
        repository.deleteByAuthor(author);
    }
}

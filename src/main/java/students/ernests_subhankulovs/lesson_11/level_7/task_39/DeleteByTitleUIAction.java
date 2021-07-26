package students.ernests_subhankulovs.lesson_11.level_7.task_39;

import java.util.Scanner;

class DeleteByTitleUIAction implements UIAction {
    private BookRepository repository;

    public DeleteByTitleUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the books to be deleted:");
        String title = scanner.nextLine();
        repository.deleteByTitle(title);
    }

    @Override
    public void setPaging() {

    }
}

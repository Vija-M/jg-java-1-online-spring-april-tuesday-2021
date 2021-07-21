package students.ernests_subhankulovs.lesson_11.level_6.task_33;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {
    private BookRepository repository;

    public FindByIdUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book ID:");
        long id = scanner.nextLong();
        Optional<Book> bookOpt = repository.findById(id);
        System.out.println(bookOpt);
    }
}

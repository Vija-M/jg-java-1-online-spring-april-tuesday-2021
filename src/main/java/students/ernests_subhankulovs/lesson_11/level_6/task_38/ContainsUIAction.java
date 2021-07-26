package students.ernests_subhankulovs.lesson_11.level_6.task_38;

import java.util.Scanner;

class ContainsUIAction implements UIAction {
    private BookRepository repository;

    public ContainsUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        Book book = new Book(author, title);
        boolean contains = repository.contains(book);
        if (contains) {
            System.out.println("The library contains the book searched");
        }
        else  {
            System.out.println("The library does not contain the book searched");
        }
    }
}

package students.ernests_subhankulovs.lesson_11.level_6.task_32;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {
    private BookRepository repository;

    public SaveBookUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        System.out.println("Enter book publishing year:");
        String year = scanner.nextLine();
        Book book;
        if (year.matches("\\d{4}")) {
            book = new Book(author, title);
        }
        else {
            book = new Book(author, title, year);
        }
        repository.save(book);
    }
}

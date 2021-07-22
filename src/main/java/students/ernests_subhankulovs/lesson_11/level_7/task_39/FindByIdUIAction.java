package students.ernests_subhankulovs.lesson_11.level_7.task_39;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {
    private BookRepository repository;
    private int currentPage;
    private int elementsPerPage;

    public FindByIdUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book ID:");
        long id = scanner.nextLong();
        Optional<Book> bookOpt = repository.findById(id);
        if (bookOpt.isPresent()) {
            System.out.println("Author: " + bookOpt.get().getAuthor() + " Title: " + bookOpt.get().getTitle());
        }
        else {
            System.out.println("Book not found");
        }
    }

    @Override
    public void setPaging() {
        System.out.println("Enter paging? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String addPaging = scanner.nextLine();
        if (addPaging.equals("Y")) {
            System.out.println("Enter amount of elements per page:");
            int elementsPerPage = scanner.nextInt();
            System.out.println("Enter page number:");
            this.currentPage = scanner.nextInt();
            this.elementsPerPage = elementsPerPage;
        }
        else if (addPaging.equals("N")) {
            this.currentPage = 1;
            this.elementsPerPage = Integer.MAX_VALUE;
        }
    }
}

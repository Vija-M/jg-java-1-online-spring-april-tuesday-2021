package students.ernests_subhankulovs.lesson_11.level_7.task_39;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {
    private BookRepository repository;
    private int currentPage;
    private int elementsPerPage;

    public FindByTitleUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        List<Book> booksFoundByTitle = repository.findByTitle(title);
        int itemCounter = 0;
        int pageCounter = 1;
        itemCounter++;
        if (itemCounter > elementsPerPage) {
            pageCounter++;
        }
        if (pageCounter == currentPage) {
            for (Book book : booksFoundByTitle) {
                if (book.getYearOfIssue().matches("\\d{4}")) {
                    System.out.println("Author: " + book.getAuthor() + " Title: " + book.getTitle() + " Year: " + book.getYearOfIssue());
                } else {
                    System.out.println("Author: " + book.getAuthor() + " Title: " + book.getTitle());
                }
            }
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

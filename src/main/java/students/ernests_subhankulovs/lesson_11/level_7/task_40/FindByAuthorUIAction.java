package students.ernests_subhankulovs.lesson_11.level_7.task_40;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {
    private BookRepository repository;
    private int currentPage;
    private int elementsPerPage;
    private String sort;

    public FindByAuthorUIAction(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        List<Book> booksFoundBYAuthor = repository.findByAuthor(author);
        int itemCounter = 0;
        int pageCounter = 1;
        switch (sort) {
            case "A" -> Collections.sort(booksFoundBYAuthor);
            case "D" -> Collections.sort(booksFoundBYAuthor, Collections.reverseOrder());
        }
        for (Book book : booksFoundBYAuthor) {
            itemCounter++;
            if (itemCounter > elementsPerPage) {
                pageCounter++;
            }
            if (pageCounter == currentPage) {
                if (book.getYearOfIssue().matches("\\d{4}")) {
                    System.out.println("Author: " + book.getAuthor() + " Title: " + book.getTitle() + " Year: " + book.getYearOfIssue());
                }
                else {
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

    @Override
    public void setSorting() {
        System.out.println("Set sorting? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String setSorting = scanner.nextLine();
        if (setSorting.equals("Y")) {
            System.out.println("Sort ascending or descending? (A/D)");
            this.sort = scanner.nextLine();

        }
        else if (setSorting.equals("N")) {
            this.sort = "";
        }
    }
}

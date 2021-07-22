package students.ernests_subhankulovs.lesson_11.level_7.task_40;

import java.util.List;
import java.util.Scanner;

class FindUIAction implements UIAction {
    private BookRepository repository;
    private int currentPage;
    private int elementsPerPage;
    private String sort;

    public FindUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean searchByAuthor = false;
        boolean searchByTitle = false;
        boolean searchByYear;
        AndSearchCriteria andSearchCriteria;
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("");
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("");
        List<Book> booksFound = null;

        do {
            System.out.println("Search by author? (Y/N)");
            choice = scanner.nextLine();
            if (choice.equals("Y") || choice.equals("N")) {
                break;
            }
        } while (!choice.equals("Y") && !choice.equals("N"));
        if (choice.equals("Y")) {
            System.out.println("Enter book author:");
            String author = scanner.nextLine();
            authorSearchCriteria = new AuthorSearchCriteria(author);
            searchByAuthor = true;
        }
        choice = "";
        do {
            System.out.println("Search by title? (Y/N)");
            choice = scanner.nextLine();
            if (choice.equals("Y") || choice.equals("N")) {
                break;
            }
        } while (!choice.equals("Y") || !choice.equals("N"));
        if (choice.equals("Y")) {
            System.out.println("Enter book title:");
            String title = scanner.nextLine();
            titleSearchCriteria = new TitleSearchCriteria(title);
            searchByTitle = true;
        }
        choice = "";
        do {
            System.out.println("Search by year? (Y/N)");
            choice = scanner.nextLine();
            if (choice.equals("Y") || choice.equals("N")) {
                break;
            }
        } while (!choice.equals("Y") || !choice.equals("N"));
        if (choice.equals("Y")) {
            System.out.println("Enter book publishing year:");
            String title = scanner.nextLine();
            yearSearchCriteria = new YearOfIssueSearchCriteria(title);
            searchByYear = true;
        }
        else {
            searchByYear = false;
        }
        if (!searchByAuthor && !searchByTitle && !searchByYear) {
            System.out.println("Search cannot be performed since no criteria is provided");
        }
        else if (!searchByAuthor && !searchByTitle && searchByYear) {
            booksFound = repository.find(yearSearchCriteria);
        }
        else if (!searchByAuthor && searchByTitle && !searchByYear) {
            booksFound = repository.find(titleSearchCriteria);
        }
        else if (!searchByAuthor && searchByTitle && searchByYear) {
            andSearchCriteria = new AndSearchCriteria(titleSearchCriteria, yearSearchCriteria);
            booksFound = repository.find(andSearchCriteria);
        }
        else if (searchByAuthor && !searchByTitle && !searchByYear) {
            booksFound = repository.find(authorSearchCriteria);
        }
        else if (searchByAuthor && !searchByTitle && searchByYear) {
            andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, yearSearchCriteria);
            booksFound = repository.find(andSearchCriteria);
        }
        else if (searchByAuthor && searchByTitle && !searchByYear) {
            andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
            booksFound = repository.find(andSearchCriteria);
        }
        else {
            andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, new AndSearchCriteria(titleSearchCriteria, yearSearchCriteria));
            booksFound = repository.find(andSearchCriteria);
        }

        System.out.println("Books found:");
        int itemCounter = 0;
        int pageCounter = 1;
        itemCounter++;
        if (itemCounter > elementsPerPage) {
            pageCounter++;
        }
        if ((pageCounter == currentPage) && (booksFound != null)) {
            for (Book book : booksFound) {
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
            int currentPage = scanner.nextInt();
            this.currentPage = currentPage;
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

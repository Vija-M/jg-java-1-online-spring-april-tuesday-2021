package students.ernests_subhankulovs.lesson_11.level_6.task_38;

import java.util.List;
import java.util.Scanner;

class FindUIAction implements UIAction {
    private BookRepository repository;

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
        if (booksFound != null) {
            for (Book book : booksFound) {
                if (book.getYearOfIssue().matches("\\d{4}")) {
                    System.out.println("Author: " + book.getAuthor() + " Title: " + book.getTitle() + " Year: " + book.getYearOfIssue());
                } else {
                    System.out.println("Author: " + book.getAuthor() + " Title: " + book.getTitle());
                }
            }
        }
    }
}
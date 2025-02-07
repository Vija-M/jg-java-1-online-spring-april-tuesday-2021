package students.ernests_subhankulovs.lesson_11.level_6.task_38;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {
    private Map<Integer, UIAction> menuNumberToActionMap;
    private BookRepository bookDatabase;

    public BookLibrary(BookRepository repository) {
        this.bookDatabase = repository;
        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByBookUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new CountUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindUniqueAuthorsUIActions(bookDatabase));
        menuNumberToActionMap.put(12, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(14, new ContainsUIAction(bookDatabase));
        menuNumberToActionMap.put(15, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(16, new GetEachAuthorBookCountUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose your action:");
            System.out.println("1) Save book");
            System.out.println("2) Find book by ID");
            System.out.println("3) Find book by author");
            System.out.println("4) Find book by title");
            System.out.println("5) Delete book by ID");
            System.out.println("6) Delete book by title, name and year");
            System.out.println("7) Count books in the repository");
            System.out.println("8) Delete book by author");
            System.out.println("9) Delete book by title");
            System.out.println("10) Find book by complex criteria");
            System.out.println("11) Find unique authors");
            System.out.println("12) Find unique titles");
            System.out.println("13) Find unique books");
            System.out.println("14) Check if the library contains a book");
            System.out.println("15) Show all books by author");
            System.out.println("16) Count all books by author");
            System.out.println("0) Exit program");
            System.out.println("Please enter menu number: ");
            System.out.println();
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good bye!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }
}
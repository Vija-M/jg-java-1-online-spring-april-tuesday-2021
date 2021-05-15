package students.arturs_arutjunovs.lesson_3.level_7.task_26;

import java.util.Scanner;

class Book {

    String bookName;
    String authorName;
    int pages;

    public Book(String bookName, String authorName, int pages) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pages = pages;
    }

    void download() {
        System.out.println("You trying to search " + bookName + authorName + " author book.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your download speed: ");
        int speed = scanner.nextInt();
        if (speed < 10) {
            System.out.println("Downloading speed too slow for book in " + pages + " pages, please visit our offline shop.");
        } else {
            System.out.println("Thanks for purchasing our book!");
        }
    }
}
class Magazine {

    String magazineName;
    int price;
    boolean colourful;

    public Magazine(String magazineName, int price, boolean colourful) {
        this.magazineName = magazineName;
        this.price = price;
        this.colourful = colourful;
    }

    void buy() {
        System.out.println("As per your request we have " + magazineName + " magazine in stock");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how much money you have: ");
        int money = scanner.nextInt();
        if (money >= 5) {
            colourful = true;
            System.out.println("For that sum you can buy full color version.");
        } else {
            colourful = false;
            System.out.println("Not enough for colourful version, you will get black&white.");
        }
    }
}

    class LibraryDemo {
        public static void main(String[] args) {

            Book book = new Book("\"Java - not only coffee\"", " James Crown", 300);
            Magazine magazine = new Magazine("\"Hacker\"", 5, true);

            book.download();
            System.out.println();
            magazine.buy();
        }
    }
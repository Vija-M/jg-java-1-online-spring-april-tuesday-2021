package students.ernests_subhankulovs.lesson_10.level_6.task_22;

class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.addNewBookTest();
        test.addDuplicateBookTest();
        test.addBookWithoutAuthorTest();
        test.addBookWithoutTitleTest();
        test.removeExistingBookTest();
        test.removeNonExistingBookTest();
        test.listAllBooksTest();
        test.findBookByAuthorTest();
        test.findBookByBeginningOfAuthorNameTest();
        test.findBookByTitleTest();
        test.findBookByBeginningOfTitleTest();
        test.markBookAsReadTest();
        test.markBookAsUnreadTest();
    }

    public void addNewBookTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        boolean realResult = bookReader.addBook(new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Gang of Four"));
        assertLogicalTestResult(true, realResult, "Successfully added book test");
        if (realResult) {
            assertTestResult("Gang of Four", bookReader.getElectronicLibrary()[1].getAuthor(),
                    "Added author test");
            assertTestResult("Design Patterns: Elements of Reusable Object-Oriented Software", bookReader.getElectronicLibrary()[1].getTitle(),
                    "Added book title test");
            assertNumericTestResult(2, bookReader.getElectronicLibrary().length, "Size of library increased test");
        }
    }

    public void addDuplicateBookTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        boolean realResult = bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        assertLogicalTestResult(false, realResult, "Unable to add duplicate book test");
    }

    public void addBookWithoutAuthorTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        boolean realResult = bookReader.addBook(new Book("Thinking in Java", " "));
        assertLogicalTestResult(false, realResult, "Unable to add book without author test");
    }

    public void addBookWithoutTitleTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        boolean realResult = bookReader.addBook(new Book("", "Bruce Eckel"));
        assertLogicalTestResult(false, realResult, "Unable to add book without title test");
    }

    public void removeExistingBookTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        bookReader.addBook(new Book("Thinking in Java", "Bruce Eckel"));
        boolean realResult = bookReader.removeBook(new Book("Thinking in Java", "Bruce Eckel"));
        assertLogicalTestResult(true, realResult, "Remove existing book test");
    }

    public void removeNonExistingBookTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        boolean realResult = bookReader.removeBook(new Book("Thinking in Java", "Bruce Eckel"));
        assertLogicalTestResult(false, realResult, "Unable to remove non-existing book test");
    }

    public void listAllBooksTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        bookReader.addBook(new Book("Thinking in Java", "Bruce Eckel"));
        bookReader.addBook(new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Gang of Four"));
        String[] allBooks = bookReader.listAllBooks();
        assertTestResult(allBooks[0], "Clean Code: A Handbook of Agile Software Craftsmanship [Robert C. Martin]",
                "List all books from the repository test (1st entry)");
        assertTestResult(allBooks[1], "Thinking in Java [Bruce Eckel]",
                "List all books from the repository test (2nd entry)");
        assertTestResult(allBooks[2], "Design Patterns: Elements of Reusable Object-Oriented Software [Gang of Four]",
                "List all books from the repository test (3rd entry)");
    }

    public void findBookByAuthorTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        bookReader.addBook(new Book("Thinking in Java", "Bruce Eckel"));
        bookReader.addBook(new Book("Thinking in Java (4th Edition)", "Bruce Eckel"));
        Book[] booksFoundByAuthor = bookReader.findBookByAuthor("Bruce Eckel");
        int i = 1;
        for (Book book : booksFoundByAuthor) {
            if (book != null) {
                assertTestResult("Bruce Eckel", book.getAuthor(), "Book search by author (Iteration No. " + i + ")");
                i++;
            }
        }
    }

    public void findBookByBeginningOfAuthorNameTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        bookReader.addBook(new Book("Thinking in Java", "Bruce Eckel"));
        bookReader.addBook(new Book("Thinking in Java (4th Edition)", "Bruce Eckel"));
        Book[] booksFoundByAuthor = bookReader.findBookByBeginningOfAuthorName("Bruce");
        int i = 1;
        for (Book book : booksFoundByAuthor) {
            if (book != null) {
                assertTestResult("Bruce Eckel", book.getAuthor(), "Book search by beginning of author name (Iteration No. " + i + ")");
                i++;
            }
        }
    }

    public void findBookByTitleTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        bookReader.addBook(new Book("Thinking in Java", "Bruce Eckel"));
        bookReader.addBook(new Book("Thinking in Java (4th Edition)", "Bruce Eckel"));
        Book[] booksFoundByAuthor = bookReader.findBookByTitle("Thinking in Java");
        int i = 1;
        for (Book book : booksFoundByAuthor) {
            if (book != null) {
                assertTestResult("Thinking in Java", book.getTitle(), "Book search by title (Iteration No. " + i + ")");
                i++;
            }
        }
    }

    public void findBookByBeginningOfTitleTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        bookReader.addBook(new Book("Thinking in Java", "Bruce Eckel"));
        bookReader.addBook(new Book("Thinking in Java (4th Edition)", "Bruce Eckel"));
        Book[] booksFoundByTitle = bookReader.findBookByBeginningOfTitle("Clean Code");
        int i = 1;
        for (Book book : booksFoundByTitle) {
            if (book != null) {
                assertTestResult("Clean Code: A Handbook of Agile Software Craftsmanship", book.getTitle(),
                        "Book search by beginning of title (Iteration No. " + i + ")");
                i++;
            }
        }
        booksFoundByTitle = bookReader.findBookByBeginningOfTitle("Thinking in Java");
        assertTestResult("Thinking in Java", booksFoundByTitle[0].getTitle(),
                "Book search by beginning of title (Iteration No. 2.1)");
        assertTestResult("Thinking in Java (4th Edition)", booksFoundByTitle[1].getTitle(),
                "Book search by beginning of title (Iteration No. 2.2)");
    }

    public void markBookAsReadTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin");
        Book book2 = new Book("Thinking in Java", "Bruce Eckel");
        Book book3 = new Book("Thinking in Java (4th Edition)", "Bruce Eckel");
        Book book4 = new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Gang of Four");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        assertLogicalTestResult(true, bookReader.markAsRead(book1), "Existing book is marked as read test");
        assertLogicalTestResult(true, bookReader.findBookByAuthor("Robert C. Martin")[0].getIsRead(),
                "Information about the fact that the book is read is saved test");
        assertLogicalTestResult(false, bookReader.markAsRead(book4), "Non-existing book is not marked as read");
    }

    public void markBookAsUnreadTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin");
        Book book2 = new Book("Thinking in Java", "Bruce Eckel");
        Book book3 = new Book("Thinking in Java (4th Edition)", "Bruce Eckel");
        Book book4 = new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Gang of Four");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.markAsRead(book1);
        assertLogicalTestResult(true, bookReader.markAsUnread(book1), "Existing book is marked as unread test");
        assertLogicalTestResult(false, bookReader.findBookByAuthor("Robert C. Martin")[0].getIsRead(),
                "Information about the fact that the book is unread is saved test");
        assertLogicalTestResult(false, bookReader.markAsRead(book4), "Non-existing book is not marked as unread");
    }

    private void assertTestResult(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

    private void assertLogicalTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

    private void assertNumericTestResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}



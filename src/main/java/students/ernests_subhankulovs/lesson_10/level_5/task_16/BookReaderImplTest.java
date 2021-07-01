package students.ernests_subhankulovs.lesson_10.level_5.task_16;

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


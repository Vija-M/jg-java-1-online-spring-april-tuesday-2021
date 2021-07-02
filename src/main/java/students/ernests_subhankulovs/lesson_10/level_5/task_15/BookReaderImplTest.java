package students.ernests_subhankulovs.lesson_10.level_5.task_15;

class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.addNewBookTest();
        test.addDuplicateBookTest();
        test.addDuplicateBookTest2();
        test.addBookWithoutAuthorTest();
        test.addBookWithoutTitleTest();
        test.removeExistingBookTest();
        test.removeNonExistingBookTest();
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

    public void addDuplicateBookTest2() {
        BookReader reader = new BookReaderImpl();
        reader.addBook(new Book("The C Programming Language", "K&R"));
        reader.addBook(new Book("The Lord of the Rings", "John Tolkien"));
        reader.addBook(new Book("A Game of Thrones", "George Martin"));
        reader.addBook(new Book("The Lord of the Rings", "John Tolkien"));

        for (Book book : reader.getElectronicLibrary()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
        assertNumericTestResult(3 ,reader.getElectronicLibrary().length, "Number of books in library after duplicate check test");
        assertTestResult("The C Programming Language", reader.getElectronicLibrary()[0].getTitle(), "1st book after duplicate check test");
        assertTestResult("The Lord of the Rings", reader.getElectronicLibrary()[1].getTitle(), "2nd book after duplicate check test");
        assertTestResult("A Game of Thrones", reader.getElectronicLibrary()[2].getTitle(), "3rd book after duplicate check test");
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
        assertLogicalTestResult(true, realResult, "Remove existing book");
    }

    public void removeNonExistingBookTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        boolean realResult = bookReader.removeBook(new Book("Thinking in Java", "Bruce Eckel"));
        assertLogicalTestResult(false, realResult, "Unable to remove non-existing book");
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

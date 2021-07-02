package students.ernests_subhankulovs.lesson_10.level_5.task_13;

class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.addNewBookTest();
        test.addDuplicateBookTest();
    }

    public void addNewBookTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        boolean realResult = bookReader.addBook(new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Gang of Four"));
        assertLogicalTestResult(true, realResult, "Successfully added book test");
        if (realResult) {
            assertTestResult("Gang of Four", bookReader.electronicLibrary[1].getAuthor(),
                    "Added author test");
            assertTestResult("Design Patterns: Elements of Reusable Object-Oriented Software", bookReader.electronicLibrary[1].getTitle(),
                    "Added book title test");
        }
    }

    public void addDuplicateBookTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        boolean realResult = bookReader.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        assertLogicalTestResult(false, realResult, "Unable to add duplicate book test");
    }

//    public void addDuplicateBookTest2() {
//        BookReader reader = new BookReaderImpl();
//        reader.addBook(new Book("The C Programming Language", "K&R"));
//        reader.addBook(new Book("The Lord of the Rings", "John Tolkien"));
//        reader.addBook(new Book("A Game of Thrones", "George Martin"));
//        reader.addBook(new Book("The Lord of the Rings", "John Tolkien"));
//
//        for (Book book : reader.) {
//            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
//        }
//    }

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
}

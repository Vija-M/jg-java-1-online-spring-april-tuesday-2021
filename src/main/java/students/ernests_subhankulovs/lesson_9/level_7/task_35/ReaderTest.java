package students.ernests_subhankulovs.lesson_9.level_7.task_35;

class ReaderTest {
    public static void main(String[] args) {
        ReaderTest test = new ReaderTest();
        test.testFirstName();
        test.testLastName();
        test.testBooksTaken();
        test.testBooksReserved();
        test.testFines();
    }

    public void testFirstName() {
        Reader reader = setNewReader();
        assertTestResult("John", reader.getFirstName(), "First name test");
    }

    public void testLastName() {
        Reader reader = setNewReader();
        assertTestResult("Smith", reader.getLastName(), "Last name test");
    }

    public void testBooksTaken() {
        Reader reader = setNewReader();
        Book[] books = {new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "9780132350884", 464)};
        assertTestResult(books[0].getTitle(), reader.getBooksTaken()[0].getTitle(), "Books taken test");
    }

    public void testBooksReserved() {
        Reader reader = setNewReader();
        Book[] books = {new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Gang of Four", "9780201633610", 568)};
        assertTestResult(books[0].getTitle(), reader.getBooksReserved()[0].getTitle(), "Books taken test");
    }

    public void testFines() {
        Reader reader = setNewReader();
        assertFineTestResult(2.5, reader.getFines(), "Fine test");
    }

    public Reader setNewReader() {
        Book book1 = new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "9780132350884", 464);
        Book book2 = new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Gang of Four", "9780201633610", 568);
        Reader reader = new Reader.Builder("101")
                .withFirstName("John")
                .withLastName("Smith")
                .hasTakenBooks(new Book[] {book1})
                .hasReservedBooks(new Book[] {book2})
                .isObligatedToPayFines(2.5)
                .build();
        return reader;
    }

    private void assertTestResult(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

    private void assertFineTestResult(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

}
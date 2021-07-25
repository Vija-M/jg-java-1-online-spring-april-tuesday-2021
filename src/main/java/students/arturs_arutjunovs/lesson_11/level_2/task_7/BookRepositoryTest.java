package students.arturs_arutjunovs.lesson_11.level_2.task_7;

class BookRepositoryTest {
    public static void main(String[] args) {
        BookRepositoryTest test = new BookRepositoryTest();
        test.bookRemovedTest();
        test.bookNotRemovedTest();
    }

    public void bookRemovedTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        assertTestResult(bookRep.delete(3L), true, "Book was found and removed (by id");

    }

    public void bookNotRemovedTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.delete(2L);
        assertTestResult(bookRep.delete(2L), false, "Book was`t found and not removed (by id");
    }

    private void assertTestResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}
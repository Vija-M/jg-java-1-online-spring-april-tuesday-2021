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
        assertTestResult(bookRep.delete((long) 3), true, "Book was found and removed");

    }

    public void bookNotRemovedTest() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.delete((long) 2);
       // System.out.println(bookRep.bookList.size());
        assertTestResult(bookRep.delete((long) 2), false, "Book was`t found and not removed");
    }

    private void assertTestResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}
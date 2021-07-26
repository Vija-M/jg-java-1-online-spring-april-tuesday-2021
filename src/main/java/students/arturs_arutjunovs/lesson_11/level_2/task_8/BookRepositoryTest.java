package students.arturs_arutjunovs.lesson_11.level_2.task_8;

class BookRepositoryTest {
    public static void main(String[] args) {
        BookRepositoryTest test = new BookRepositoryTest();
        test.bookRemovedTestById();
        test.bookNotRemovedTestById();
        test.shouldDeleteBooks();
    }

    public void bookRemovedTestById() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        assertTestResult(bookRep.delete(3L), true, "Book was found and removed (by id)");

    }

    public void bookNotRemovedTestById() {
        InMemoryBookRepository bookRep = new InMemoryBookRepository();
        bookRep.save(new Book("AUTHOR1", "TITLE1"));
        bookRep.save(new Book("AUTHOR2", "TITLE2"));
        bookRep.save(new Book("AUTHOR3", "TITLE3"));
        bookRep.delete( 2L);
        assertTestResult(bookRep.delete(2L), false, "Book was`t found and not removed (by id)");
    }

    public void shouldDeleteBooks() {
        var subject = new InMemoryBookRepository();
        subject.save(new Book("AUTHOR1", "TITLE1"));
        subject.save(new Book("AUTHOR2", "TITLE2"));
        subject.save(new Book("AUTHOR3", "TITLE3"));

        var b0 = new Book("AUTHOR1", "TITLE1");
        b0.setId(1L);
        var b1 = new Book("AUTHOR2", "TITLE2");
        b1.setId(2L);
        var b2 = new Book("AUTHOR3", "TITLE3");
        b2.setId(3L);
        var b3 = new Book("AUTHOR1", "TITLE1");
        assertTrue(subject.delete(b0), "shouldDeleteBooks (#0)");
        assertTrue(subject.delete(b1), "shouldDeleteBooks (#1)");
        assertTrue(subject.delete(b2), "shouldDeleteBooks (#2)");

        assertFalse(subject.delete(b0), "shouldDeleteBooks (#3)");
        assertFalse(subject.delete(b1), "shouldDeleteBooks (#4)");
        assertFalse(subject.delete(b2), "shouldDeleteBooks (#5)");

        assertFalse(subject.delete(b3), "shouldDeleteBooks (#6)");
    }

    private void assertTrue(boolean actualResult,String testName) {
        if (actualResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
    private void assertFalse(boolean actualResult,String testName) {
        if (!actualResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }

    private void assertTestResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}
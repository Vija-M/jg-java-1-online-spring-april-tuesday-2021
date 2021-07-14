package students.ernests_subhankulovs.lesson_11.level_2.task_8;

class InMemoryBookRepositoryTest {
    public static void main(String[] args) {
        InMemoryBookRepositoryTest test = new InMemoryBookRepositoryTest();
        test.testBookRemoved();
        test.testBookNotRemoved();
        test.testBookRemovedByValue();
        test.testBookNotRemovedByValue();
    }

    public void testBookRemoved() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));

        assertTestResult(true, bookRepository.delete((long) 2), "Book is successfully removed (by index)");
    }

    public void testBookNotRemoved() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.delete((long) 2);
        assertTestResult(false, bookRepository.delete((long) 2), "Book is not found and thus not removed (by index)");
    }

    public void testBookRemovedByValue() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        assertTestResult(true, bookRepository.delete(new Book("A2", "B2")), "Book is successfully removed (by value)");
    }

    public void testBookNotRemovedByValue() {
        InMemoryBookRepository bookRepository = new InMemoryBookRepository();
        bookRepository.save(new Book("A1", "B1"));
        bookRepository.save(new Book("A2", "B2"));
        bookRepository.delete(new Book("A2", "B2"));
        assertTestResult(false, bookRepository.delete(new Book("A2", "B2")), "Book is not found and thus not removed (by value)");
    }

    private void assertTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Actual result: " + realResult);
        }
    }
}

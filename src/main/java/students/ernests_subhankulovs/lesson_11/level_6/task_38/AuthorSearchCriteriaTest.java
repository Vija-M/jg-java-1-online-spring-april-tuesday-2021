package students.ernests_subhankulovs.lesson_11.level_6.task_38;

class AuthorSearchCriteriaTest {
    Assertions assertions = new Assertions();

    public static void main(String[] args) {
        AuthorSearchCriteriaTest test = new AuthorSearchCriteriaTest();
        test.testAuthorSearchCriteria();
        test.testAuthorSearchCriteriaNegative();
    }

    public void testAuthorSearchCriteria() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");
        boolean realResult =  authorSearchCriteria.match(new Book("A1", "B1"));
        assertions.assertTestResult(true, realResult, "Author search criteria returns true");
    }

    public void testAuthorSearchCriteriaNegative() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");
        boolean realResult =  authorSearchCriteria.match(new Book("A2", "B1"));
        assertions.assertTestResult(false, realResult, "Author search criteria returns false");
    }
}

package students.ernests_subhankulovs.lesson_11.level_5.task_28;

class TitleSearchCriteriaTest {
    Assertions assertions = new Assertions();

    public static void main(String[] args) {
        TitleSearchCriteriaTest test = new TitleSearchCriteriaTest();
        test.testTitleSearchCriteria();
        test.testTitleSearchCriteriaNegative();
    }

    public void testTitleSearchCriteria() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("B1");
        boolean realResult =  titleSearchCriteria.match(new Book("A1", "B1"));
        assertions.assertTestResult(true, realResult, "Title search criteria returns true");
    }

    public void testTitleSearchCriteriaNegative() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("B2");
        boolean realResult =  titleSearchCriteria.match(new Book("A1", "B1"));
        assertions.assertTestResult(false, realResult, "Title search criteria returns false");
    }
}

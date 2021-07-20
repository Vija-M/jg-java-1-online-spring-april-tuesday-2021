package students.ernests_subhankulovs.lesson_11.level_3.task_20;

class YearOfIssueSearchCriteriaTest {
    Assertions assertions = new Assertions();

    public static void main(String[] args) {
        YearOfIssueSearchCriteriaTest test = new YearOfIssueSearchCriteriaTest();
        test.testYearOfIssueSearchCriteria();
        test.testYearOfIssueSearchCriteriaNegative();
    }

    public void testYearOfIssueSearchCriteria() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1999");
        boolean realResult =  yearOfIssueSearchCriteria.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Year of issue search criteria returns true");
    }

    public void testYearOfIssueSearchCriteriaNegative() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1999");
        boolean realResult = yearOfIssueSearchCriteria.match(new Book("A1", "B1", "2000"));
        assertions.assertTestResult(false, realResult, "Year of issue search criteria returns false");
    }
}

package students.ernests_subhankulovs.lesson_11.level_6.task_34;

public class AndSearchCriteriaTest {

    Assertions assertions = new Assertions();

    public static void main(String[] args) {
        AndSearchCriteriaTest test = new AndSearchCriteriaTest();
        test.testAndSearchCriteria();
        test.testAndSearchCriteriaNegative();
    }

    public void testAndSearchCriteria() {
        AndSearchCriteria andSearchCriteriaAuthorTitle = new AndSearchCriteria(new AuthorSearchCriteria("A1"),  new TitleSearchCriteria("B1"));
        AndSearchCriteria andSearchCriteriaAuthorYear = new AndSearchCriteria(new AuthorSearchCriteria("A1"),  new YearOfIssueSearchCriteria("1999"));
        AndSearchCriteria andSearchCriteriaTitleAuthor = new AndSearchCriteria(new TitleSearchCriteria("B1"),  new AuthorSearchCriteria("A1"));
        AndSearchCriteria andSearchCriteriaTitleYear = new AndSearchCriteria(new TitleSearchCriteria("B1"),  new YearOfIssueSearchCriteria("1999"));
        AndSearchCriteria andSearchCriteriaYearAuthor = new AndSearchCriteria(new YearOfIssueSearchCriteria("1999"), new AuthorSearchCriteria("A1"));
        AndSearchCriteria andSearchCriteriaYearTitle = new AndSearchCriteria(new YearOfIssueSearchCriteria("1999"), new TitleSearchCriteria("B1"));
        boolean realResult = andSearchCriteriaAuthorTitle.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Author and title search criteria returns true");
        realResult = andSearchCriteriaAuthorYear.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Author and year search criteria returns true");
        realResult = andSearchCriteriaTitleAuthor.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Title and author search criteria returns true");
        realResult = andSearchCriteriaTitleYear.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Title and year search criteria returns true");
        realResult = andSearchCriteriaYearAuthor.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Year and author search criteria returns true");
        realResult = andSearchCriteriaYearTitle.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Year and title search criteria returns true");
    }

    public void testAndSearchCriteriaNegative() {
        AndSearchCriteria andSearchCriteriaAuthorTitle = new AndSearchCriteria(new AuthorSearchCriteria("A1"),  new TitleSearchCriteria("B1"));
        AndSearchCriteria andSearchCriteriaAuthorYear = new AndSearchCriteria(new AuthorSearchCriteria("A1"),  new YearOfIssueSearchCriteria("1999"));
        AndSearchCriteria andSearchCriteriaTitleAuthor = new AndSearchCriteria(new TitleSearchCriteria("B1"),  new AuthorSearchCriteria("A1"));
        AndSearchCriteria andSearchCriteriaTitleYear = new AndSearchCriteria(new TitleSearchCriteria("B1"),  new YearOfIssueSearchCriteria("1999"));
        AndSearchCriteria andSearchCriteriaYearAuthor = new AndSearchCriteria(new YearOfIssueSearchCriteria("1999"), new AuthorSearchCriteria("A1"));
        AndSearchCriteria andSearchCriteriaYearTitle = new AndSearchCriteria(new YearOfIssueSearchCriteria("1999"), new TitleSearchCriteria("B1"));

        boolean realResult = andSearchCriteriaAuthorTitle.match(new Book("A2", "B2", "1999"));
        assertions.assertTestResult(false, realResult, "Author and title search criteria returns false (wrong author and title)");
        realResult = andSearchCriteriaAuthorTitle.match(new Book("A2", "B1", "1999"));
        assertions.assertTestResult(false, realResult, "Author and title search criteria returns false (wrong author)");
        realResult = andSearchCriteriaAuthorTitle.match(new Book("A1", "B2", "1999"));
        assertions.assertTestResult(false, realResult, "Author and title search criteria returns false (wrong title)");

        realResult = andSearchCriteriaAuthorYear.match(new Book("A2", "B1", "2000"));
        assertions.assertTestResult(false, realResult, "Author and year search criteria returns false (wrong author and year)");
        realResult = andSearchCriteriaAuthorYear.match(new Book("A2", "B1", "1999"));
        assertions.assertTestResult(false, realResult, "Author and year search criteria returns false (wrong author)");
        realResult = andSearchCriteriaAuthorYear.match(new Book("A1", "B1", "2000"));
        assertions.assertTestResult(false, realResult, "Author and year search criteria returns false (wrong year)");

        realResult = andSearchCriteriaTitleAuthor.match(new Book("A2", "B2", "1999"));
        assertions.assertTestResult(false, realResult, "Title and author search criteria returns false (wrong title and author)");
        realResult = andSearchCriteriaTitleAuthor.match(new Book("A2", "B1", "1999"));
        assertions.assertTestResult(false, realResult, "Title and author search criteria returns false (wrong author)");
        realResult = andSearchCriteriaTitleAuthor.match(new Book("A1", "B2", "1999"));
        assertions.assertTestResult(false, realResult, "Title and author search criteria returns false (wrong title)");

        realResult = andSearchCriteriaTitleYear.match(new Book("A1", "B2", "2000"));
        assertions.assertTestResult(false, realResult, "Title and year search criteria returns false (wrong title and year)");
        realResult = andSearchCriteriaTitleYear.match(new Book("A1", "B2", "1999"));
        assertions.assertTestResult(false, realResult, "Title and year search criteria returns false (wrong title)");
        realResult = andSearchCriteriaTitleYear.match(new Book("A1", "B1", "2000"));
        assertions.assertTestResult(false, realResult, "Title and year search criteria returns false (wrong year)");

        realResult = andSearchCriteriaYearAuthor.match(new Book("A2", "B1", "2000"));
        assertions.assertTestResult(false, realResult, "Year and author search criteria returns false (wrong year and author)");
        realResult = andSearchCriteriaYearAuthor.match(new Book("A2", "B1", "1999"));
        assertions.assertTestResult(false, realResult, "Year and author search criteria returns false (wrong author)");
        realResult = andSearchCriteriaYearAuthor.match(new Book("A1", "B1", "2000"));
        assertions.assertTestResult(false, realResult, "Year and author search criteria returns false (wrong year)");

        realResult = andSearchCriteriaYearTitle.match(new Book("A1", "B2", "2000"));
        assertions.assertTestResult(false, realResult, "Year and title search criteria returns false (wrong year and title)");
        realResult = andSearchCriteriaYearTitle.match(new Book("A1", "B2", "1999"));
        assertions.assertTestResult(false, realResult, "Year and title search criteria returns false (wrong title)");
        realResult = andSearchCriteriaYearTitle.match(new Book("A1", "B1", "2000"));
        assertions.assertTestResult(false, realResult, "Year and title search criteria returns false (wrong year)");
    }
}

package students.ernests_subhankulovs.lesson_11.level_3.task_21;

class OrSearchCriteriaTest {
    Assertions assertions = new Assertions();

    public static void main(String[] args) {
        OrSearchCriteriaTest test = new OrSearchCriteriaTest();
        test.testOrSearchCriteria();
        test.testOrSearchCriteriaNegative();
    }

    public void testOrSearchCriteria() {
        OrSearchCriteria orSearchCriteriaAuthorTitle = new OrSearchCriteria(new AuthorSearchCriteria("A1"),  new TitleSearchCriteria("B1"));
        OrSearchCriteria orSearchCriteriaAuthorYear = new OrSearchCriteria(new AuthorSearchCriteria("A1"),  new YearOfIssueSearchCriteria("1999"));
        OrSearchCriteria orSearchCriteriaTitleAuthor = new OrSearchCriteria(new TitleSearchCriteria("B1"),  new AuthorSearchCriteria("A1"));
        OrSearchCriteria orSearchCriteriaTitleYear = new OrSearchCriteria(new TitleSearchCriteria("B1"),  new YearOfIssueSearchCriteria("1999"));
        OrSearchCriteria orSearchCriteriaYearAuthor = new OrSearchCriteria(new YearOfIssueSearchCriteria("1999"), new AuthorSearchCriteria("A1"));
        OrSearchCriteria orSearchCriteriaYearTitle = new OrSearchCriteria(new YearOfIssueSearchCriteria("1999"), new TitleSearchCriteria("B1"));

        boolean realResult = orSearchCriteriaAuthorTitle.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Author and title search criteria returns true (both are correct)");
        realResult = orSearchCriteriaAuthorYear.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Author and title search criteria returns true (author is correct)");
        realResult = orSearchCriteriaAuthorYear.match(new Book("A1", "B2", "1999"));
        assertions.assertTestResult(true, realResult, "Author and title search criteria returns true (title is correct)");

        realResult = orSearchCriteriaAuthorYear.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Author and year search criteria returns true (both are correct)");
        realResult = orSearchCriteriaAuthorYear.match(new Book("A1", "B1", "2000"));
        assertions.assertTestResult(true, realResult, "Author and year search criteria returns true (author is correct)");
        realResult = orSearchCriteriaAuthorYear.match(new Book("A2", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Author and year search criteria returns true (year is correct)");

        realResult = orSearchCriteriaTitleAuthor.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Title and author search criteria returns true (both are correct)");
        realResult = orSearchCriteriaTitleAuthor.match(new Book("A2", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Title and author search criteria returns true (title is correct)");
        realResult = orSearchCriteriaTitleAuthor.match(new Book("A1", "B2", "1999"));
        assertions.assertTestResult(true, realResult, "Title and author search criteria returns true (author is correct)");

        realResult = orSearchCriteriaTitleYear.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Title and year search criteria returns true (both are correct)");
        realResult = orSearchCriteriaTitleYear.match(new Book("A1", "B1", "2000"));
        assertions.assertTestResult(true, realResult, "Title and year search criteria returns true (title is correct)");
        realResult = orSearchCriteriaTitleYear.match(new Book("A1", "B2", "1999"));
        assertions.assertTestResult(true, realResult, "Title and year search criteria returns true (year is correct)");

        realResult = orSearchCriteriaYearAuthor.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Year and author search criteria returns true (both are correct)");
        realResult = orSearchCriteriaYearAuthor.match(new Book("A2", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Year and author search criteria returns true (year is correct)");
        realResult = orSearchCriteriaYearAuthor.match(new Book("A1", "B1", "2000"));
        assertions.assertTestResult(true, realResult, "Year and author search criteria returns true (author is correct)");

        realResult = orSearchCriteriaYearTitle.match(new Book("A1", "B1", "1999"));
        assertions.assertTestResult(true, realResult, "Year and title search criteria returns true (both are correct)");
        realResult = orSearchCriteriaYearTitle.match(new Book("A1", "B2", "1999"));
        assertions.assertTestResult(true, realResult, "Year and title search criteria returns true (year is correct)");
        realResult = orSearchCriteriaYearTitle.match(new Book("A1", "B1", "2000"));
        assertions.assertTestResult(true, realResult, "Year and title search criteria returns true (title is correct)");
    }

    public void testOrSearchCriteriaNegative() {
        OrSearchCriteria orSearchCriteriaAuthorTitle = new OrSearchCriteria(new AuthorSearchCriteria("A1"),  new TitleSearchCriteria("B1"));
        OrSearchCriteria orSearchCriteriaAuthorYear = new OrSearchCriteria(new AuthorSearchCriteria("A1"),  new YearOfIssueSearchCriteria("1999"));
        OrSearchCriteria orSearchCriteriaTitleAuthor = new OrSearchCriteria(new TitleSearchCriteria("B1"),  new AuthorSearchCriteria("A1"));
        OrSearchCriteria orSearchCriteriaTitleYear = new OrSearchCriteria(new TitleSearchCriteria("B1"),  new YearOfIssueSearchCriteria("1999"));
        OrSearchCriteria orSearchCriteriaYearAuthor = new OrSearchCriteria(new YearOfIssueSearchCriteria("1999"), new AuthorSearchCriteria("A1"));
        OrSearchCriteria orSearchCriteriaYearTitle = new OrSearchCriteria(new YearOfIssueSearchCriteria("1999"), new TitleSearchCriteria("B1"));

        boolean realResult = orSearchCriteriaAuthorTitle.match(new Book("A2", "B2", "1999"));
        assertions.assertTestResult(false, realResult, "Author and title search criteria returns false (both are wrong)");

        realResult = orSearchCriteriaAuthorYear.match(new Book("A2", "B1", "2000"));
        assertions.assertTestResult(false, realResult, "Author and year search criteria returns false (both are wrong)");

        realResult = orSearchCriteriaTitleAuthor.match(new Book("A2", "B2", "1999"));
        assertions.assertTestResult(false, realResult, "Title and author search criteria returns false (both are wrong)");

        realResult = orSearchCriteriaTitleYear.match(new Book("A1", "B2", "2000"));
        assertions.assertTestResult(false, realResult, "Title and year search criteria returns false (both are wrong)");

        realResult = orSearchCriteriaYearAuthor.match(new Book("A2", "B1", "2000"));
        assertions.assertTestResult(false, realResult, "Year and author search criteria returns false (both are wrong)");

        realResult = orSearchCriteriaYearTitle.match(new Book("A1", "B2", "2000"));
        assertions.assertTestResult(false, realResult, "Year and title search criteria returns false (both are wrong)");
    }
}

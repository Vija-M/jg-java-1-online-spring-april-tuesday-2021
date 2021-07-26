package students.ernests_subhankulovs.lesson_11.level_7.task_40;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYearOfIssue().equals(this.yearOfIssueToSearch);
    }
}

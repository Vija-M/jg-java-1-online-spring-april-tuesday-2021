package students.ernests_subhankulovs.lesson_11.level_4.task_26;

class SearchCriteriaDemo {
    public static void main(String[] args) {
        Book book = new Book("Kuper", "Zveroboi", "1890");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println("Author: 'Kuper' AND Title: 'Zveroboi' : " + searchCriteria.match(book));
        AndSearchCriteria authorAndTitleSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        AndSearchCriteria authorAndYearSearchCriteria = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        System.out.println("Author: 'Kuper' AND Year of Issue: '1890' : " + authorAndYearSearchCriteria.match(book));
        OrSearchCriteria authorOrYearOrTitleSearchCriteria = new OrSearchCriteria(authorSearchCriteria, new OrSearchCriteria(yearOfIssueSearchCriteria, authorAndTitleSearchCriteria));
        System.out.println("Author: 'Kuper' OR Year of Issue: '1890' OR Title: 'Zveroboi' : " + authorOrYearOrTitleSearchCriteria.match(book));
    }

}

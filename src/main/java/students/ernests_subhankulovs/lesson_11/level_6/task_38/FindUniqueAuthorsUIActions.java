package students.ernests_subhankulovs.lesson_11.level_6.task_38;

import java.util.Set;

class FindUniqueAuthorsUIActions implements UIAction {
    private BookRepository repository;

    public FindUniqueAuthorsUIActions(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        System.out.println("Found authors:");
        Set<String> uniqueAuthors = repository.findUniqueAuthors();
        for (String author : uniqueAuthors) {
            System.out.println(author);
        }
    }
}

package students.ernests_subhankulovs.lesson_11.level_6.task_38;

import java.util.Set;

class FindUniqueTitlesUIAction implements UIAction {
    private BookRepository repository;

    public FindUniqueTitlesUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        System.out.println("Found titles:");
        Set<String> uniqueTitles = repository.findUniqueTitles();
        for (String title : uniqueTitles) {
            System.out.println(title);
        }
    }
}

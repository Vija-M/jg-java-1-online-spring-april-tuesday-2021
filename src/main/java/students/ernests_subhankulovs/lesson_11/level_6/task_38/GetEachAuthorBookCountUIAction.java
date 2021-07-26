package students.ernests_subhankulovs.lesson_11.level_6.task_38;

import java.util.Map;

class GetEachAuthorBookCountUIAction implements UIAction {
    private BookRepository repository;

    public GetEachAuthorBookCountUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Map<String, Integer> authorBookCount = repository.getEachAuthorBookCount();
        for (Map.Entry entry: authorBookCount.entrySet()) {
            System.out.println("Author: " + entry.getKey() + "; Book count: " + entry.getValue());
        }
    }
}

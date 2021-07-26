package students.ernests_subhankulovs.lesson_11.level_6.task_38;

import java.util.List;
import java.util.Map;

class GetAuthorToBooksMapUIAction implements UIAction {
    private BookRepository repository;

    public GetAuthorToBooksMapUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        Map<String, List<Book>> authorToBooksMap = repository.getAuthorToBooksMap();
        List<Book> books;
        for (Map.Entry entry: authorToBooksMap.entrySet()) {
            System.out.println("Author: " + entry.getKey());
            books = (List<Book>) entry.getValue();
            for (Book book : books) {
                System.out.println("Book: " + book.getTitle());
            }
            System.out.println("---");
        }
    }
}

package students.ernests_subhankulovs.lesson_11.level_7.task_39;

class CountUIAction implements UIAction {
    private BookRepository repository;

    public CountUIAction(BookRepository repository) {
        this.repository = repository;
    }

    public void execute() {
        int count = repository.count();
        if (count == 1) {
            System.out.println("The book repository contains 1 book");
        }
        else {
            System.out.println("The book repository contains " + count + " books");
        }
    }

    @Override
    public void setPaging() {

    }
}

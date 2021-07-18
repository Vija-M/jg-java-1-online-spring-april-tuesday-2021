package students.dmitriy_shukailo.lesson_11.level_2.task_7;

import java.util.Objects;

class InMemoryBookRepositoryTest {

    public static void main(String[] args) {

        InMemoryBookRepositoryTest test = new InMemoryBookRepositoryTest();
        test.removeBookId();
        test.notRemoveBookId();
    }

    void removeBookId() {

        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("A1", "B1"));
        inMemoryBookRepository.save(new Book("A2", "B2"));
        checkTest(true, inMemoryBookRepository.delete(1L), "The book has been founded and deleted");
    }

    void notRemoveBookId() {

        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        inMemoryBookRepository.save(new Book("A1", "B1"));
        inMemoryBookRepository.save(new Book("A2", "B2"));
        checkTest(false, inMemoryBookRepository.delete(3L), "The book has not been founded and deleted");
    }

    private void checkTest(boolean expected, boolean actual, String test) {

        if (Objects.equals(expected, actual)) {
            System.out.println(test + " = OK!");
        } else {
            System.out.println(test + " = FAIL!");
        }
    }

}
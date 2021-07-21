package students.dmitriy_shukailo.lesson_11.level_2.task_8;

import java.util.Objects;

class InMemoryBookRepositoryTest {

    public static void main(String[] args) {

        InMemoryBookRepositoryTest test = new InMemoryBookRepositoryTest();

        test.shouldDeleteBooksById();
    }

    public void shouldDeleteBooksById() {

        var subject = new InMemoryBookRepository();
        subject.save(new Book("A1", "B1"));
        subject.save(new Book("A2", "B2"));
        subject.save(new Book("A3", "B3"));

        checkTest(true, subject.delete(0L), "shouldDeleteBooksById (#0)");
        checkTest(true, subject.delete(1L), "shouldDeleteBooksById (#1)");
        checkTest(true, subject.delete(2L), "shouldDeleteBooksById (#2)");

        checkTest(false, subject.delete(0L), "shouldDeleteBooksById (#3)");
        checkTest(false, subject.delete(1L), "shouldDeleteBooksById (#4)");
        checkTest(false, subject.delete(2L), "shouldDeleteBooksById (#5)");
    }

    private void checkTest(boolean expected, boolean actual, String test) {

        if (Objects.equals(expected, actual)) {
            System.out.println(test + " = OK!");
        } else {
            System.out.println(test + " = FAIL!");
        }
    }

}
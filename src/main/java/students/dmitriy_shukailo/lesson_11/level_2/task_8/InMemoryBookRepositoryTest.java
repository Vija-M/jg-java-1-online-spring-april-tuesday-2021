package students.dmitriy_shukailo.lesson_11.level_2.task_8;

import static students.dmitriy_shukailo.lesson_11.level_2.task_8.Assertions.assertFalse;
import static students.dmitriy_shukailo.lesson_11.level_2.task_8.Assertions.assertTrue;

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

        assertTrue(subject.delete(0L), "shouldDeleteBooksById (#0)");
        assertTrue(subject.delete(1L), "shouldDeleteBooksById (#1)");
        assertTrue(subject.delete(2L), "shouldDeleteBooksById (#2)");

        assertFalse(subject.delete(0L), "shouldDeleteBooksById (#3)");
        assertFalse(subject.delete(1L), "shouldDeleteBooksById (#4)");
        assertFalse(subject.delete(2L), "shouldDeleteBooksById (#5)");
    }

}
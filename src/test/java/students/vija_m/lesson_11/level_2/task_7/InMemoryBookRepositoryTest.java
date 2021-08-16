package students.vija_m.lesson_11.level_2.task_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryBookRepositoryTest {
    InMemoryBookRepository victim = new InMemoryBookRepository();

    @Test
    void deletedBook() {
        victim.save(new Book("A1", "B1"));
        victim.save(new Book("A2", "B2"));
        assertTrue(victim.delete((long)1));
    }
}
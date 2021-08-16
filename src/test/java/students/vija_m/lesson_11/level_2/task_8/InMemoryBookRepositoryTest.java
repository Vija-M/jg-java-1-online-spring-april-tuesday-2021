package students.vija_m.lesson_11.level_2.task_8;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryBookRepositoryTest {

    @Test
    void removedBookByID() {
        InMemoryBookRepository victim = new InMemoryBookRepository();
        victim.save(new Book("A1", "B1"));
        victim.save(new Book("A2", "B2"));
        assertTrue(victim.delete((long) 1));
    }

    @Test
    void noBookToRemovedByID() {
        InMemoryBookRepository victim = new InMemoryBookRepository();
        victim.save(new Book("A1", "B1"));
        victim.save(new Book("A2", "B2"));
        assertFalse(victim.delete((long) 3));
    }

    @Test
    void bookRemovedByValue() {
        InMemoryBookRepository victim = new InMemoryBookRepository();
        Book book1 = ( new Book("A1", "B1") );
        Book book2 = ( new Book("A2", "B2") );
        victim.save(book1);
        victim.save(book2);
        victim.delete(book1);
        List<Book> expected = List.of(book2);
        assertEquals(expected, victim.getBooksDataBase());
    }
}

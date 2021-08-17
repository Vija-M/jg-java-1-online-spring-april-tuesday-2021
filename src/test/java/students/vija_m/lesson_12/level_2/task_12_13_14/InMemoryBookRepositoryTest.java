package students.vija_m.lesson_12.level_2.task_12_13_14;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

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

    @Test
    void bookFoundByID() {
        InMemoryBookRepository victim = new InMemoryBookRepository();
        victim.save(new Book("A1", "B1"));
        victim.save(new Book("A2", "B2"));
        Optional<Book> bookFound = victim.findById((long) 1);
        assertTrue(bookFound.isPresent());
    }

    @Test
    void bookNotFoundByID() {
        InMemoryBookRepository victim = new InMemoryBookRepository();
        victim.save(new Book("A1", "B1"));
        victim.save(new Book("A2", "B2"));
        Optional<Book> bookFound = victim.findById((long) 3);
        assertFalse(bookFound.isPresent());
    }

    @Test
    void booksFoundByAuthor() {
        InMemoryBookRepository victim = new InMemoryBookRepository();
        Book book1 = ( new Book("A1", "B1") );
        Book book2 = ( new Book("A2", "B2") );
        Book book3 = ( new Book("A2", "B3") );
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        List<Book> expected = List.of(book2, book3);
        assertEquals(expected, victim.findByAuthor("A2"));
    }

    @Test
    void noBooksFoundByAuthor() {
        InMemoryBookRepository victim = new InMemoryBookRepository();
        Book book1 = ( new Book("A1", "B1") );
        Book book2 = ( new Book("A2", "B2") );
        Book book3 = ( new Book("A2", "B3") );
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        List<Book> expected = List.of();
        assertEquals(expected, victim.findByAuthor("A3"));
    }

    @Test
    void booksFoundByTitle() {
        InMemoryBookRepository victim = new InMemoryBookRepository();
        Book book1 = ( new Book("A1", "B1") );
        Book book2 = ( new Book("A2", "B2") );
        Book book3 = ( new Book("A3", "B1") );
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        List<Book> expected = List.of(book1, book3);
        assertEquals(expected, victim.findByTitle("B1"));
    }

    @Test
    void noBooksFoundByTitle() {
        InMemoryBookRepository victim = new InMemoryBookRepository();
        Book book1 = ( new Book("A1", "B1") );
        Book book2 = ( new Book("A2", "B2") );
        Book book3 = ( new Book("A3", "B1") );
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        List<Book> expected = List.of();
        assertEquals(expected, victim.findByTitle("B3"));
    }

    @Test
    void countBooks() {
        InMemoryBookRepository victim = new InMemoryBookRepository();
        victim.save(new Book("A1", "B1"));
        victim.save(new Book("A2", "B2"));
        victim.save(new Book("A2", "B3"));
        assertEquals(3, victim.count());
    }

    @Test
    void countBooksIfZero() {
        InMemoryBookRepository victim = new InMemoryBookRepository();
        assertEquals(0, victim.count());
    }

    @Test
    void booksRemovedByAuthor() {
        InMemoryBookRepository victim = new InMemoryBookRepository();
        Book book1 = ( new Book("A1", "B1") );
        Book book2 = ( new Book("A2", "B2") );
        Book book3 = ( new Book("A3", "B3") );
        Book book4 = ( new Book("A2", "B4") );
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.deleteByAuthor("A2");
        List<Book> expected = List.of(book1, book3);
        assertEquals(expected, victim.getBooksDataBase());
    }

    @Test
    void booksRemovedByTitle() {
        InMemoryBookRepository victim = new InMemoryBookRepository();
        Book book1 = ( new Book("A1", "B1") );
        Book book2 = ( new Book("A2", "B2") );
        Book book3 = ( new Book("A3", "B2") );
        Book book4 = ( new Book("A2", "B4") );
        victim.save(book1);
        victim.save(book2);
        victim.save(book3);
        victim.save(book4);
        victim.deleteByTitle("B2");
        List<Book> expected = List.of(book1, book4);
        assertEquals(expected, victim.getBooksDataBase());
    }


}
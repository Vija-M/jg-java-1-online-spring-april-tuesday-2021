package students.dmitrijs_matrenicevs.lesson_11.level_2.task_7_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryBookRepository implements BookRepository {

    private final ArrayList<Book> books = new ArrayList<>();
    private Long id = 0L;

    public ArrayList<Book> getBooks() {
        return books;
    }

    @Override
    public Long save(Book book) {
        book.setId(id++);
        books.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        return books.removeIf(book -> book.getId().equals(bookId));
    }

    @Override
    public boolean delete(Book book) {
        return book.getId() != null && books.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        ArrayList<Book> arrayListAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                arrayListAuthor.add(book);
            }
        }
        return arrayListAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        ArrayList<Book> arrayListTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                arrayListTitle.add(book);
            }
        }
        return arrayListTitle;
    }

    @Override
    public int count() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String bookAuthor) {
        books.removeIf(book -> book.getAuthor().equals(bookAuthor));
    }

    @Override
    public void deleteByTitle(String bookTitle) {
        books.removeIf(book -> book.getTitle().equals(bookTitle));
    }
}
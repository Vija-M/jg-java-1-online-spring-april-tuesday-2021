package students.dmitriy_shukailo.lesson_11.level_2.task_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryBookRepository implements BookRepository {

    private ArrayList<Book> books = new ArrayList<>();
    private Long id = 0L;

    public List<Book> getBooks() {
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
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }

    @Override
    public int count() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        ArrayList<Book> booksDeleteByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (!book.getAuthor().equals(author)) {
                booksDeleteByAuthor.add(book);
            }
        }
        books = booksDeleteByAuthor;
    }

    @Override
    public void deleteByTitle(String title) {
        ArrayList<Book> booksDeleteByTitle = new ArrayList<>();
        for (Book book : books) {
            if (!book.getTitle().equals(title)) {
                booksDeleteByTitle.add(book);
            }
        }
        books = booksDeleteByTitle;
    }

}
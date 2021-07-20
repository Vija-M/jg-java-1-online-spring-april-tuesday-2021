package students.dmitrijs_matrenicevs.lesson_11.level_2.task_7_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryBookRepository implements BookRepository {

    List<Book> books = new ArrayList<>();

    @Override
    public Long save(Book book) {
        Long bookID = (long) (books.size() + 1);
        book.setId(bookID);
        books.add(book);
        return bookID;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book books : books) {
            if (books.getAuthor().equals(book.getAuthor()) && books.getTitle().equals(book.getTitle())) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book books : books){
            if (books.getId().equals(bookId)){
                return Optional.of(books);
            }
        }
        return Optional.empty();
    }
}

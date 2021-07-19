package students.arturs_arutjunovs.lesson_11.level_2.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryBookRepository implements BookRepository {
    ArrayList<Book> bookList = new ArrayList<>();

    @Override
    public Long save(Book book) {
        Long newId = (long) (bookList.size() + 1);
        bookList.add(book);
        book.setId(newId);
        return newId;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book books : bookList) {
            if (books.getAuthor().equals(book.getAuthor()) && (books.getTitle().equals(book.getTitle()))) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for(Book book : bookList) {
            if(book.getId().equals(bookId)) {
               return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        ArrayList<Book>booksFoundByAuthor = new ArrayList<>();
        for(Book book : bookList) {
            if(book.getAuthor().equals(author)) {
                 booksFoundByAuthor.add(book);
            }
        }
        return booksFoundByAuthor;
    }
}

package students.dmitrijs_matrenicevs.lesson_11.level_2.task_7_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryBookRepository implements BookRepository {

    List<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks(){
        return (ArrayList<Book>) books;
    }
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
        for (Book books : books) {
            if (books.getId().equals(bookId)) {
                return Optional.of(books);
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
    public void deleteByAuthor(String author) {
        ArrayList<Book> deleteByAuthor = new ArrayList<>();
        for (Book book : books) {
            if(!book.getAuthor().equals(author)){
                deleteByAuthor.add(book);
            }
        }
        books = deleteByAuthor;
    }

    @Override
    public void deleteByTitle(String title) {
        ArrayList<Book> deleteByTitle = new ArrayList<>();
        for (Book book : books) {
            if (!book.getTitle().equals(title)) {
                deleteByTitle.add(book);
            }
        }
        books = deleteByTitle;
    }
}
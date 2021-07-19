package students.arturs_arutjunovs.lesson_11.level_2.task_7;

import java.util.ArrayList;

class InMemoryBookRepository implements BookRepository {
    ArrayList<Book> bookList = new ArrayList<>();

    @Override
    public Long save(Book book) {
        Long newId = (long)(bookList.size() + 1);
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
}

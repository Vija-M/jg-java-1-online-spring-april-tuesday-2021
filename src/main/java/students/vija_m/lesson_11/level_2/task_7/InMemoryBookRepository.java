package students.vija_m.lesson_11.level_2.task_7;

import java.util.ArrayList;

class InMemoryBookRepository implements BookRepository{
    ArrayList<Book> bookDataBase = new ArrayList<>();

    @Override
    public Long save(Book book) {
        Long newID = (long) ( bookDataBase.size() + 1 );
        book.setId(newID);
        bookDataBase.add(book);
        return newID;
    }

    @Override
    public boolean delete(Long bookId) {
        return bookDataBase.removeIf(book -> book.getId().equals(bookId));
    }
}
/*      @Override
    public boolean delete(Long bookId) {
        for (Book book : bookDataBase) {
            if (book.getId().equals(bookId)) {
                bookDataBase.remove(book);
                return true;
            }
        }
        return false;
    }*/

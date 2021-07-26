package students.ernests_subhankulovs.lesson_10.level_5.task_13;

class BookReaderImpl implements BookReader {

    Book[] electronicLibrary = new Book[0];

    @Override
    public boolean addBook(Book book) {
        if (isDuplicate(book)) {
            return false;
        }
        else {
            Book[] newBooks = new Book[electronicLibrary.length + 1];
            System.arraycopy(electronicLibrary, 0, newBooks, 0, electronicLibrary.length);
            newBooks[newBooks.length - 1] = book;
            electronicLibrary = newBooks;
            return true;
        }
    }

    @Override
    public boolean isDuplicate(Book newBook) {
        for (Book savedBook : electronicLibrary) {
            if (savedBook.getAuthor().equals(newBook.getAuthor()) &&
                savedBook.getTitle().equals(newBook.getTitle())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Book[] getElectronicLibrary() {
        return electronicLibrary;
    }
}

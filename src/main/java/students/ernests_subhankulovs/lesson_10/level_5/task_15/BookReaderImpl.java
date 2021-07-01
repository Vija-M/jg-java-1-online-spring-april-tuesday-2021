package students.ernests_subhankulovs.lesson_10.level_5.task_15;

class BookReaderImpl implements BookReader {

    private Book[] electronicLibrary = new Book[1];

    public Book[] getElectronicLibrary() {
        return electronicLibrary;
    }

    @Override
    public boolean addBook(Book book) {
        if (electronicLibrary[0] != null && !isDuplicate(book) && validateTitleAndAuthor(book)) {
            Book[] newBooks = new Book[electronicLibrary.length + 1];
            System.arraycopy(electronicLibrary, 0, newBooks, 0, electronicLibrary.length);
            newBooks[newBooks.length - 1] = book;
            electronicLibrary = newBooks;
            return true;
        }
        else {
            electronicLibrary[0] = book;
            return false;
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
    public boolean validateTitleAndAuthor(Book book) {
        return (!book.getAuthor().trim().equals("") && !book.getTitle().trim().equals(""));
    }

    @Override
    public boolean removeBook(Book book) {
        Book[] updatedLibrary = new Book[electronicLibrary.length];
        for (int i = 0; i < electronicLibrary.length; i++) {
            updatedLibrary[i] = electronicLibrary[i];
            if (electronicLibrary[i].getAuthor().equals(book.getAuthor()) &&
                electronicLibrary[i].getTitle().equals(book.getTitle())) {
                if (updatedLibrary.length - 1 - i >= 0) {
                    System.arraycopy(electronicLibrary, i + 1, updatedLibrary, i, updatedLibrary.length - 1 - i);
                }
                electronicLibrary = updatedLibrary;
                return true;
            }
        }
        return false;
    }
}

package students.ernests_subhankulovs.lesson_10.level_6.task_23;

class BookReaderImpl implements BookReader {

    private Book[] electronicLibrary = new Book[0];

    @Override
    public Book[] getElectronicLibrary() {
        return electronicLibrary;
    }

    @Override
    public boolean addBook(Book book) {
        if (!isDuplicate(book) && validateTitleAndAuthor(book)) {
            Book[] newBooks = new Book[electronicLibrary.length + 1];
            System.arraycopy(electronicLibrary, 0, newBooks, 0, electronicLibrary.length);
            newBooks[newBooks.length - 1] = book;
            electronicLibrary = newBooks;
            return true;
        }
        else {
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

    @Override
    public String[] listAllBooks() {
        String[] allBooks = new String[electronicLibrary.length];
        for (int i = 0; i < allBooks.length; i++) {
            allBooks[i] = electronicLibrary[i].getTitle() + " [" + electronicLibrary[i].getAuthor() + "]";
        }
        return allBooks;
    }

    @Override
    public Book[] findBookByAuthor(String author) {
        int i = 0;
        Book[] foundBooks = new Book[electronicLibrary.length];
        for (Book book : electronicLibrary) {
            if (book.getAuthor().equals(author)) {
                foundBooks[i] = book;
                i++;
            }
        }
        return foundBooks;
    }

    @Override
    public Book[] findBookByBeginningOfAuthorName(String author) {
        int i = 0;
        Book[] foundBooks = new Book[electronicLibrary.length];
        for (Book book : electronicLibrary) {
            if (book.getAuthor().startsWith(author)) {
                foundBooks[i] = book;
                i++;
            }
        }
        return foundBooks;
    }

    @Override
    public Book[] findBookByTitle(String title) {
        int i = 0;
        Book[] foundBooks = new Book[electronicLibrary.length];
        for (Book book : electronicLibrary) {
            if (book.getTitle().equals(title)) {
                foundBooks[i] = book;
                i++;
            }
        }
        return foundBooks;
    }

    @Override
    public Book[] findBookByBeginningOfTitle(String title) {
        int i = 0;
        Book[] foundBooks = new Book[electronicLibrary.length];
        for (Book book : electronicLibrary) {
            if (book.getTitle().startsWith(title)) {
                foundBooks[i] = book;
                i++;
            }
        }
        return foundBooks;
    }

    @Override
    public boolean markAsRead(Book book) {
        for (Book savedBook : electronicLibrary) {
            if (savedBook.getAuthor().equals(book.getAuthor()) && savedBook.getTitle().equals(book.getTitle())) {
                savedBook.setIsRead(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean markAsUnread(Book book) {
        for (Book savedBook : electronicLibrary) {
            if (savedBook.getAuthor().equals(book.getAuthor()) && savedBook.getTitle().equals(book.getTitle())) {
                savedBook.setIsRead(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] listAllReadBooks() {
        String[] allReadBooks = new String[electronicLibrary.length];
        int i = 0;
        for (Book savedBook : electronicLibrary) {
            if (savedBook.getIsRead()) {
                allReadBooks[i] = savedBook.getTitle() + " [" + savedBook.getAuthor() + "]";
                i++;
            }
        }
        return allReadBooks;
    }
}

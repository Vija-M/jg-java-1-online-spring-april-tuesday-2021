package students.ernests_subhankulovs.lesson_8.level_7.task_31;

class Reader {
    private String cardNumber;
    private String firstName;
    private String lastName;
    private Book[] booksTaken;
    private Book[] booksReserved;
    private double fines;

    public Reader(String cardNumber, String firstName, String lastName) {
        this.cardNumber = cardNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Book[] getBooksTaken() {
        return booksTaken;
    }

    public Book[] getBooksReserved() {
        return booksReserved;
    }

    public double getFines() {
        return fines;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBooksTaken(Book[] booksTaken) {
        this.booksTaken = booksTaken;
    }

    public void setBooksReserved(Book[] booksReserved) {
        this.booksReserved = booksReserved;
    }

    public void setFines(double fines) {
        this.fines = fines;
    }
}

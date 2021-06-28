package students.ernests_subhankulovs.lesson_9.level_7.task_35;

class Reader {

    private String cardNumber;
    private String firstName;
    private String lastName;
    private Book[] booksTaken;
    private Book[] booksReserved;
    private double fines;

    public static class Builder {
        private String cardNumber;
        private String firstName;
        private String lastName;
        private Book[] booksTaken;
        private Book[] booksReserved;
        private double fines;

        public Builder(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder hasTakenBooks(Book[] booksTaken) {
            this.booksTaken = booksTaken;
            return this;
        }

        public Builder hasReservedBooks(Book[] booksReserved) {
            this.booksReserved = booksReserved;
            return this;
        }

        public Builder isObligatedToPayFines(double fines) {
            this.fines = fines;
            return this;
        }

        public Reader build() {
            Reader reader = new Reader();
            reader.cardNumber = this.cardNumber;
            reader.firstName = this.firstName;
            reader.lastName = this.lastName;
            reader.booksTaken = this.booksTaken;
            reader.booksReserved = this.booksReserved;
            reader.fines = this.fines;
            return reader;
        }
    }

    private Reader() {

    }

    private Reader(Builder builder) {
        this.cardNumber = builder.cardNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.firstName;
        this.booksTaken = builder.booksTaken;
        this.booksReserved = builder.booksReserved;
        this.fines = builder.fines;
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
}

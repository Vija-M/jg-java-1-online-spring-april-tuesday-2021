package students.ernests_subhankulovs.lesson_9.level_7.task_35;

import java.util.Date;

class Book {
    private String title;
    private String author;
    private String ISBN;
    private int numberOfPages;
    private Reservation[] reservations;
    private Date dateTaken;
    private Date returnDate;
    private int daysOverdue;

    public Book(String title, String author, String ISBN, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Reservation[] getReservations() {
        return reservations;
    }

    public Date getDateTaken() {
        return dateTaken;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public int getDaysOverdue() {
        return daysOverdue;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setReservations(Reservation[] reservations) {
        this.reservations = reservations;
    }

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setDaysOverdue(int daysOverdue) {
        this.daysOverdue = daysOverdue;
    }
}
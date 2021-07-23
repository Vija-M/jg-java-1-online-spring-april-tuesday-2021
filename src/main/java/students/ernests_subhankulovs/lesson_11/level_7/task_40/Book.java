package students.ernests_subhankulovs.lesson_11.level_7.task_40;

import java.util.Objects;

class Book implements Comparable<Book> {
    private Long id;
    private String title;
    private String author;
    private String yearOfIssue;

    @Override
    public int compareTo(Book obj) {
        long id = this.id;
        return (int) id;
    }
    @Override
    public String toString() {
        return "Author: " + author + ", Title: " + title;
    }

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    Book(String author, String title, String yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYearOfIssue() {
        return this.yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        if (id != null) {
            return id.equals(book.id) && title.equals(book.title) && author.equals(book.author);
        }
        else {
            return title.equals(book.title) && author.equals(book.author);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }
}
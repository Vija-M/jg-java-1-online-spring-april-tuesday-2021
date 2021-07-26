package students.arturs_arutjunovs.lesson_11.level_2.task_9;

import java.util.Objects;

class Book {

    private Long id;
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
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
            return id.equals(book.id) && author.equals(book.author) && title.equals(book.title);
        } else {
            return author.equals(book.author) && title.equals(book.title);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }
}



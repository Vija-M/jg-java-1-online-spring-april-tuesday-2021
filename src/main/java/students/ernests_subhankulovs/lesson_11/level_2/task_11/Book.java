package students.ernests_subhankulovs.lesson_11.level_2.task_11;

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

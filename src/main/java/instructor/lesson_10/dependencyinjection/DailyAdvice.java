package instructor.lesson_10.dependencyinjection;

import java.util.Objects;

class DailyAdvice {

    private final String text;
    private final String author;

    DailyAdvice(String text, String author) {
        this.text = text;
        this.author = author;
    }

    String getText() {
        return text;
    }

    String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DailyAdvice that = (DailyAdvice) o;
        return Objects.equals(text, that.text) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, author);
    }

    @Override
    public String toString() {
        return "DailyAdvice{" +
                "text='" + text + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

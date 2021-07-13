package students.ernests_subhankulovs.lesson_11.level_1.task_5;

class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        else if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        else {
            Book book = (Book) object;
            return (title.equals(book.title) && author.equals(book.author));
        }
    }
}

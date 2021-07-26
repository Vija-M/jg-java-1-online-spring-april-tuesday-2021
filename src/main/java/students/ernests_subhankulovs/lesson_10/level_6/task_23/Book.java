package students.ernests_subhankulovs.lesson_10.level_6.task_23;

class Book {
    private String title;
    private String author;
    private boolean isRead;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        isRead = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsRead() {
        return isRead;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }
}

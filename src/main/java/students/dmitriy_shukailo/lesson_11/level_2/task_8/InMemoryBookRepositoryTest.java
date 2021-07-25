package students.dmitriy_shukailo.lesson_11.level_2.task_8;

class InMemoryBookRepositoryTest {

    public static void main(String[] args) {

        InMemoryBookRepositoryTest test = new InMemoryBookRepositoryTest();

        test.shouldDeleteBooksById();
        test.shouldDeleteBooks();
    }

    public void shouldDeleteBooksById() {

        var subject = new InMemoryBookRepository();
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        Book book3 = new Book("A3", "B3");

        subject.save(book1);
        subject.save(book2);
        subject.save(book3);

        Assertions.assertTrue(subject.delete(0L), "shouldDeleteBooksById (#0)");
        Assertions.assertTrue(subject.delete(1L), "shouldDeleteBooksById (#1)");
        Assertions.assertTrue(subject.delete(2L), "shouldDeleteBooksById (#2)");

        Assertions.assertFalse(subject.delete(0L), "shouldDeleteBooksById (#3)");
        Assertions.assertFalse(subject.delete(1L), "shouldDeleteBooksById (#4)");
        Assertions.assertFalse(subject.delete(2L), "shouldDeleteBooksById (#5)");

        System.out.println();
    }

    public void shouldDeleteBooks() {

        var subject = new InMemoryBookRepository();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        Book book3 = new Book("A3", "B3");

        subject.save(book1);
        subject.save(book2);
        subject.save(book3);

        Assertions.assertTrue(subject.delete(book1), "shouldDeleteBooks (#0)");
        Assertions.assertTrue(subject.delete(book2), "shouldDeleteBooks (#1)");
        Assertions.assertTrue(subject.delete(book3), "shouldDeleteBooks (#2)");

        Assertions.assertFalse(subject.delete(book1), "shouldDeleteBooks (#3)");
        Assertions.assertFalse(subject.delete(book2), "shouldDeleteBooks (#4)");
        Assertions.assertFalse(subject.delete(book3), "shouldDeleteBooks (#5)");

        System.out.println();
    }

}
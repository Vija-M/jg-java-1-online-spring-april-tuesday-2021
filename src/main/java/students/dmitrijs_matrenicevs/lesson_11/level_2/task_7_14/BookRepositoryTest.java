package students.dmitrijs_matrenicevs.lesson_11.level_2.task_7_14;

class BookRepositoryTest {

    InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();

    public static void main(String[] args) {
        BookRepositoryTest bookRepositoryTest = new BookRepositoryTest();
        bookRepositoryTest.deleteBookTestID();
        bookRepositoryTest.noDeleteBookTestID();
        bookRepositoryTest.deleteBookTest();
        bookRepositoryTest.noDeleteBookTest();
    }

    void deleteBookTestID(){
        inMemoryBookRepository.save(new Book("JAVA1","WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2","WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3","WORLD3"));
        assertResultTest (inMemoryBookRepository.delete((long) 1), true, "Книга найдена и удалена!");
    }

    void noDeleteBookTestID(){
        inMemoryBookRepository.save(new Book("JAVA1","WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2","WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3","WORLD3"));
        assertResultTest (inMemoryBookRepository.delete((long) 2), false, "Книга не найдена и не удалена!");
    }

    void deleteBookTest(){
        inMemoryBookRepository.save(new Book("JAVA1","WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2","WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3","WORLD3"));
        assertResultTest (inMemoryBookRepository.delete(new Book("JAVA1","WORLD1")), true, "Книга найдена и удалена!");
    }

    void noDeleteBookTest(){
        inMemoryBookRepository.save(new Book("JAVA1","WORLD1"));
        inMemoryBookRepository.save(new Book("JAVA2","WORLD2"));
        inMemoryBookRepository.save(new Book("JAVA3","WORLD3"));
        assertResultTest (inMemoryBookRepository.delete(new Book("JAVA1","WORLD1")), false, "Книга не найдена и не удалена!");
    }

    void assertResultTest(boolean actualResult, boolean expectedResult, String name){
        if (actualResult == expectedResult){
            System.out.println(name + " = TEST TRUE");
        }
        else {
            System.out.println(name + " = TEST FALSE");
        }
    }
}

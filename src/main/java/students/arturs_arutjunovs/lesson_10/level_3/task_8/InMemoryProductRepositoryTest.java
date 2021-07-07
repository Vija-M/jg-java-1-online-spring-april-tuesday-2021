package students.arturs_arutjunovs.lesson_10.level_3.task_8;

class InMemoryProductRepositoryTest {
    InMemoryProductRepository repository = new InMemoryProductRepository();

    public static void main(String[] args) {
        InMemoryProductRepositoryTest test = new InMemoryProductRepositoryTest();
        test.testProductSearchPoint_1();
        test.testProductSearchPoint_2();
        test.testProductSearchPoint_3();
        test.testProductSearchPoint_4();
    }

    void testProductSearchPoint_1() {
        repository.save(new Product("FIZZ"));
        assertTestResult("FIZZ", repository.findByTitle("FIZZ").getTitle(),
                "Test product search on 1 of 4 the repository points");
    }

    void testProductSearchPoint_2() {
        repository.save(new Product("BUZZ"));
        assertTestResult("BUZZ", repository.findByTitle("BUZZ").getTitle(),
                "Test product search on 2 of 4 the repository points");
    }

    void testProductSearchPoint_3() {
        repository.save(new Product("FIZZ-BUZZ"));
        assertTestResult("FIZZ-BUZZ", repository.findByTitle("FIZZ-BUZZ").getTitle(),
                "Test product search on 3 of 4 the repository points");
    }
    void testProductSearchPoint_4() {
        repository.save(new Product("BUZZ-FIZZ"));
        assertTestResult("BUZZ-FIZZ", repository.findByTitle("BUZZ-FIZZ").getTitle(),
                "Test product search on 4 of 4 the repository points");
}
    private void assertTestResult(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAILED]: " + testName);
        }
    }
}

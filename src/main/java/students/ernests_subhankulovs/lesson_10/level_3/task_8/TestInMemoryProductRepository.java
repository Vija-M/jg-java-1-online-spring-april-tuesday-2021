package students.ernests_subhankulovs.lesson_10.level_3.task_8;

public class TestInMemoryProductRepository {
    public static void main(String[] args) {
        TestInMemoryProductRepository test = new TestInMemoryProductRepository();
        test.testProductSearchAtStart();
        test.testProductSearchInTheMiddle();
        test.testProductSearchAtTheEnd();
    }

    public void testProductSearchAtStart() {
        InMemoryProductRepository repository = createProductRepository();
        assertTestResult("Product A", repository.findByTitle("Product A").getTitle(),
                "Test product search at the beginning of the repository");
    }

    public void testProductSearchInTheMiddle() {
        InMemoryProductRepository repository = createProductRepository();
        assertTestResult("Product B", repository.findByTitle("Product B").getTitle(),
                "Test product search in the middle of the repository");
    }

    public void testProductSearchAtTheEnd() {
        InMemoryProductRepository repository = createProductRepository();
        assertTestResult("Product C", repository.findByTitle("Product C").getTitle(),
                "Test product search at the end of the repository");
    }

    public InMemoryProductRepository createProductRepository() {
        InMemoryProductRepository productRepository = new InMemoryProductRepository();
        productRepository.save(new Product("Product A"));
        productRepository.save(new Product("Product B"));
        productRepository.save(new Product("Product C"));
        return productRepository;
    }

    private void assertTestResult(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}

package students.ernests_subhankulovs.lesson_10.level_3.task_10;

import java.util.Optional;

public class TestInMemoryProductRepository {
    public static void main(String[] args) {
        TestInMemoryProductRepository test = new TestInMemoryProductRepository();
        test.testProductSearchAtStart();
        test.testProductSearchInTheMiddle();
        test.testProductSearchAtTheEnd();
        test.testNonExistingProductSearch();
    }

    public void testProductSearchAtStart() {
        if (checkIfItemExists("Product A")) {
            assertTestResult("Product A", getActualProductTitle("Product A"),
                    "Test product search at the beginning of the repository");
        }

    }

    public void testProductSearchInTheMiddle() {
        if (checkIfItemExists("Product B")) {
            assertTestResult("Product B", getActualProductTitle("Product B"),
                    "Test product search in the middle of the repository");
        }
    }

    public void testProductSearchAtTheEnd() {
        if (checkIfItemExists("Product C")) {
            assertTestResult("Product C", getActualProductTitle("Product C"),
                    "Test product search at the end of the repository");
        }
    }

    public void testNonExistingProductSearch() {
        InMemoryProductRepository repository = createProductRepository();
        Optional<Product> repositoryEntry = repository.findByTitle("Product D");
        assertFalse(repositoryEntry.isPresent(), "Test non-existing product search");
    }

    private InMemoryProductRepository createProductRepository() {
        InMemoryProductRepository productRepository = new InMemoryProductRepository();
        productRepository.save(new Product("Product A"));
        productRepository.save(new Product("Product B"));
        productRepository.save(new Product("Product C"));
        return productRepository;
    }

    private String getActualProductTitle(String productTitle) {
        InMemoryProductRepository repository = createProductRepository();
        return repository.findByTitle(productTitle).get().getTitle();
    }

    private boolean checkIfItemExists(String productTitle) {
        InMemoryProductRepository repository = createProductRepository();
        return assertTrue(repository.findByTitle(productTitle).isPresent(), "Test if item \"" + productTitle + "\" exists");
    }

    private void assertTestResult(String  expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

    private boolean assertTrue(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return true;
        }
        else {
            System.out.println(testName + " = FAIL");
            return false;
        }
    }

    private void assertFalse(boolean condition, String testName) {
        if (!condition) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}

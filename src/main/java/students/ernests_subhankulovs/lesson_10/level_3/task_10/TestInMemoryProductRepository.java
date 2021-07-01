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
        assertTestResult("Product A", getActualProductTitle("Product A"),
                "Test product search at the beginning of the repository");
    }

    public void testProductSearchInTheMiddle() {
        InMemoryProductRepository repository = createProductRepository();
        assertTestResult("Product B", getActualProductTitle("Product B"),
                "Test product search in the middle of the repository");
    }

    public void testProductSearchAtTheEnd() {
        InMemoryProductRepository repository = createProductRepository();
        assertTestResult("Product C", getActualProductTitle("Product C"),
                "Test product search at the end of the repository");
    }

    public void testNonExistingProductSearch() {
        InMemoryProductRepository repository = createProductRepository();
        assertTestResult("", getActualProductTitle("Product D"),
                "Test non-existing product search");
    }

    public InMemoryProductRepository createProductRepository() {
        InMemoryProductRepository productRepository = new InMemoryProductRepository();
        productRepository.save(new Product("Product A"));
        productRepository.save(new Product("Product B"));
        productRepository.save(new Product("Product C"));
        return productRepository;
    }

    public String getActualProductTitle(String productTitle) {
        InMemoryProductRepository repository = createProductRepository();
        Optional<Product> repositoryEntry = repository.findByTitle(productTitle);
        if (repositoryEntry.isPresent()) {
            return repository.findByTitle(productTitle).get().getTitle();
        }
        else {
            return "";
        }
    }

    private void assertTestResult(String  expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}

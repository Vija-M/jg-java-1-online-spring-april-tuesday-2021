package students.linda_junkina.lesson_10.level_3.task_8;

public class InMemoryProductRepositoryTest {
    public static void main(String[] args) {
        InMemoryProductRepositoryTest test = new InMemoryProductRepositoryTest();
        test.addNewProduct();
    }

    public void addNewProduct() {
        InMemoryProductRepository inMemoryProductRepository = new InMemoryProductRepository();
        inMemoryProductRepository.save(new Product("ABC"));
        checkTestResult(new Product("ABC"),
                inMemoryProductRepository.findByTitle("ABC"));
    }

    private void checkTestResult(Product expected, Product actual) {
        if (expected.equals(actual)) {
            System.out.println("Add new product" + " = OK!");
        } else {
            System.out.println("Add new product" + " = FAIL!");
        }
    }
}

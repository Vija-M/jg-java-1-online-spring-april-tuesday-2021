package students.linda_junkina.lesson_10.level_3.task_8;

public class InMemoryProductRepositoryTest {
    public static void main(String[] args) {
        InMemoryProductRepositoryTest test = new InMemoryProductRepositoryTest();
        test.addNewProduct();
    }

    public void addNewProduct() {
        InMemoryProductRepository inMemoryProductRepository = new InMemoryProductRepository();
        inMemoryProductRepository.save(new Product("ABC"));
//        checkTestResult("ABC",
//                inMemoryProductRepository.findByTitle("ABC"),
//                "Add a new product");
    }

    private void checkTestResult(Product expected, Product actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}

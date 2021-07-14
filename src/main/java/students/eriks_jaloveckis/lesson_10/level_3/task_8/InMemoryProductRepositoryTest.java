package students.eriks_jaloveckis.lesson_10.level_3.task_8;

class InMemoryProductRepositoryTest {
    public static void main(String[] args) {
        InMemoryProductRepositoryTest inMemoryProductRepositoryTest = new InMemoryProductRepositoryTest();
        inMemoryProductRepositoryTest.searchProduct1();
        inMemoryProductRepositoryTest.searchProduct2();

    }

    public void assertTest(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + " TEST IS OK!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }

    public InMemoryProductRepository createProduct() {
        InMemoryProductRepository inMemoryProductRepository = new InMemoryProductRepository();
        inMemoryProductRepository.save(new Product("Coca Cola"));
        inMemoryProductRepository.save(new Product("Fanta"));
        return inMemoryProductRepository;
    }

    public void searchProduct1() {
        InMemoryProductRepository inMemoryProductRepository = createProduct();
        assertTest("Coca Cola", inMemoryProductRepository.findByTitle("Coca Cola").getTitle(),
                "New product");
    }

    public void searchProduct2() {
        InMemoryProductRepository inMemoryProductRepository = createProduct();
        assertTest("Fanta", inMemoryProductRepository.findByTitle("Fanta").getTitle(),
                "New product after Cola");
    }


}





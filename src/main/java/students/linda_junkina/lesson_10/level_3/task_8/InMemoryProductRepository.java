package students.linda_junkina.lesson_10.level_3.task_8;

class InMemoryProductRepository implements ProductRepository {
    Product[] product = new Product[0];

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findByTitle(String productTitle) {
        return null;
    }
}

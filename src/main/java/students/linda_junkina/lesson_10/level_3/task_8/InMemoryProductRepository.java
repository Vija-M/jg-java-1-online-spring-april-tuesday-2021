package students.linda_junkina.lesson_10.level_3.task_8;

import java.util.Arrays;

class InMemoryProductRepository implements ProductRepository {

    private Product[] container = new Product[0];

    @Override
    public void save(Product product) {
        container = Arrays.copyOf(container, container.length + 1);
        container[container.length - 1] = product;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : container) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}

package students.linda_junkina.lesson_10.level_3.task_8;

import java.util.Arrays;

class InMemoryProductRepository implements ProductRepository {

    private Product[] container = new Product[0];

    @Override
    public void save(Product product) {
        for (int i = 0; i < container.length; i++) {
            container = Arrays.copyOf(container, container.length + 1);
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InMemoryProductRepository that = (InMemoryProductRepository) o;
        return Arrays.equals(container, that.container);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(container);
    }
}

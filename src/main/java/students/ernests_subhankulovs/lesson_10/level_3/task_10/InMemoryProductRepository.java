package students.ernests_subhankulovs.lesson_10.level_3.task_10;

import java.util.Arrays;
import java.util.Optional;

class InMemoryProductRepository implements ProductRepository {
    Product[] products = new Product[1];

    @Override
    public void save(Product product) {
        if (products[0] != null) {
            Product[] newProducts = new Product[products.length + 1];
            System.arraycopy(products, 0, newProducts, 0, products.length);
            newProducts[newProducts.length - 1] = product;
            products = newProducts;
        }
        else {
            products[0] = product;
        }
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        return Arrays.stream(products).filter(product -> product.getTitle().equals(productTitle))
                                      .findFirst();
    }
}

package students.eriks_jaloveckis.lesson_10.level_3.task_8;

class InMemoryProductRepository implements ProductRepository {
    Product[] products = new Product[1];

    @Override
    public void save(Product product) {
        if (products[0] != null) {
            Product[] newProducts = new Product[products.length + 1];
            System.arraycopy(products, 0, newProducts, 0, products.length);
            newProducts[newProducts.length - 1] = product;
            products = newProducts;
        } else {
            products[0] = product;
        }
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (product != null && product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}

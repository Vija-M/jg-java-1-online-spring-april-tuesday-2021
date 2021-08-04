package students.arturs_arutjunovs.lesson_10.level_3.task_8;

class InMemoryProductRepository implements ProductRepository {

    Product[] products = new Product[1];

    public void save(Product product) {
        if (products[0] != null) {
            //создаём новый массив длиннее предыдущего на 1
            Product[] newProducts = new Product[products.length + 1];
            //копируем все содержимое сторого массива в новый
            System.arraycopy(products, 0, newProducts, 0, products.length);
            //в последнюю ячейку нового массива сохраняем новый продукт
            newProducts[newProducts.length - 1] = product;
            products = newProducts;
        } else {
            products[0] = product;
        }
    }

    public Product findByTitle(String productTitle) {
        for (Product product : products) {   //проходимся по массиву
            //и находим первый встретившийся продукт с указанным названием
            if (product != null && product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}

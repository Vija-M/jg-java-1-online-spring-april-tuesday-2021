package students.linda_junkina.lesson_10.level_3.task_8;

import java.util.Arrays;

class InMemoryProductRepository implements ProductRepository {


    Product[] productsArray = new Product[0];

    @Override
    public void save(Product product) {
        if (productsArray[0] != null) {
            //создать новый массив (на 1 больше предыдущего) и скопировать в него старый
            Product[] newProduct = new Product[productsArray.length + 1];
            System.arraycopy(productsArray, 0, newProduct, 1, 1);

            // создать новый массив из старого добавив 1 элемент
//            productsArray = Arrays.copyOf(productsArray, productsArray.length + 1);

            newProduct[newProduct.length - 1] = product;
            productsArray = newProduct;
        }
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : productsArray) {
            if (product.equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}

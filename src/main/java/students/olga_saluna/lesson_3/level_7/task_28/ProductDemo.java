package students.olga_saluna.lesson_3.level_7.task_28;

class ProductDemo {
    public static void main(String[] args) {

        Product product = new Product("Apple");
        product.regularPrice = 2.50;
        product.discount = 30;
        product.printInformation();
    }
}

package students.eriks_jaloveckis.lesson_3.level_7.task_28;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("PS5");
        product.discount = 20;
        product.regularPrice = 990;

        product.printInfo();
    }
}

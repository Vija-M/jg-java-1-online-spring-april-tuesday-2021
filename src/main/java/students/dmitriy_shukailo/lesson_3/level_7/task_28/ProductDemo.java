package students.dmitriy_shukailo.lesson_3.level_7.task_28;

class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product("Lipton Tea");
        product.regularPrice = 5;
        product.discount = 10;
        product.printIformation();
    }
}
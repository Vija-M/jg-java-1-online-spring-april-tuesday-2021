package students.vija_m.lesson_3.level_7.task_28;

class ProductDemo {
    public static void main(String[] args) {
        Product fruit = new Product("Apple");
        fruit.regularPrice = 1.21;
        fruit.discount = 0.11;

        fruit.printInformation();
    }
}

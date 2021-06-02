package students.linda_junkina.lesson_3.level_7.task_28;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("IceHockey Ticket");

        product.regularPrice = 150;
        product.discount = 20;
        product.printInfo();
    }
}

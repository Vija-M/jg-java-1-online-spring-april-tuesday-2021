package students.linda_junkina.lesson_3.level_7.task_28;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "IceHockey Tickets";
        product.regularPrice = 150;
        product.discount = 0.5;

        System.out.println(product.name + ": " + product.newPrice());
    }
}

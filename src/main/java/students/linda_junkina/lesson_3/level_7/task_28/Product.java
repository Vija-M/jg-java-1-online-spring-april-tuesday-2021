package students.linda_junkina.lesson_3.level_7.task_28;

class Product {
    String name;
    double regularPrice;
    double discount;
    double newPrice;

    double newPrice() {
        return newPrice = regularPrice * discount;
    }
}

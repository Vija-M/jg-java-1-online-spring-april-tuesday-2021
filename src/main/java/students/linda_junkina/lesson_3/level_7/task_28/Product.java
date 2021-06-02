package students.linda_junkina.lesson_3.level_7.task_28;

class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        return this.regularPrice - this.regularPrice * (discount / 100);
    }

    void printInfo() {
        System.out.println("Your " + name + " will cost " + actualPrice() + "$");
    }
}

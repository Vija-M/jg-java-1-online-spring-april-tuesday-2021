package students.olga_t.lesson_3.level_7.task_28;

class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        return this.regularPrice - this.discount * this.regularPrice;
    }

    void printInformation() {
        System.out.println("Product " + this.name);
        System.out.println("Product price " + this.regularPrice);
        System.out.println("Product discount " + this.discount);
        System.out.println("Product actual price " + this.actualPrice());
    }
}

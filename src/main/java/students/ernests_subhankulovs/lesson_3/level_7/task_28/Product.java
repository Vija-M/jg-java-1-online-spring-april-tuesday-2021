package students.ernests_subhankulovs.lesson_3.level_7.task_28;

public class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        return this.regularPrice - this.regularPrice * this.discount;
    }

    void printInformation() {
        System.out.println(" ");
        System.out.println("Product name: " + this.name + ";");
        System.out.println("Regular price: " + this.regularPrice + ";");
        System.out.println("Discount: " + this.discount + ";");
        System.out.println("Actual price: " + this.actualPrice() + ".");
    }
}

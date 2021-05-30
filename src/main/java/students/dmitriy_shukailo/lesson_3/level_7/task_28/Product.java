package students.dmitriy_shukailo.lesson_3.level_7.task_28;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product (String name) {
        this.name = name;
    }

    double actualPrice () {
        return regularPrice - (regularPrice * discount /  100);
    }

    void printIformation () {
        System.out.println("Product Name  : " + name);
        System.out.println("Regular Price : " + regularPrice + " $");
        System.out.println("Discount      : " + discount + " %");
        System.out.println("Actual Price  : " + actualPrice() + " $");
    }
}
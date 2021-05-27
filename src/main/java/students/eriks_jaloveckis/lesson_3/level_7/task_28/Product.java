package students.eriks_jaloveckis.lesson_3.level_7.task_28;

class Product {
    String name;
    double regularPrice;
    double discount;


    Product(String name) {
        this.name = name;
    }


    double actualPrice() {
        return this.regularPrice - this.regularPrice * (this.discount / 100);
    }

    void printInfo() {
        System.out.println("Product`s name is          - " + name);
        System.out.println("Product`s regular price is - " + regularPrice);
        System.out.println("Product`s discount is      - " + discount);
        System.out.println("Product`s actual price     - " + this.actualPrice());
    }


}

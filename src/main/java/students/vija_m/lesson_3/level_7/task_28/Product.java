package students.vija_m.lesson_3.level_7.task_28;

class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        return this.regularPrice - this.discount;
    }

    void printInformation() {
        System.out.println("Price  of this " + name + " after our super Ligo discount is only " + actualPrice() + " EUR.");
    }
 }


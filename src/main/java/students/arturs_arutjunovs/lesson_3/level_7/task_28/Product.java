package students.arturs_arutjunovs.lesson_3.level_7.task_28;

class Product {

    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;

    }

    double actualPrice(double discount) {
        return regularPrice - (regularPrice * discount / 100.0);
    }

    void printInformation() {
        System.out.println("Water tank regular price is " + regularPrice);
        System.out.println("Discount for this item is " + discount + " percents");
        System.out.println("Water tank \"" + name + "\" price with given discount is " + actualPrice(discount));

    }
}

class ProductDemo {
    public static void main(String[] args) {

        Product aquaObj = new Product("OCEAN LIFE");
        aquaObj.regularPrice = 213.0;
        aquaObj.discount = 15.0;

        aquaObj.actualPrice(15.0);
        aquaObj.printInformation();
    }
}

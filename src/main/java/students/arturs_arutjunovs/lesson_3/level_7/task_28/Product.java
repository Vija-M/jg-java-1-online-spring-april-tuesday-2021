package students.arturs_arutjunovs.lesson_3.level_7.task_28;

class Product {

    String waterTank;
    double regularPrice;
    double discount;

    public Product(String waterTank) {
        this.waterTank = waterTank;

    }

    double actualPrice(double discount) {
        discount = (regularPrice * discount) / 100;
        return regularPrice - discount;
    }

    void printInformation() {
        System.out.println("Water tank regular price is " + regularPrice);
        System.out.println("Discount for this item is " + discount + " percents");
        System.out.println("Water tank " + waterTank + " price with given discount is " + actualPrice(discount));

    }
}


class ProductDemo {
    public static void main(String[] args) {

        Product aquaObj = new Product("Ocean Life");
        aquaObj.regularPrice = 213.0;
        aquaObj.discount = 15;

        aquaObj.actualPrice(15);
        aquaObj.printInformation();
    }
}
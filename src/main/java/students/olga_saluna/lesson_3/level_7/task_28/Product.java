package students.olga_saluna.lesson_3.level_7.task_28;

class Product {
    String name;
    double regularPrice;
    double discount;
    Product (String name){
        this.name=name;
    }

    double actualPrice(){
        return regularPrice - (regularPrice*discount/100);
    }
    void printInformation() {
        System.out.println("Regular price of product " + this.name + " is " + regularPrice + ". Discount is " + discount + "% and price including discount is " + actualPrice() + ".");
    }
}


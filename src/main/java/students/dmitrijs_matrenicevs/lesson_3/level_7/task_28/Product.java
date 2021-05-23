package students.dmitrijs_matrenicevs.lesson_3.level_7.task_28;

class Product {

    String product;
    double regularPrice;
    double discount;

    Product(String name){

        this.product = name;
    }

    double actualPrice(){

        return this.regularPrice - this.regularPrice * (this.discount / 100);
    }

    void printInformation(){

        System.out.println("Продукт который ты купил: " + this.product);
        System.out.println("Стандартная цена на продукт: " + this.regularPrice);
        System.out.println("Скидка в процентах: " + this.discount);
        System.out.println("Цена со скидкой: " + actualPrice());
    }


}

package students.ernests_subhankulovs.lesson_3.level_7.task_28;

import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter product name:");
        String productName = scanner.nextLine();
        Product product = new Product(productName);
        System.out.println("Enter regular product price:");
        double regularProductPrice = scanner1.nextDouble();
        product.regularPrice = regularProductPrice;
        System.out.println("Enter product discount (%):");
        double productDiscount = scanner1.nextDouble();
        product.discount = productDiscount;

        product.actualPrice();
        product.printInformation();
    }
}

package students.aleksandrs_shavlisnkis.lesson_2;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter number 1: ");

        int a = scanner.nextInt();

        System.out.println("Please enter number 2: ");

        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("sum = " + sum);

        int sub = a - b;
        System.out.println("sub = " + sub);

        int mul = a * b;
        System.out.println("mul = " + mul);

        int div = a / b;
        System.out.println("div = " + div);





    }
}

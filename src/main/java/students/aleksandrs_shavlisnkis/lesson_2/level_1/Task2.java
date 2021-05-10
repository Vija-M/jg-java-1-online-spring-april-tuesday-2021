package students.aleksandrs_shavlisnkis.lesson_2.level_1;

public class Task2 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter fractional number 1: ");

        double a = scanner.nextDouble();

        System.out.println("Please enter fractional number 2: ");

        double b = scanner.nextDouble();

        double sum = a + b;
        System.out.println("sum = " + sum);

        double sub = a - b;
        System.out.println("sub = " + sub);

        double mul = a * b;
        System.out.println("mul = " + mul);

        double div = a / b;
        System.out.println("div = " + div);


    }

}

package students.olga_saluna.lesson_2.level_1.task_2;

class Task2 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter A fractional number: ");

        double a = scanner.nextDouble();

        System.out.println("Please enter B fractional number: ");

        double b = scanner.nextDouble();

        double sum = a + b;
        System.out.println("sum = " + sum);

        double sub = a - b;
        System.out.println("sub = " + sub);

        double mult = a * b;
        System.out.println("mult = " + mult);

        double div = a / b;
        System.out.println("div = " + div);
    }
}
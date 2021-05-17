package students.vladimir_konstantinov.lesson_2.level_1.task_2;

class Task2 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double a = scanner.nextDouble();
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

package students.dmitriy_shukailo.lesson_2.level_1.task_2;

public class Calculator_Double {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = a + b;
        System.out.println("sum = " + a + " + " + b + " = " + sum);

        double sub = a - b;
        System.out.println("sub = " + a + " - " + b + " = " + sub);

        double div = a / b;
        System.out.println("sub = " + a + " / " + b + " = " + div);

        double mul = a * b;
        System.out.println("sub = " + a + " * " + b + " = " + mul);

    }

}

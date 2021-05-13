package students.dmitriy_shukailo.lesson_2.level_3.task_11;

public class ArithmeticMean {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please, enter a number 1: ");
        int a = scanner.nextInt();
        System.out.print("Please, enter a number 2: ");
        int b = scanner.nextInt();
        System.out.print("Please, enter a number 3: ");
        int c = scanner.nextInt();

        double arithmeticMean = (a + b + c) / 3;
        System.out.print("Arithmetic Mean = " + arithmeticMean);
    }
}

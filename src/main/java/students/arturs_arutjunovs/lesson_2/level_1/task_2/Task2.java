package students.arturs_arutjunovs.lesson_2.level_1.task_2;

class Task2 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter first fractional number: ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Please enter second fractional number: ");
        double secondDoubleNumber = scanner.nextDouble();


        double sum = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double mul = firstDoubleNumber * secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Result of sum = " + sum);
        System.out.println("Result of subtraction = " + sub);
        System.out.println("Result of multiplying = " + mul);
        System.out.println("Result of division = " + div);
    }
}

package students.ernests_subhankulovs.lesson_2.level_1.task_2;

public class Task2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter 1st fractional number (A):");
        double firstDoubleNumber  = scanner.nextDouble();
        System.out.println("Enter 2nd fractional number (B):");
        double secondDoubleNumber = scanner.nextDouble();

        double add = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double mul = firstDoubleNumber * secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Addition: A + B = " + add);
        System.out.println("Addition: A + B = " + add);
    }
}

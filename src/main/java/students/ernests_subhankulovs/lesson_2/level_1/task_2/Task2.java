package students.ernests_subhankulovs.lesson_2.level_1.task_2;

class Task2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter 1st fractional number (A):");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Enter 2nd fractional number (B):");
        double secondNumber = scanner.nextDouble();

        double add = firstDoubleNumber + secondNumber;
        double sub = firstDoubleNumber - secondNumber;
        double mul = firstDoubleNumber * secondNumber;
        double div = firstDoubleNumber / secondNumber;

        System.out.println("Addition: A + B = " + add);
        System.out.println("Subtraction: A - B = " + sub);
        System.out.println("Multiplication: A * B = " + mul);
        System.out.println("Division: A / B = " + div);
    }
}

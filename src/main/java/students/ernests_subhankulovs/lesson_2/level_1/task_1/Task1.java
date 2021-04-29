package students.ernests_subhankulovs.lesson_2.level_1.task_1;

class Task1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter 1st number (A):");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter 2nd number (B5):");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;

        System.out.println("Addition: A + B = " + sum);
        System.out.println("Subtraction: A - B = " + sub);
        System.out.println("Multiplication: A * B = " + mul);
        System.out.println("Division: A / B = " + div);
    }
}

package students.arturs_arutjunovs.lesson_2.level_1.task_1;

class Task1 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();



        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;

        System.out.println("Sum of " + firstNumber + " and " + secondNumber + " = " + sum);
        System.out.println("Subtracting " + firstNumber + " from " + secondNumber + " = " + sub);
        System.out.println("Multiply of " + firstNumber + " and " + secondNumber + " = " + mul);
        System.out.println("Division " + firstNumber + " by " + secondNumber + " = " + div);


    }
}

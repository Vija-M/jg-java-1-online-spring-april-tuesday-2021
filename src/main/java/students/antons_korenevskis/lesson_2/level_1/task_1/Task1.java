package students.antons_korenevskis.lesson_2.level_1.task_1;

class Task1 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введи число а");
        int firstNumber = scanner.nextInt();
        System.out.println("Введи число b");
        int secondNumber = scanner.nextInt();

        System.out.println("a + b = " + (firstNumber + secondNumber));
        System.out.println("a - b = " + (firstNumber - secondNumber));
        System.out.println("a / b = " + firstNumber / secondNumber);
        System.out.println("a * b = " + firstNumber * secondNumber);

    }
}

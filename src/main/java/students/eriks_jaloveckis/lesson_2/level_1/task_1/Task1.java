package students.eriks_jaloveckis.lesson_2.level_1.task_1;

   class Task1 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int addition = a + b ;
        int subtraction = a - b;
        int division = a / b;
        int multiplication = a * b;

        System.out.println("Сложение: " + addition);
        System.out.println("Вычитания: " + subtraction);
        System.out.println("Умножения: " + multiplication);
        System.out.println("Деления: " + division);
    }
}

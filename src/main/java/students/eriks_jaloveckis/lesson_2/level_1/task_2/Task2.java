package students.eriks_jaloveckis.lesson_2.level_1.task_2;

class Task2 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введите первое вещественное число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе вещественное число: ");
        double b = scanner.nextDouble();

        double addition = a + b ;
        double subtraction = a - b;
        double division = a / b;
        double multiplication = a * b;

        System.out.println("Сложение: " + addition);
        System.out.println("Вычитания: " + subtraction);
        System.out.println("Умножения: " + multiplication);
        System.out.println("Деления: " + division);
    }
}


package students.olga_t.lesson_2.level_1.task_1;

class MyTask1Calculator {


    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите первую цифру:");
        int a = scanner.nextInt();
        System.out.println("Введите вторую цифру:");
        int b = scanner.nextInt();

        System.out.println("Вы ввели цифры " + a + " и " + b +" . Результат вычислений смотрите ниже:"  );
        int sum = a + b;
        System.out.println("Сумма = " + sum);

        int sub = a - b;
        System.out.println("Разность = " + sub);

        int mul = a * b;
        System.out.println("Произведение = " + mul);

        double div = (double) a / b;
        System.out.println("Деление = " + div);
    }
}
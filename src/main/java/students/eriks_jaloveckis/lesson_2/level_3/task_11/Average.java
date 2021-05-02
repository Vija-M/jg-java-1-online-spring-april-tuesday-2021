package students.eriks_jaloveckis.lesson_2.level_3.task_11;

import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        System.out.println("Находим средне арифметическое число!");
        System.out.println("Решения: (" + a + " + " + b + " + " + c + ") / 3;" );
        double result = ((double) a + (double) b + (double) c) / 3;
        System.out.println("Ответ: " + result  );
    }
}

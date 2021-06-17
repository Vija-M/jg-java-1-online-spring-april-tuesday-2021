package students.olga_t.lesson_4.level_2.tasks_4_6;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе целое число:");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Числа равны.");
        } else {
            System.out.println("Числа не равны.");
        }
    }
}

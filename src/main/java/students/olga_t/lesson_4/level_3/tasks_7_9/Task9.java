package students.olga_t.lesson_4.level_3.tasks_7_9;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе целое число:");
        int number2 = scanner.nextInt();

        System.out.println("Введите третье целое число:");
        int number3 = scanner.nextInt();

        if (number3 > number2 && number3 > number1) {
            System.out.println("Число " + number3 + " самое большое.");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Число " + number2 + " самое большое.");
        } else {
            System.out.println("Число " + number1 + " самое большое.");
        }
    }
}

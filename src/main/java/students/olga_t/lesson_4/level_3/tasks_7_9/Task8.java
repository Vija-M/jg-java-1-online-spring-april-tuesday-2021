package students.olga_t.lesson_4.level_3.tasks_7_9;

import java.util.Scanner;

class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе целое число:");
        int number2 = scanner.nextInt();

        System.out.println("Введите третье целое число:");
        int number3 = scanner.nextInt();

        if (number3 > number2 && number2 > number1) {
            System.out.println("Эти числа в порядке возрастания.");
        } else if (number3 < number2 && number2 < number1) {
            System.out.println("Числа в порядке убывания.");
        } else {
            System.out.println("Все остальные случаи.");
        }
    }
}

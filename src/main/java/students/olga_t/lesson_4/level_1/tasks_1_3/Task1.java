package students.olga_t.lesson_4.level_1.tasks_1_3;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Вы ввели положительное число.");
        } else if (number == 0) {
            System.out.println("Вы ввели ноль.");
        } else {
            System.out.println("Вы ввели отрицательное число.");
        }
    }

}


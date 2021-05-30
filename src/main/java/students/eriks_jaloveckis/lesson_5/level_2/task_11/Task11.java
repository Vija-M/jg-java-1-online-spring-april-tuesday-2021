package students.eriks_jaloveckis.lesson_5.level_2.task_11;

import java.util.Arrays;
import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        int[] numbers = new int[3];
        numbers[0] = a;
        numbers[1] = b;
        numbers[2] = c;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}

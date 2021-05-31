package students.eriks_jaloveckis.lesson_5.level_4_task_25;

import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину масива: ");
        int x = scanner.nextInt();
        int[] numbers = new int[x];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите элементы массива: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

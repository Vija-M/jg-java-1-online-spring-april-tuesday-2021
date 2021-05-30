package students.eriks_jaloveckis.lesson_5.level_4_task_25;

import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int x = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = x; x <= numbers.length; x++) {
            System.out.println(numbers[x]);
        }
    }

}

package students.arturs_arutjunovs.lesson_5.level_4.task_25;

import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any array`s size: ");
        int sizeArrayInput = scanner.nextInt();
        int[] array = new int[sizeArrayInput];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter array " + i + " value: ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Array values is: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

package students.ernests_subhankulovs.lesson_5.level_4.task_25;

import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {
        int arrayLength;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Step " + (i + 1) + "/" + array.length + " - Enter an integer value:");
            array[i] = scanner.nextInt();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println("i = " + i  + "; array[i] = " + array[i]);
        }
    }
}

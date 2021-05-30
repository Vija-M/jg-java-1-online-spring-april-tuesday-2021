package students.ernests_subhankulovs.lesson_5.level_2.task_11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int[] integerNumbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < integerNumbers.length; i++) {
            System.out.println("Step " + (i + 1) + "/3 - Enter an integer number:");
            integerNumbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < integerNumbers.length; i++) {
            System.out.println("Number #" + i + ": " + integerNumbers[i]);
        }
    }
}

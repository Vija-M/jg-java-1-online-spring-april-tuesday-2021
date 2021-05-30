package students.ernests_subhankulovs.lesson_5.level_2.task_15;

import java.util.Random;

class Task15 {
    public static void main(String[] args) {
        int[] integerNumbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < integerNumbers.length; i++) {
            integerNumbers[i] = random.nextInt(100);
            System.out.println("i = " + i + "; integerNumbers[i] = " + integerNumbers[i]);
        }

        System.out.println();
        System.out.println("Now, all array elements are multiplied by 2: ");
        System.out.println();

        for (int i = 0; i < integerNumbers.length; i++) {
            integerNumbers[i] *= 2;
            System.out.println("i = " + i + "; integerNumbers[i] = " + integerNumbers[i]);
        }
    }
}


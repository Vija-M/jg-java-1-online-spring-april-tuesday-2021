package students.ernests_subhankulovs.lesson_5.level_2.task_14;

import java.util.Random;

class Task14 {
    public static void main(String[] args) {
        int[] integerNumbers = new int[3];
        Random random = new Random();
        int sumOfAllArrayElements = 0;

        for (int i = 0; i < integerNumbers.length; i++) {
            integerNumbers[i] = random.nextInt(100);
            System.out.println("i = " + i + "; integerNumbers[i] = " + integerNumbers[i]);
            sumOfAllArrayElements += integerNumbers[i];
        }

        System.out.println();
        System.out.println("Sum of all array elements = " + sumOfAllArrayElements);
        System.out.println("Average array element value = " + (sumOfAllArrayElements / integerNumbers.length));
    }
}

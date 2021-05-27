package students.vija_m.lesson_5.level_2.task_14;

import java.util.Random;

class ArrayRandomAverage {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();
        int sum = numbers[0] + numbers[1] + numbers[2];
        double avg = (double) sum / numbers.length;
        System.out.println("Average of numbers: " + numbers[0] + ", " + numbers[1] + " and " + numbers[2] + " is "
                + avg);
    }
}



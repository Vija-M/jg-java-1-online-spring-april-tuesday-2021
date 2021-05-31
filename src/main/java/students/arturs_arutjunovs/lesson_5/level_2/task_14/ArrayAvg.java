package students.arturs_arutjunovs.lesson_5.level_2.task_14;

import java.util.Random;

class ArrayAvg {
    public static void main(String[] args) {

        Random random = new Random();
        int[] number = new int[3];

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(50);
        }
        int sum = 0;
        for (int i : number) {
            sum += i;
        }
        double avg = (double) sum / number.length;
        System.out.println(avg);
    }
}

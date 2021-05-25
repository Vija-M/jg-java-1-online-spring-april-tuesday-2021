package instructor.lesson_5;

import java.util.Arrays;

class ArrayDemo {

    public static void main(String[] args) {

        /*int[] temperatures = new int[10];

        temperatures[0] = 20;
        temperatures[1] = 22;
        temperatures[2] = 25;
        temperatures[3] = 30;
        temperatures[4] = 29;
        temperatures[5] = 27;
        temperatures[6] = 28;
        temperatures[7] = 29;
        temperatures[8] = 31;
        temperatures[9] = 26;*/

        int[] temperatures = {20, 22, 25, 30, 29, 27, 28, 29, 31, 26};

        System.out.println("temperatures[0] = " + temperatures[0]);
        System.out.println("temperatures[1] = " + temperatures[1]);
        System.out.println("temperatures[2] = " + temperatures[2]);
        System.out.println("temperatures[3] = " + temperatures[3]);
        System.out.println("temperatures[4] = " + temperatures[4]);
        System.out.println("temperatures[5] = " + temperatures[5]);
        System.out.println("temperatures[6] = " + temperatures[6]);
        System.out.println("temperatures[7] = " + temperatures[7]);
        System.out.println("temperatures[8] = " + temperatures[8]);
        System.out.println("temperatures[9] = " + temperatures[9]);

        System.out.println("temperatures = " + Arrays.toString(temperatures));

        int sum = temperatures[0] + temperatures[1] + temperatures[2] + temperatures[3] + temperatures[4] + temperatures[5]
                + temperatures[6] + temperatures[7] + temperatures[8] + temperatures[9];

        double avg = (double) sum / temperatures.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

    }
}

package students.arturs_arutjunovs.lesson_6.level_4.task_21;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] arr = new int[5][4];
        fillRandomValues(arr);
        System.out.println("The sum of two dimensional array values is: " + sumOfArrayValues(arr));
    }

    static void fillRandomValues(int[][] arr) {
        Random random = new Random();
        System.out.println("Random filled numbers is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(50);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static int sumOfArrayValues(int[][] arr) {
        int sum = 0;
        for (int[] ints : arr) {
            for (int i : ints) {
                sum += i;
            }
        }
        return sum;
    }
}
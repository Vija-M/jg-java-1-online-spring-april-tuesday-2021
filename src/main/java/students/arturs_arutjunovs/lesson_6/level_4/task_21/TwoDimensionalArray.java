package students.arturs_arutjunovs.lesson_6.level_4.task_21;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] arr = new int[5][4];
        twoDimensionalArray.fillRandomValues(arr);
        System.out.println("The sum of two dimensional array values is: " + twoDimensionalArray.sumOfArrayValues(arr));

    }

    public void fillRandomValues(int[][] arr) {
        Random random = new Random();
        System.out.println("Random filled numbers is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[j].length; j++) {
                arr[i][j] = random.nextInt(50);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public int sumOfArrayValues(int[][] arr) {
        int sum = 0;
        for (int[] ints : arr) {
            for (int j = 0; j < arr[j].length; j++) {
                sum += ints[j];
            }
        }
        return sum;
    }
}
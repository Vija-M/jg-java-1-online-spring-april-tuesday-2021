package students.ernests_subhankulovs.lesson_6.level_4.task_21;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array's 1st dimension length:");
        int x = scanner.nextInt();
        System.out.println("Enter the array's 2nd dimension length:");
        int y = scanner.nextInt();
        int[][] array = new int[x][y];
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        twoDimensionalArray.fillArrayRandomly(array);
        System.out.println();
        System.out.println("The sum of all array values is: " + twoDimensionalArray.countAllArrayValues(array));

    }

    public void fillArrayRandomly(int[][] array) {
        Random random = new Random();
        System.out.println();
        System.out.println("The array is filled with random numbers:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(9);
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public int countAllArrayValues(int[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                counter += array[i][j];
            }
        }
        return counter;
    }
}

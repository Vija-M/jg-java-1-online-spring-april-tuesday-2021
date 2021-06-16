package students.dmitriy_shukailo.lesson_6.level_4.task_21;

import java.util.Scanner;

class TwoDimensionalArrayDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array [i] [j]: ");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int[][] array = new int[i][j];

        System.out.println();
        System.out.println("Random array [" + i + "] [" + j + "]: ");
        TwoDimensionalArray numbers = new TwoDimensionalArray();
        numbers.fillRandomly(array);

        System.out.println();
        System.out.println("Sum of all array elements is: " + numbers.sum(array));
    }

}
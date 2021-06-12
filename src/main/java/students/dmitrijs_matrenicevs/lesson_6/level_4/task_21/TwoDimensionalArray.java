package students.dmitrijs_matrenicevs.lesson_6.level_4.task_21;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {

    static void main(String[] args) {

        int[][] dimensional = new int[9][8];
        dimensionalRandom();
        System.out.println(sumArray(dimensional));
    }

    private static void dimensionalRandom() {
    }

    void randomArray(int[][] dimensional) {
        Random random = new Random();
        System.out.println("RandomArray: ");
        for (int i = 0; i < dimensional.length; i++) {
            for (int j = 0; j < dimensional.length; j++) {
                dimensional[i][j] = random.nextInt(30);
            }
            System.out.println(Arrays.toString(dimensional[i]));
        }
    }

    static int sumArray(int[][] dimensional){
        int sum = 0;
        for (int[] ints : dimensional){
            for (int i : ints){
                sum += i;

            }
        }
        return sum;
    }

}

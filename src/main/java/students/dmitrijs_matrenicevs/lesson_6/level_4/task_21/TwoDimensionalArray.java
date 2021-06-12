package students.dmitrijs_matrenicevs.lesson_6.level_4.task_21;

import java.util.Random;

class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] dimensional = new int[9][8];
        dimensionalRandom(dimensional);
        System.out.println(sumArray(dimensional));
    }


    static void randomArray (int[][] dimension){
        Random random = new Random();
        System.out.println("RandomArray: ");
        for (int i = 0; i < dimension.length; i++) {
            for (int j = 0; j < dimension.length; j++) {
                dimension[i][j] = random.nextInt(30);
            }
        }
    }

}

package students.vija_m.lesson_6.level_4.task_21;

import java.util.Random;

class FillArray {
    public void fillArray(int[][] arrays) {
        System.out.println("При помощи рандома заполним двухмерный массив:");
        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = random.nextInt(100);
                System.out.print(arrays[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

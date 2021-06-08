package students.vija_m.lesson_6.level_4.task_21;


import java.util.Random;
import java.util.Scanner;

class TwoDimensionalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите количество строк нового массива:");
        int x = scanner.nextInt();
        System.out.print("Укажите количество столбцов нового массива:");
        int y = scanner.nextInt();
        int[][] arrays = new int[x][y];
        TwoDimensionalArray array = new TwoDimensionalArray();
        array.fillArray(arrays);
        System.out.println("Сумма всех элементов массива равна: " + array.sumArrays(arrays));
    }


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


    public int sumArrays(int[][] arrays) {
        int sum = 0;
        for (int[] array : arrays) {
            for (int i : array) {
                sum += i;
            }
        }
        return sum;
    }
}






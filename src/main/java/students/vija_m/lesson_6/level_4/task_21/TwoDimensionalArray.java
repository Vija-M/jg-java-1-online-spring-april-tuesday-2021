package students.vija_m.lesson_6.level_4.task_21;


import java.util.Random;
import java.util.Scanner;

class TwoDimensionalArray {
    FillArray fillArray = new FillArray();
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






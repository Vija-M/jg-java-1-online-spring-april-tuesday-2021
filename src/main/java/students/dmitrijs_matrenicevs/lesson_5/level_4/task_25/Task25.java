package students.dmitrijs_matrenicevs.lesson_5.level_4.task_25;

import java.util.Scanner;

class Task25 {

    public static void main(String[] args) {

        int array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи длину массива: ");
        array = scanner.nextInt();
        int[] arrayMega = new int[array];

        for (int i = 0; i < arrayMega.length; i++) {
            System.out.print("Введите следующий массив: ");
            arrayMega[i] = scanner.nextInt();
        }

        System.out.println();
        for (int i = 0; i < arrayMega.length; i++){
            System.out.println((i+1) + " = " + arrayMega[i]);
        }

    }


}

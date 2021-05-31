package students.dmitrijs_matrenicevs.lesson_5.level_2.task_11;

import java.util.Scanner;

class Task11 {

    public static void main(String[] args) {

        int[] numbersPeople = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи первое число: ");
        numbersPeople[0] = scanner.nextInt();
        System.out.print("Введи второе число: ");
        numbersPeople[1] = scanner.nextInt();
        System.out.print("Введи трерье число: ");
        numbersPeople[2] = scanner.nextInt();

        System.out.println();

        System.out.println("Твоё первое число: " + numbersPeople[0]);
        System.out.println("Твоё второе число: " + numbersPeople[1]);
        System.out.println("Твоё третье число: " + numbersPeople[2]);


    }
}


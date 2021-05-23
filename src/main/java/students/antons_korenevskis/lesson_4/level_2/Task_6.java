package students.antons_korenevskis.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {

        System.out.println("Введи первое число");
        Scanner scannerOne = new Scanner(System.in);
        int a = scannerOne.nextInt();

        System.out.println("Введи второе число");
        Scanner scannerTwo = new Scanner(System.in);
        int b = scannerTwo.nextInt();

        boolean equal = a == b;
        boolean bigger = a > b;

        if (equal) {
            System.out.println("Numbers are equals");
        } else if (bigger) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are different");
        }
    }
}

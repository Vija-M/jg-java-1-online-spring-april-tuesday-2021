package students.antons_korenevskis.lesson_4.level_3;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        System.out.println("Введи первое число");
        Scanner scannerOne = new Scanner(System.in);
        int a = scannerOne.nextInt();

        System.out.println("Введи второе число");
        Scanner scannerTwo = new Scanner(System.in);
        int b = scannerTwo.nextInt();

        System.out.println("Введи третье число");
        Scanner scannerThree = new Scanner(System.in);
        int c = scannerThree.nextInt();

        boolean incr = (a < b)&&(b < c);
        boolean decr = (a > b)&&(b > c);

        if (incr) {
            System.out.println("increasing");
        } else if (decr) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }
    }
}
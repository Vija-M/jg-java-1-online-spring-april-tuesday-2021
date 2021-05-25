package students.antons_korenevskis.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {

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

        boolean bigA = (a >= b)&&(a >= c);
        boolean bigB = (b >= a)&&(b >= c);

        if (bigA) {
            System.out.println(a);
        } else if (bigB) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

// 1 2 3
// 1 3 2
// 3 2 1
// 1 1 1
// 1 2 2


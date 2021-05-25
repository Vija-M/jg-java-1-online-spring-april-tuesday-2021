package students.antons_korenevskis.lesson_4.level_3;

import java.util.Scanner;

public class Task_7 {

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

        boolean equal = (a == b)&&(a == c);
        boolean different = (a != b) && (a != c) && (b != c);

        if (equal) {
            System.out.println("Numbers are equal");
        } else if (different ) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}

package students.antons_korenevskis.lesson_4.level_2;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        System.out.println("Введи первое число");
        Scanner scannerOne = new Scanner(System.in);
        int a = scannerOne.nextInt();

        System.out.println("Введи второе число");
        Scanner scannerTwo = new Scanner(System.in);
        int b = scannerTwo.nextInt();

         if (a > b) {
             System.out.println(b);
        } else if (a < b) {
             System.out.println(a);
        } else {
             System.out.println(a);
        }
    }
}
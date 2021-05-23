package students.antons_korenevskis.lesson_4.level_2;

import java.util.Scanner;

class Task_4 {

    public static void main(String[] args) {

        System.out.println("Введи первое число");
        Scanner scannerOne = new Scanner(System.in);
        int a = scannerOne.nextInt();

        System.out.println("Введи второе число");
        Scanner scannerTwo = new Scanner(System.in);
        int b = scannerTwo.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}

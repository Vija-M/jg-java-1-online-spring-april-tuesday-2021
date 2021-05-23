package students.antons_korenevskis.lesson_4;

import java.util.Scanner;

class Task_3 {

    public static void main(String[] args) {

        System.out.println("Введи число");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a%2;

        boolean even = b == 0;
        boolean odd = b == 1;

        if (even) {
            System.out.println("Число четное");
        } else if (odd) {
            System.out.println("Число нечетное");
        } else {
            System.out.println("Что-то пошло не так");
        }

    }
}

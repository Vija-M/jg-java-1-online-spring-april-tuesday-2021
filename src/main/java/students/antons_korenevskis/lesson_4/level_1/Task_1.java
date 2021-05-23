package students.antons_korenevskis.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {

        int a = 0;
        System.out.println("Введи число");

        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        boolean equal = a == b;
        boolean greaterThan = a > b;

        if (equal) {
            System.out.println("Число равно 0");
        } else if (greaterThan) {
            System.out.println("Это отрицательное число");
        } else {
            System.out.println("Это положительное число");
        }

    }
}
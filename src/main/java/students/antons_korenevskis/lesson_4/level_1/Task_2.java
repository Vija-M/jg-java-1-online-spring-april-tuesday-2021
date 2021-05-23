package students.antons_korenevskis.lesson_4.level_1;

import java.util.Scanner;

class Task_2 {

    public static void main(String[] args) {

        System.out.println("Введи число от 1 до 7");

        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        boolean monday = b == 1;
        boolean tuesday = b == 2;
        boolean wednesday = b == 3;
        boolean thursday = b == 4;
        boolean friday = b == 5;
        boolean saturday = b == 6;
        boolean sunday = b == 7;

        if (monday) {
            System.out.println("Monday");
        } else if (tuesday) {
            System.out.println("Tuesday");
        } else if (wednesday) {
            System.out.println("Wednesday");
        } else if (thursday) {
            System.out.println("Thursday");
        } else if (friday) {
            System.out.println("Friday");
        } else if (saturday) {
            System.out.println("Saturday");
        } else if (sunday) {
            System.out.println("Sunday");
        } else {
            System.out.println("Похоже, это не число от 1 до 7");
        }

    }

}

package students.dmitriy_shukailo.lesson_9.level_1.task_5;

import java.util.Scanner;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe("1111", 1000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to do?");
        System.out.println(" - If you want see balance: enter 0");
        System.out.println(" - If you want get money:   enter 1");
        System.out.println(" - If you want put money:   enter 2");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Your balance is " + safe.getAmountMoney());
        } else if (number == 1) {
            System.out.print("Enter password and amount money to get: ");
            String pin = scanner.next();
            double money = scanner.nextInt();
            safe.receiveMoney(pin, money);
        } else if (number == 2) {
            System.out.println("Enter password and amount money to put:");
            String pin = scanner.next();
            double money = scanner.nextInt();
            safe.putMoney(pin, money);
        } else {
            System.out.println("You enter incorrect number!");
        }
    }

}
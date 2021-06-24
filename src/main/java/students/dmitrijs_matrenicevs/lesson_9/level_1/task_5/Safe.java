package students.dmitrijs_matrenicevs.lesson_9.level_1.task_5;

import java.util.Scanner;

class Safe {

    public int money;
    public String password;

    public Safe(int money, String password) {
        this.money = money;
        this.password = password;
    }

    public boolean getMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи пароль, чтобы получить свой кэш из сейфа: "/*222*/);
        return scanner.nextLine().equalsIgnoreCase("222");
    }

    public boolean putMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи пароль, чтобы положить свой кэш в сейф: "/*222*/);
        return scanner.nextLine().equalsIgnoreCase("222");
    }

}

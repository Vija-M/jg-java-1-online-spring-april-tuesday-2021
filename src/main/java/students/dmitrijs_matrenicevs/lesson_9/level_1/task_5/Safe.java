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
        System.out.print("Введите пароль, чтобы забрать деньги из сейфа: ");
        int getMoney = scanner.nextInt();

        while (getMoney != 222) {
            System.out.println("Попробуйте снова!");
            getMoney = scanner.nextInt();
        }
        System.out.println("Поздравляю, теперь все деньги твои!");
        return false;
    }

    public boolean putMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите пароль, чтобы положить деньги в сейф: ");
        int putMoney = scanner.nextInt();

        while (putMoney != 222) {
            System.out.println("Попробуйте снова!");
            putMoney = scanner.nextInt();
        }
        System.out.println("Поздравляю, теперь все деньги в сейфе!");
        return false;
    }
}

//Обьясните пожалуйста, как убрать false, чтобы оно не отображалось на выходе.
//И как сделать так, чтобы когда я ввожу неправильный пароль он мне писал по новой: Введите пароль, чтобы..
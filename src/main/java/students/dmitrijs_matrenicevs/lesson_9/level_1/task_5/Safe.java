package students.dmitrijs_matrenicevs.lesson_9.level_1.task_5;

import java.util.Scanner;

class Safe {

    private double money;
    private final String password;

    public Safe(double money, String password) {
        this.money = money;
        this.password = password;
    }

    public double getMoney (){
        return money;
    }

    public void retMoney(double money, String password){
        if (this.password.equals(password)) {
            this.money -= money;
        }
        else {
            System.out.println("Введи пароль!");
        }
    }

    public void putMoney(double money, String password) {
        if (this.password.equals(password)) {
            this.money += money;
        } else {
            System.out.println("Введи пароль!");
        }
    }
}
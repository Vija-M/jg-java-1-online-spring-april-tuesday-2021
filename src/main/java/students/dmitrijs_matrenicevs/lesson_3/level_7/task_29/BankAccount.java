package students.dmitrijs_matrenicevs.lesson_3.level_7.task_29;

public class BankAccount {


    String owner;
    int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    String getMoney() {
        return String.valueOf(this.money);
    }

}

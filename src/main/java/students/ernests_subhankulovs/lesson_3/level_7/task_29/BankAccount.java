package students.ernests_subhankulovs.lesson_3.level_7.task_29;

public class BankAccount {
    String owner;
    double money;

    BankAccount(String owner, double moneyAmount) {
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

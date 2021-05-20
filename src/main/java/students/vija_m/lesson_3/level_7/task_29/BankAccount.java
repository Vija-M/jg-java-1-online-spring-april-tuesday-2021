package students.vija_m.lesson_3.level_7.task_29;

class BankAccount {
    String owner;
    int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    String getMoney() {

        return String.valueOf(this.money);
    }

}


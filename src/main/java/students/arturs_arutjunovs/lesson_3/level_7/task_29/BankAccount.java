package students.arturs_arutjunovs.lesson_3.level_7.task_29;

class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return owner;
    }

    String getMoney() {
        return String.valueOf(money);
    }
}


class BankAccountDemo{
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}
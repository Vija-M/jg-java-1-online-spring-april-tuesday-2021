package students.jevgenij_leshkevich.lesson_3.level_4.task_16;

class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName, // добавил ,
                int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount; // money->moneyAmount
    }

    String getOwnerFirstName() { // (->()
        return this.ownerFirstName; // добавил ;
    }

    String getOwnerLastName() { // )->()
        return this.ownerLastName; // this.ownerFirstName->this.ownerLastName и добавил ;
    }

    int getMoneyAmount() { // void->String
        return this.moneyAmount;
    }

}

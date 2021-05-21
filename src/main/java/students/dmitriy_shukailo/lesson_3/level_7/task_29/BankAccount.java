package students.dmitriy_shukailo.lesson_3.level_7.task_29;

class BankAccount {

    String owner;
    int money;

    BankAccount(String ownerFirstName, int moneyAmount){
        this.owner = ownerFirstName;
        this.money = moneyAmount;
    }

    String getOwner(){
        return this.owner;
    }

    String getMoney(){
        return String.valueOf(this.money);
    }

}
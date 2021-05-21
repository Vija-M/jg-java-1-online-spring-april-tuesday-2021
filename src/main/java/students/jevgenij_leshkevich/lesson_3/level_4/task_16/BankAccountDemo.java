package students.jevgenij_leshkevich.lesson_3.level_4.task_16;

class BankAccountDemo {


    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName(); // ownerFirstName->ownerLastName
        int moneyAmount = bankAccount.getMoneyAmount(); // String->int
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }


}

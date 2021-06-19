package students.eriks_jaloveckis.lesson_7.level_6.task_8;

class CreditCard {
    private int numberOfCard;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double debt;

    public CreditCard(int numberOfCard, int pinCode) {
        this.numberOfCard = numberOfCard;
        this.pinCode = pinCode;
        balance = 0;
        debt = 0;
    }

    public double getBalance() {
        return balance;
    }

    public double getDebt() {
        return debt;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void deposit(int enterPinCode, double moneyToDeposit) {
        if (enterPinCode == pinCode) {
            if (debt == 0) {
                balance += moneyToDeposit;
            } else if (debt < moneyToDeposit) {
                balance += moneyToDeposit - debt;
                debt = 0;
            } else {
                debt -= moneyToDeposit;
            }
        } else {
            System.out.println("Wrong PIN CODE!");
        }
    }

    public void withdraw(int enterPinCode, double moneyToWithdraw) {
        if (enterPinCode == pinCode) {
            if (moneyToWithdraw < balance) {
                balance -= moneyToWithdraw;
            } else if (moneyToWithdraw < (balance + creditLimit - debt)) {
                debt += moneyToWithdraw - balance;
                balance = 0;
            } else {
                System.out.println("Wrong PIN CODE!");
            }
        }


    }
}


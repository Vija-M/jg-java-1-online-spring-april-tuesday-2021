package students.vija_m.lesson_7.level_6.task_8;

class CreditCard {

    private int cardNumber;
    private int cardPin;
    private double balance;
    private double creditLimit;
    private double cardDebt;

    public CreditCard(int cardNumber, int cardPin) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
    }

    double getBalance() {
        return balance;
    }

    double getCardDebt() {
        return cardDebt;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    void deposit(int eneteredPin, double depositAmount) {
        if (eneteredPin != cardPin) {
            System.out.println("You entered wrong PIN code, please try again.");
        } else {
            if (cardDebt == 0.00) {
                balance += depositAmount;
            } else if (cardDebt >= depositAmount) {
                cardDebt -= depositAmount;
            } else {
                balance += depositAmount - cardDebt;
                cardDebt = 0;
            }
        }
    }

    void withdraw(int eneteredPin, double withdrawAmount) {
        if (eneteredPin != cardPin) {
            System.out.println("You entered wrong PIN code, please try again.");
        } else {
            if (balance >= withdrawAmount) {
                balance -= withdrawAmount;
            } else {
                if (balance + creditLimit >= withdrawAmount + cardDebt) {
                    cardDebt += withdrawAmount - balance;
                    balance = 0;
                } else {
                    System.out.println("You card credit limit is not enough large, please try another sum.");
                }
            }
        }
    }
}


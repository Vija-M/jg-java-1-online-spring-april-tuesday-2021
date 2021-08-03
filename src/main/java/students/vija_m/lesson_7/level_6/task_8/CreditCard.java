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
        cardDebt = 100.00;
    }

    double getBalance() {
        return balance;
    }

    public double getCardDebt() {
        return cardDebt;
    }

    void deposit(int eneteredPin, double depositAmount) {
        if (eneteredPin != cardPin) {
            System.out.println("Wrong PIN code!");
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
            System.out.println("Wrong PIN code!");
        } else {
            if (cardDebt == 0.00) {
                balance += withdrawAmount;
            } else if (cardDebt >= withdrawAmount) {
                cardDebt -= withdrawAmount;
            } else {
                balance += withdrawAmount - cardDebt;
                cardDebt = 0;
            }
        }
    }

            /*
        balance++
    }

    ;

    void withdraw() {
        balance--
    }*/


}


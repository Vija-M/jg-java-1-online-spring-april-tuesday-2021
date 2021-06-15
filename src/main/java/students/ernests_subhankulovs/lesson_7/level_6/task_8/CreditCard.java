package students.ernests_subhankulovs.lesson_7.level_6.task_8;

class CreditCard {

    private String cardNumber;
    private String cardPinCode;
    private double cardBalance;
    private double cardCreditLimit;
    private double cardDebt;

    public CreditCard(String cardNumber, String cardPinCode) {
        this.cardNumber = cardNumber;
        this.cardPinCode = cardPinCode;
        cardBalance = 0;
        cardDebt = 0;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public double getCardDebt() {
        return cardDebt;
    }

    public void setCardCreditLimit(double cardCreditLimit) {
        this.cardCreditLimit = cardCreditLimit;
    }

    public void deposit(String enteredPinCode, double incomingAmount) {
        if (enteredPinCode.equals(cardPinCode)) {
            if (cardDebt == 0) {
                cardBalance += incomingAmount;
            }
            else if (cardDebt < incomingAmount) {
                cardBalance += incomingAmount - cardDebt;
                cardDebt = 0;
            }
            else {
                cardDebt -= incomingAmount;
            }
        }
        else {
            System.out.println("Wrong PIN code!");
            System.out.println("Deposit denied!");
        }
    }

    public void withdraw(String enteredPinCode, double deductibleAmount) {
        if (enteredPinCode.equals(cardPinCode)) {
            if (deductibleAmount < cardBalance) {
                cardBalance -= deductibleAmount;
            }
            else if (deductibleAmount < (cardBalance + cardCreditLimit - cardDebt)) {
                cardDebt += deductibleAmount - cardBalance;
                cardBalance = 0;
            }
            else {
                System.out.println("Withdraw denied!");
                System.out.println("Cannot exceed credit limit!");
            }
        }
        else {
            System.out.println("Wrong PIN code!");
            System.out.println("Withdraw denied!");
        }
    }


}

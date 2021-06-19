package students.eriks_jaloveckis.lesson_7.level_6.task_8;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.depositAfterWithdraw();
        creditCardTest.withdrawAfterDeposit();
        creditCardTest.wrongPinCodeDepositWithdraw();
        creditCardTest.limitCheck();
    }

    public void assertTest(double expected, double realResult, String text) {
        if (expected == realResult) {
            System.out.println(text + " - TEST OK!");
        } else {
            System.out.println(text + " - FAIL!");
        }
    }

    public void depositAfterWithdraw() {
        CreditCard creditCard1 = new CreditCard(567321, 12344321);
        creditCard1.setCreditLimit(400);
        creditCard1.deposit(12344321, 50);
        assertTest(50, creditCard1.getBalance(), "1) Balance was 0, deposit 50 - balance is 50!");
        creditCard1.withdraw(12344321, 60);
        assertTest(0, creditCard1.getBalance(), "1) Balance was 50, withdraw 60 - balance 0");
        assertTest(10, creditCard1.getDebt(), "1) Balance was 50, withdraw 60 - debt is 10");
        creditCard1.deposit(12344321, 70);
        assertTest(60, creditCard1.getBalance(), "1) Debt was 10, deposit 70 - balance 60 ");

    }

    public void withdrawAfterDeposit() {
        CreditCard creditCard1 = new CreditCard(567321, 12344321);
        creditCard1.setCreditLimit(400);
        creditCard1.withdraw(12344321, 50);
        assertTest(0, creditCard1.getBalance(), "2) Balance was 0, withdraw - 50 - balance 0");
        assertTest(50, creditCard1.getDebt(), "2) Balance was 0, withdraw - 50 - debt 50");
        creditCard1.deposit(12344321, 60);
        assertTest(10, creditCard1.getBalance(), "2) After debt 50, deposit 60 -  balance 10");
        assertTest(0, creditCard1.getDebt(), "2) After debt 50, deposit 60 - debt - 0 ");
    }

    public void wrongPinCodeDepositWithdraw() {
        CreditCard creditCard1 = new CreditCard(567321, 12344321);
        creditCard1.deposit(11234321, 50);
        assertTest(0, creditCard1.getBalance(), "3) Wrong pin Code - deposit");
        creditCard1.withdraw(12311455, 50);
        assertTest(0, creditCard1.getDebt(), "3) Wrong pin Code - withdraw");
    }

    public void limitCheck() {
        CreditCard creditCard1 = new CreditCard(321312312, 123);
        creditCard1.setCreditLimit(400);
        creditCard1.withdraw(123, 401);
        assertTest(0, creditCard1.getDebt(), "4) Limit is 400, withdraw 401 - debt 0");
    }
}

package students.ernests_subhankulovs.lesson_7.level_6.task_8;

class CreditCardTest {


    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.newCardTest();
        test.wrongPinCodeTest();
        test.depositTest();
        test.withdrawTest();
        test.exceedingCreditLimitTest();
        test.withdrawAfterDepositTest();
        test.withdrawAfterDepositWithDebtTest();
        test.depositAfterWithdrawTest();
        test.depositCoveringDebtTest();
    }


    void newCardTest() {
        CreditCard creditCard = new CreditCard("1234-5678-9101-1121", "1234");
        creditCard.setCardCreditLimit(2000);
        assertTestResult(0, creditCard.getCardBalance(), "Initial balance test");
        assertTestResult(0, creditCard.getCardDebt(), "Initial debt test");
    }

    void wrongPinCodeTest() {
        CreditCard creditCard = new CreditCard("1234-5678-9101-1121", "1234");
        creditCard.setCardCreditLimit(2000);
        creditCard.deposit("1235", 1);
        assertTestResult(0, creditCard.getCardBalance(), "Deposit with wrong PIN code test");
        creditCard.withdraw("1235", 1);
        assertTestResult(0, creditCard.getCardBalance(), "Withdraw with wrong PIN code test");
    }

    void depositTest() {
        CreditCard creditCard = new CreditCard("1234-5678-9101-1121", "1234");
        creditCard.setCardCreditLimit(2000);
        creditCard.deposit("1234", 500);
        assertTestResult(500, creditCard.getCardBalance(), "Balance after first deposit test");
        assertTestResult(0, creditCard.getCardDebt(), "Debt after first deposit test");
    }

    void withdrawTest() {
        CreditCard creditCard = new CreditCard("1234-5678-9101-1121", "1234");
        creditCard.setCardCreditLimit(2000);
        creditCard.withdraw("1234", 500);
        assertTestResult(0, creditCard.getCardBalance(), "Withdraw with zero balance test");
        assertTestResult(500, creditCard.getCardDebt(), "Debt with zero balance test");
    }

    void exceedingCreditLimitTest() {
        CreditCard creditCard = new CreditCard("1234-5678-9101-1121", "1234");
        creditCard.setCardCreditLimit(2000);
        creditCard.withdraw("1234", 2001);
        assertTestResult(0, creditCard.getCardBalance(), "Exceeding credit limit test (balance)");
        assertTestResult(0, creditCard.getCardDebt(), "Exceeding credit limit test (debt)");
    }

    void withdrawAfterDepositTest() {
        CreditCard creditCard = new CreditCard("1234-5678-9101-1121", "1234");
        creditCard.setCardCreditLimit(2000);
        creditCard.deposit("1234", 500);
        creditCard.withdraw("1234", 100);
        assertTestResult(400, creditCard.getCardBalance(), "Withdraw after deposit test (balance)");
        assertTestResult(0, creditCard.getCardDebt(), "Withdraw after deposit test (debt)");
    }

    void withdrawAfterDepositWithDebtTest() {
        CreditCard creditCard = new CreditCard("1234-5678-9101-1121", "1234");
        creditCard.setCardCreditLimit(2000);
        creditCard.deposit("1234", 400);
        creditCard.withdraw("1234", 500);
        assertTestResult(0, creditCard.getCardBalance(), "Withdraw after deposit using credit limit test (balance)");
        assertTestResult(100, creditCard.getCardDebt(), "Withdraw after deposit using credit limit test (debt)");
    }

    void depositAfterWithdrawTest() {
        CreditCard creditCard = new CreditCard("1234-5678-9101-1121", "1234");
        creditCard.setCardCreditLimit(2000);
        creditCard.withdraw("1234", 500);
        creditCard.deposit("1234", 400);
        assertTestResult(0, creditCard.getCardBalance(), "Deposit after withdraw using credit limit test (balance)");
        assertTestResult(100, creditCard.getCardDebt(), "Deposit after withdraw using credit limit test (debt)");
    }

    void depositCoveringDebtTest() {
        CreditCard creditCard = new CreditCard("1234-5678-9101-1121", "1234");
        creditCard.setCardCreditLimit(2000);
        creditCard.withdraw("1234", 50);
        creditCard.deposit("1234", 200);
        assertTestResult(150, creditCard.getCardBalance(), "Deposit covering debt test (balance)");
        assertTestResult(0, creditCard.getCardDebt(), "Deposit covering debt test (debt)");
    }

    private void assertTestResult(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Expected value: " + expectedResult + "; Actual value: " + realResult + ".");
        }
    }

}

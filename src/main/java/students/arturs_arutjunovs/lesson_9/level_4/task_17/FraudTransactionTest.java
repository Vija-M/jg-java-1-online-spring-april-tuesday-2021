package students.arturs_arutjunovs.lesson_9.level_4.task_17;

class FraudTransactionTest {

    FraudDetector fraudDetector = new FraudDetector();

    public static void main(String[] args) {

        FraudTransactionTest test = new FraudTransactionTest();
        test.rule_1Failed();
        test.rule_1Passed();

    }

    public void rule_1Failed() {
        Trader trader = new Trader("Pokemon", "Bogota");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.isFraud(transaction), true, "RuleOneTest - fraud transaction");
    }

    public void rule_1Passed() {
        Trader trader = new Trader("Pikachu", "Karachi");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.isFraud(transaction), false, "RuleOneTest - clear transaction");
    }

    private void assertTestFraud(boolean actualResult, boolean expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}

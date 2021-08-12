package students.arturs_arutjunovs.lesson_9.level_4.task_19;

class FraudTransactionTest {

    FraudDetector fraudDetector = new FraudDetector();

    public static void main(String[] args) {

        FraudTransactionTest test = new FraudTransactionTest();
        test.rule_1Failed();
        test.rule_1Passed();
        test.rule_2Failed();
        test.rule_2Passed();
        test.rule_3Failed();
        test.rule_3Passed();
    }

    public void rule_1Failed() {
        Trader trader = new Trader("Pokemon", "Bogota");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.rejectPerson(transaction), true, "RuleOneTest - fraud transaction");
    }

    public void rule_1Passed() {
        Trader trader = new Trader("Pikachu", "Karachi");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.rejectPerson(transaction), false, "RuleOneTest - clear transaction");
    }

    public void rule_2Failed() {
        Trader trader = new Trader("James", "Dublin");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTestFraud(fraudDetector.rejectAmount(transaction), true, "RuleTwoTest - fraud transaction");
    }

    public void rule_2Passed() {
        Trader trader = new Trader("Willie", "Dublin");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestFraud(fraudDetector.rejectAmount(transaction), false, "RuleTwoTest - clear transaction");
    }

    public void rule_3Failed() {
        Trader trader = new Trader("John", "Sydney");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.rejectCity(transaction), true, "RuleThreeTest - fraud transaction");
    }

    public void rule_3Passed() {
        Trader trader = new Trader("Boris", "Odessa");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.rejectCity(transaction), false, "RuleThreeTest - clear transaction");
    }

    private void assertTestFraud(boolean actualResult, boolean expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}

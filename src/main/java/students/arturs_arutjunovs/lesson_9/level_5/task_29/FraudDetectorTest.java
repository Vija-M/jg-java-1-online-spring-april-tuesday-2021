package students.arturs_arutjunovs.lesson_9.level_5.task_29;

class FraudDetectorTest {
    public static void main(String[] args) {

        FraudRule[] fraudRules = new FraudRule[5];
        fraudRules[0] = new FraudRule1();
        fraudRules[1] = new FraudRule2();
        fraudRules[2] = new FraudRule3();
        fraudRules[3] = new FraudRule4();
        fraudRules[4] = new FraudRule5();

        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        FraudDetectorTest test = new FraudDetectorTest();
        test.rule_1Failed(fraudDetector);
        test.rule_1Passed(fraudDetector);
        test.rule_2Failed(fraudDetector);
        test.rule_2Passed(fraudDetector);
        test.rule_3Failed(fraudDetector);
        test.rule_3Passed(fraudDetector);
        test.rule_4Failed(fraudDetector);
        test.rule_4Passed(fraudDetector);
        test.rule_5Failed(fraudDetector);
        test.rule_5Passed(fraudDetector);
    }

    public void rule_1Failed(FraudDetector fraudDetector) {
        Trader trader = new Trader("Pokemon", "Bogota", "Colombia");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.isFraud(transaction), true, "RuleOneTest - fraud transaction");
    }

    public void rule_1Passed(FraudDetector fraudDetector) {
        Trader trader = new Trader("Pikachu", "Karachi", "Pakistan");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.isFraud(transaction), false, "RuleOneTest - clear transaction");
    }

    public void rule_2Failed(FraudDetector fraudDetector) {
        Trader trader = new Trader("James", "Dublin", "Ireland");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTestFraud(fraudDetector.isFraud(transaction), true, "RuleTwoTest - fraud transaction");
    }

    public void rule_2Passed(FraudDetector fraudDetector) {
        Trader trader = new Trader("Willie", "Dublin", "Ireland");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestFraud(fraudDetector.isFraud(transaction), false, "RuleTwoTest - clear transaction");
    }

    public void rule_3Failed(FraudDetector fraudDetector) {
        Trader trader = new Trader("John", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.isFraud(transaction), true, "RuleThreeTest - fraud transaction");
    }

    public void rule_3Passed(FraudDetector fraudDetector) {
        Trader trader = new Trader("Boris", "Odessa", "Ukraine");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.isFraud(transaction), false, "RuleThreeTest - clear transaction");
    }

    public void rule_4Failed(FraudDetector fraudDetector) {
        Trader trader = new Trader("Michael", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.isFraud(transaction), true, "RuleFourTest - fraud transaction");
    }

    public void rule_4Passed(FraudDetector fraudDetector) {
        Trader trader = new Trader("Maria", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.isFraud(transaction), false, "RuleFourTest - clear transaction");
    }

    public void rule_5Failed(FraudDetector fraudDetector) {
        Trader trader = new Trader("Bastian", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1500);
        assertTestFraud(fraudDetector.isFraud(transaction), true, "RuleFiveTest - fraud transaction");
    }

    public void rule_5Passed(FraudDetector fraudDetector) {
        Trader trader = new Trader("Sofia", "Frankfurt", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestFraud(fraudDetector.isFraud(transaction), false, "RuleFiveTest - clear transaction");
    }

    private void assertTestFraud(boolean actualResult, boolean expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}

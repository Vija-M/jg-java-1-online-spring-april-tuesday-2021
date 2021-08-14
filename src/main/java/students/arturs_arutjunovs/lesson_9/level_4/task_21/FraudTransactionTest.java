package students.arturs_arutjunovs.lesson_9.level_4.task_21;

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
        test.rule_4Failed();
        test.rule_4Passed();
        test.rule_5Failed();
        test.rule_5Passed();
    }

    public void rule_1Failed() {
        Trader trader = new Trader("Pokemon", "Bogota", "Colombia");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.rejectPerson(transaction), true, "RuleOneTest - fraud transaction");
    }

    public void rule_1Passed() {
        Trader trader = new Trader("Pikachu", "Karachi", "Pakistan");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.rejectPerson(transaction), false, "RuleOneTest - clear transaction");
    }

    public void rule_2Failed() {
        Trader trader = new Trader("James", "Dublin", "Ireland");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTestFraud(fraudDetector.rejectAmount(transaction), true, "RuleTwoTest - fraud transaction");
    }

    public void rule_2Passed() {
        Trader trader = new Trader("Willie", "Dublin", "Ireland");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestFraud(fraudDetector.rejectAmount(transaction), false, "RuleTwoTest - clear transaction");
    }

    public void rule_3Failed() {
        Trader trader = new Trader("John", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.rejectCity(transaction), true, "RuleThreeTest - fraud transaction");
    }

    public void rule_3Passed() {
        Trader trader = new Trader("Boris", "Odessa", "Ukraine");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.rejectCity(transaction), false, "RuleThreeTest - clear transaction");
    }

    public void rule_4Failed() {
        Trader trader = new Trader("Michael", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.rejectCountry(transaction), true, "RuleFourTest - fraud transaction");
    }

    public void rule_4Passed() {
        Trader trader = new Trader("Maria", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 100);
        assertTestFraud(fraudDetector.rejectCountry(transaction), false, "RuleFourTest - clear transaction");
    }

    public void rule_5Failed() {
        Trader trader = new Trader("Bastian", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1500);
        assertTestFraud(fraudDetector.rejectCountryAndAmount(transaction), true, "RuleFiveTest - fraud transaction");
    }

    public void rule_5Passed() {
        Trader trader = new Trader("Sofia", "Frankfurt", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestFraud(fraudDetector.rejectCountryAndAmount(transaction), false, "RuleFiveTest - clear transaction");
    }

    private void assertTestFraud(boolean actualResult, boolean expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}

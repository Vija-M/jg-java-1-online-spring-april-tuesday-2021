package students.ernests_subhankulovs.lesson_9.level_4.task_18;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.firstRulePassTest();
        test.firstRuleFailTest();
        test.secondRulePassTest();
        test.firstRuleFailTest();
    }

    public void firstRulePassTest() {
        Trader trader = new Trader("John Smith", "London");
        Transaction transaction = new Transaction(trader, 500);
        assertTestResult(false, fraudDetector.isFraud(transaction), "1st rule pass test");
    }

    public void firstRuleFailTest() {
        Trader trader = new Trader("Pokemon", "London");
        Transaction transaction = new Transaction(trader, 500);
        assertTestResult(true, fraudDetector.isFraud(transaction), "1st rule fail test");
    }

    public void secondRulePassTest() {
        Trader trader = new Trader("John Smith", "London");
        Transaction transaction = new Transaction(trader, 1000000);
        assertTestResult(false, fraudDetector.isFraud(transaction), "2nd rule pass test");
    }

    public void secondRuleFailTest() {
        Trader trader = new Trader("John Smith", "London");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTestResult(true, fraudDetector.isFraud(transaction), "2nd rule fail test");
    }

    private void assertTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}

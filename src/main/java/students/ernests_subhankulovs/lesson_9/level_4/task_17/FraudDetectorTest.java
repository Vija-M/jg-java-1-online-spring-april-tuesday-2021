package students.ernests_subhankulovs.lesson_9.level_4.task_17;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.firstRulePassTest();
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

    private void assertTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}

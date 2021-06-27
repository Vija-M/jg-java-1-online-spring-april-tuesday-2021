package students.ernests_subhankulovs.lesson_9.level_5.task_24;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.firstRulePassTest();
        test.firstRuleFailTest();
        test.secondRulePassTest();
        test.secondRuleFailTest();
        test.thirdRulePassTest();
        test.thirdRuleFailTest();
        test.fourthRulePassTest();
        test.fourthRuleFailTest();
        test.fifthRulePassTest();
        test.fifthRuleFailTest();
    }

    public void firstRulePassTest() {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule1 fraudRule1 = new FraudRule1("Rule 1");
        assertTestResult(false, fraudRule1.isFraud(transaction), "1st rule pass test");
    }

    public void firstRuleFailTest() {
        Trader trader = new Trader("Pokemon", "London", "UK");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule1 fraudRule1 = new FraudRule1("Rule 1");
        assertTestResult(true, fraudRule1.isFraud(transaction), "1st rule fail test");
    }

    public void secondRulePassTest() {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000000);
        assertTestResult(false, fraudDetector.isFraud(transaction), "2nd rule pass test");
    }

    public void secondRuleFailTest() {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTestResult(true, fraudDetector.isFraud(transaction), "2nd rule fail test");
    }

    public void thirdRulePassTest() {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(false, fraudDetector.isFraud(transaction), "3rd rule pass test");
    }

    public void thirdRuleFailTest() {
        Trader trader = new Trader("John Smith", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(true, fraudDetector.isFraud(transaction), "3rd rule fail test");
    }

    public void fourthRulePassTest() {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(false, fraudDetector.isFraud(transaction), "4th rule pass test");
    }

    public void fourthRuleFailTest() {
        Trader trader = new Trader("John Smith", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(true, fraudDetector.isFraud(transaction), "4th rule fail test");
    }

    public void fifthRulePassTest() {
        Trader trader = new Trader("John Smith", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(false, fraudDetector.isFraud(transaction), "5th rule pass test");
    }

    public void fifthRuleFailTest() {
        Trader trader = new Trader("John Smith", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        assertTestResult(true, fraudDetector.isFraud(transaction), "5th rule fail test");
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
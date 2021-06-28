package students.ernests_subhankulovs.lesson_9.level_5.task_29;

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
        test.firstRulePassTest(fraudDetector);
        test.firstRuleFailTest(fraudDetector);
        test.secondRulePassTest(fraudDetector);
        test.secondRuleFailTest(fraudDetector);
        test.thirdRulePassTest(fraudDetector);
        test.thirdRuleFailTest(fraudDetector);
        test.fourthRulePassTest(fraudDetector);
        test.fourthRuleFailTest(fraudDetector);
        test.fifthRulePassTest(fraudDetector);
        test.fifthRuleFailTest(fraudDetector);
    }

    public void firstRulePassTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 500);
        assertTestResult(false, fraudDetector.isFraud(transaction), "1st rule pass test");
    }

    public void firstRuleFailTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("Pokemon", "London", "UK");
        Transaction transaction = new Transaction(trader, 500);
        assertTestResult(true, fraudDetector.isFraud(transaction), "1st rule fail test");
    }

    public void secondRulePassTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000000);
        assertTestResult(false, fraudDetector.isFraud(transaction), "2nd rule pass test");
    }

    public void secondRuleFailTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTestResult(true, fraudDetector.isFraud(transaction), "2nd rule fail test");
    }

    public void thirdRulePassTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(false, fraudDetector.isFraud(transaction), "3rd rule pass test");
    }

    public void thirdRuleFailTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(true, fraudDetector.isFraud(transaction), "3rd rule fail test");
    }

    public void fourthRulePassTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(false, fraudDetector.isFraud(transaction), "4th rule pass test");
    }

    public void fourthRuleFailTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(true, fraudDetector.isFraud(transaction), "4th rule fail test");
    }

    public void fifthRulePassTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(false, fraudDetector.isFraud(transaction), "5th rule pass test");
    }

    public void fifthRuleFailTest(FraudDetector fraudDetector) {
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
package students.ernests_subhankulovs.lesson_9.level_6.task_33;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudRule[] fraudRules = new FraudRule[5];
        fraudRules[0] = new FraudRule1("Rule 1");
        fraudRules[1] = new FraudRule2("Rule 2");
        fraudRules[2] = new FraudRule3("Rule 3");
        fraudRules[3] = new FraudRule4("Rule 4");
        fraudRules[4] = new FraudRule5("Rule 5");
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
        assertTestResult(false, fraudDetector.isFraud(transaction).getFraud(), "1st rule pass test");
    }

    public void firstRuleFailTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("Pokemon", "London", "UK");
        Transaction transaction = new Transaction(trader, 500);
        assertTestResult(true, fraudDetector.isFraud(transaction).getFraud(), "1st rule fail test");
        assertRuleNameTestResult("Rule 1", fraudDetector.isFraud(transaction).getRuleName(), "1st rule name fail test");
    }

    public void secondRulePassTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000000);
        assertTestResult(false, fraudDetector.isFraud(transaction).getFraud(), "2nd rule pass test");
    }

    public void secondRuleFailTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTestResult(true, fraudDetector.isFraud(transaction).getFraud(), "2nd rule fail test");
        assertRuleNameTestResult("Rule 2", fraudDetector.isFraud(transaction).getRuleName(), "2nd rule name fail test");
    }

    public void thirdRulePassTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(false, fraudDetector.isFraud(transaction).getFraud(), "3rd rule pass test");
    }

    public void thirdRuleFailTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(true, fraudDetector.isFraud(transaction).getFraud(), "3rd rule fail test");
        assertRuleNameTestResult("Rule 3", fraudDetector.isFraud(transaction).getRuleName(), "3rd rule name fail test");

    }

    public void fourthRulePassTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(false, fraudDetector.isFraud(transaction).getFraud(), "4th rule pass test");
    }

    public void fourthRuleFailTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(true, fraudDetector.isFraud(transaction).getFraud(), "4th rule fail test");
        assertRuleNameTestResult("Rule 4", fraudDetector.isFraud(transaction).getRuleName(), "4th rule name fail test");

    }

    public void fifthRulePassTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertTestResult(false, fraudDetector.isFraud(transaction).getFraud(), "5th rule pass test");
    }

    public void fifthRuleFailTest(FraudDetector fraudDetector) {
        Trader trader = new Trader("John Smith", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        assertTestResult(true, fraudDetector.isFraud(transaction).getFraud(), "5th rule fail test");
        assertRuleNameTestResult("Rule 5", fraudDetector.isFraud(transaction).getRuleName(), "5th rule name fail test");

    }

    private void assertTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

    private void assertRuleNameTestResult(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}
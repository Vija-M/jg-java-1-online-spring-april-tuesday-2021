package students.eriks_jaloveckis.lesson_9.level_4.task_18;

class FraudDetectorTest {
    FraudDetector fraudDetector = new FraudDetector();

    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.testIsNotFraud();
        fraudDetectorTest.testIsFraud();
    }

    public void assertTest(boolean expected, boolean realResult, String text) {
        if (expected == realResult) {
            System.out.println(text + " - TEST OK!");
        } else {
            System.out.println(text + " - FAIL!");
        }
    }

    public void testIsNotFraud() {
        Trader trader = new Trader("Mike", "Riga");
        Transaction transaction = new Transaction(trader, 1000000);
        assertTest(false, fraudDetector.amountFraud(transaction), "Is not fraud");
    }

    public void testIsFraud() {
        Trader trader = new Trader("Mike", "Riga");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTest(true, fraudDetector.amountFraud(transaction), "Is fraud");
    }
}

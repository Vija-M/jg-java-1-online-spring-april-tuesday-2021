package students.eriks_jaloveckis.lesson_9.level_4.task_17;

public class FraudDetectorTest {
    FraudDetector fraudDetector = new FraudDetector();
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.testIsFraud();
        fraudDetectorTest.testIsFraud();
    }

    public void assertTest (boolean expected, boolean realResult, String text) {
        if (expected == realResult) {
            System.out.println(text + " - TEST OK");
        }
        else {
            System.out.println(text + " - FAIL!");
        }
    }

    public void testIsFraud() {
        Trader trader = new Trader("Pokemon", "Daugavpils");
        Transaction transaction = new Transaction(trader, 500);
        assertTest(true, fraudDetector.isFraud(transaction),"Is fraud");
    }
    public void testNotFraud() {
        Trader trader = new Trader("Eriks", "Riga");
        Transaction transaction = new Transaction(trader, 300);
        assertTest(false, fraudDetector.isFraud(transaction),"Is not fraud");
    }
}

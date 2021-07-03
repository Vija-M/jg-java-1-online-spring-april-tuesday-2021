package students.eriks_jaloveckis.lesson_9.level_4.task_21;

public class FraudDetectorTest {
    FraudDetector fraudDetector = new FraudDetector();

    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.isFraud();
        fraudDetectorTest.isNotFraud();
    }

    public void assertTest(boolean expected, boolean realResult, String text) {
        if (expected == realResult) {
            System.out.println(text + " - TEST OK!");
        } else {
            System.out.println(text + " - FAIL!");
        }
    }

    public void isFraud() {
        Trader trader = new Trader("Mike", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        assertTest(true, fraudDetector.germanyAndAmountFraud(transaction), "Is fraud");
    }

    public void isNotFraud() {
        Trader trader = new Trader("Mike", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertTest(false, fraudDetector.germanyAndAmountFraud(transaction), "Is not fraud" );
    }
}

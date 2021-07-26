package students.eriks_jaloveckis.lesson_9.level_4.task_19;

public class FraudDetectorTest {
    FraudDetector fraudDetector = new FraudDetector();

    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.testIsFraud();
        fraudDetectorTest.testIsNotFraud();

    }

    public void assertTest (boolean expected, boolean realResult, String text) {
        if (expected == realResult) {
            System.out.println(text + " - TEST OK!");
        }
        else {
            System.out.println(text + " - FAIL!");
        }
    }

    public void testIsFraud() {
        Trader trader = new Trader("Mike", "Sidney");
        Transaction transaction =  new Transaction(trader, 400);
        assertTest(true, fraudDetector.cityFraud(transaction), "Is fraud");
    }

    public void testIsNotFraud() {
        Trader trader = new Trader("Mike", "Riga");
        Transaction transaction = new Transaction(trader, 400);
        assertTest(false, fraudDetector.cityFraud(transaction), "Is not fraud");
    }

}

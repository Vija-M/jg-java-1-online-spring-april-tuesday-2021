package students.eriks_jaloveckis.lesson_9.level_4.task_20;

class FraudDetectorTest {
    FraudDetector fraudDetector = new FraudDetector();

    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.isFraud();
        fraudDetectorTest.isNotFraud();
    }

    public void assertTest(boolean expected, boolean realResult, String text) {
        if (expected == realResult) {
            System.out.println(text + " - IS OK!");
        } else {
            System.out.println(text + " - FAIL!");
        }
    }

    public void isFraud() {
        Trader trader = new Trader("Mike", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 400);
        assertTest(true, fraudDetector.jamaicaFraud(transaction), "Is fraud");
    }

    public void isNotFraud() {
        Trader trader = new Trader("Mike", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 500);
        assertTest(false, fraudDetector.jamaicaFraud(transaction), "Is not fraud");
    }


}

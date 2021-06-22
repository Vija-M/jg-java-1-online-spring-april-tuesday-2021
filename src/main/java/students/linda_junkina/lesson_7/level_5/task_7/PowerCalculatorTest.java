package students.linda_junkina.lesson_7.level_5.task_7;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.scenario1();
        test.scenario2();
    }

    public void scenario1() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int raisedToPower = powerCalculator.raisedToPower(2, 5);
        checkTestResult(raisedToPower == 32, "2 raised to the power of 5");
    }

    public void scenario2() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int raisedToPower = powerCalculator.raisedToPower(2, 0);
        checkTestResult(raisedToPower == 1, "2 raised to the power of 0");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}

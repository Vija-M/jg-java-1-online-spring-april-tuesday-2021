package students.arturs_arutjunovs.lesson_7.level_5.task_7;

class PowerCalculatorTest {

    PowerCalculator powerCalculator = new PowerCalculator();

    public static void main(String[] args) {
        students.arturs_arutjunovs.lesson_7.level_5.task_7.PowerCalculatorTest test = new students.arturs_arutjunovs.lesson_7.level_5.task_7.PowerCalculatorTest();
        test.powerTest();
    }

    public void powerTest() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                powerCalcTestResult(Math.pow(i, j), powerCalculator.power(i, j), i + " в степени " + j + " = " + Math.pow(i, j));
            }
        }
    }

    public void powerCalcTestResult(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("[ OK ]: " + testName);
        } else {
            System.out.println("[ FAILED ]: " + testName);
        }
    }
}

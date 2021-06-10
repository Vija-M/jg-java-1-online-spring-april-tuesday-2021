package students.ernests_subhankulovs.lesson_7.level_5.task_7;

class PowerCalculatorTest {

    PowerCalculator powerCalculator = new PowerCalculator();

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.testCombinationsFromZeroToTen();
    }

    
    public void testCombinationsFromZeroToTen() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                assertTestResult(Math.pow(i, j), powerCalculator.power(i, j),i + " ^ " + j + " = " + Math.pow(i, j));
            }
        }
    }

    private void assertTestResult(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " :\t OK");
        }
        else {
            System.out.println(testName + " :\t FAIL");
        }
    }
}

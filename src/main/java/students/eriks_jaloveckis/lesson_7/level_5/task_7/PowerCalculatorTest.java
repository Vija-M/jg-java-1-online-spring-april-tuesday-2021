package students.eriks_jaloveckis.lesson_7.level_5.task_7;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.test1();

    }

    public void assertTest (int expected, int realResult, String testName) {
        if (expected == realResult) {
            System.out.println(testName + " IS OK!");
        }
        else {
            System.out.println(testName + " FAIL!");
        }
    }

    public void test1() {
       PowerCalculator powerCalculator = new PowerCalculator();
        assertTest(25, powerCalculator.createPowerCalculator(5, 2), "Power of 5 is 25" );
    }
}

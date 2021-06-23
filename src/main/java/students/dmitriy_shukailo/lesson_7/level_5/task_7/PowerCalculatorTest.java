package students.dmitriy_shukailo.lesson_7.level_5.task_7;

class PowerCalculatorTest {

    PowerCalculator powerCalculator = new PowerCalculator();

    public static void main(String[] args) {

        PowerCalculatorTest test = new PowerCalculatorTest();
        test.zero();
        test.one();
        test.two();
    }

    public void zero() {

        int total = powerCalculator.powerNumber(2, 0);
        checkTest(total == 1, "Test 0 of power: ");
    }

    public void one() {

        int total = powerCalculator.powerNumber(2, 1);
        checkTest(total == 2, "Test 1 of power: ");
    }

    public void two() {

        int total = powerCalculator.powerNumber(2, 3);
        checkTest(total == 8, "Test 3 of power: ");
    }

    private void checkTest(boolean condition, String test) {

        if (condition) {
            System.out.println(test + " = OK!");
        } else {
            System.out.println(test + " = FAIL!");
        }
    }

}
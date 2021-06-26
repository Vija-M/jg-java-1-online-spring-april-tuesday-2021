package students.ernests_subhankulovs.lesson_8.level_7.task_32;

class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest test = new MathOperationTest();
        test.additionTest();
        test.subtractionTest();
        test.multiplicationTest();
        test.divisionTest();
    }

    public void additionTest() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(20);
        MathOperation addition = new Addition(arg1, arg2);
        assertTestResult(30, addition.calculate(), "Addition test");
    }

    public void subtractionTest() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(20);
        MathOperation subtraction = new Subtraction(arg1, arg2);
        assertTestResult(-10, subtraction.calculate(), "Subtraction test");
    }

    public void multiplicationTest() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(20);
        MathOperation multiplication = new Multiplication(arg1, arg2);
        assertTestResult(200, multiplication.calculate(), "Multiplication test");
    }

    public void divisionTest() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(20);
        MathOperation division = new Division(arg1, arg2);
        assertTestResult(0.5, division.calculate(), "Division test");
    }

    private void assertTestResult(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}

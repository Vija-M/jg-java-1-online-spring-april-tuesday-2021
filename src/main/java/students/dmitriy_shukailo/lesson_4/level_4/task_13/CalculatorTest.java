package students.dmitriy_shukailo.lesson_4.level_4.task_13;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTestOne();
        calculatorTest.maxOfTwoNumbersTestTwo();
        calculatorTest.maxOfTwoNumbersTestThree();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;

        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;

        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;

        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 10;  //
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersTestOne() {
        Calculator calculator = new Calculator();

        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        assertThatEqual(expectedResult, realResult, "maxOfTwoNumbersTest: firstNumber is greater = ");
    }

    public void maxOfTwoNumbersTestTwo() {
        Calculator calculator = new Calculator();

        int firstNumber = 10;
        int secondNumber = 15;
        int expectedResult = 15;
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        assertThatEqual(expectedResult, realResult, "maxOfTwoNumbersTest: secondNumber is greater = ");
    }

    public void maxOfTwoNumbersTestThree() {
        Calculator calculator = new Calculator();

        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        assertThatEqual(expectedResult, realResult, "maxOfTwoNumbersTest: firstNumber is equal secondNumber = ");
    }

    void assertThatEqual(int expectedResult, int realResult, String description) {
        if (expectedResult == realResult) {
            System.out.println(description + "OK");
        } else {
            System.out.println(description + "FAIL");
        }
    }

}
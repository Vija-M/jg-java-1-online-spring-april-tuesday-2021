package students.dmitriy_shukailo.lesson_4.level_4.task_14;

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
        calculatorTest.maxOfThreeNumbersTestOne();
        calculatorTest.maxOfThreeNumbersTestTwo();
        calculatorTest.maxOfThreeNumbersTestThree();
        calculatorTest.maxOfThreeNumbersTestFour();
        calculatorTest.maxOfThreeNumbersTestFive();
        calculatorTest.maxOfThreeNumbersTestSix();
        calculatorTest.maxOfThreeNumbersTestSeven();
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
        int number = 10;
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

        assertmaxOfTwoNumbers(expectedResult, realResult, "maxOfTwoNumbersTest: firstNumber is greater = ");
    }

    public void maxOfTwoNumbersTestTwo() {
        Calculator calculator = new Calculator();

        int firstNumber = 10;
        int secondNumber = 15;
        int expectedResult = 15;
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        assertmaxOfTwoNumbers(expectedResult, realResult, "maxOfTwoNumbersTest: secondNumber is greater = ");
    }

    public void maxOfTwoNumbersTestThree() {
        Calculator calculator = new Calculator();

        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        assertmaxOfTwoNumbers(expectedResult, realResult, "maxOfTwoNumbersTest: firstNumber is equal secondNumber = ");
    }

    void assertmaxOfTwoNumbers(int expectedResult, int realResult, String description) {
        if (expectedResult == realResult) {
            System.out.println(description + "OK");
        } else {
            System.out.println(description + "FAIL");
        }
    }

    public void maxOfThreeNumbersTestOne() {
        Calculator calculator = new Calculator();

        int firstNumber = 11;
        int secondNumber = 5;
        int thirdNumber = 1;
        int expectedResult = 11;
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        assertmaxOfThreeNumbers(expectedResult, realResult, "maxOfThreeNumbersTest: firstNumber is greater = ");
    }


    public void maxOfThreeNumbersTestTwo() {
        Calculator calculator = new Calculator();

        int firstNumber = 11;
        int secondNumber = 15;
        int thirdNumber = 1;
        int expectedResult = 15;

        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        assertmaxOfThreeNumbers(expectedResult, realResult, "maxOfThreeNumbersTest: secondNumber is greater = ");
    }

    public void maxOfThreeNumbersTestThree() {
        Calculator calculator = new Calculator();

        int firstNumber = 11;
        int secondNumber = 5;
        int thirdNumber = 19;
        int expectedResult = 19;

        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        assertmaxOfThreeNumbers(expectedResult, realResult, "maxOfThreeNumbersTest: thirdNumber is greater = ");
    }

    public void maxOfThreeNumbersTestFour() {
        Calculator calculator = new Calculator();

        int firstNumber = 11;
        int secondNumber = 11;
        int thirdNumber = 1;
        int expectedResult = 11;

        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        assertmaxOfThreeNumbers(expectedResult, realResult, "maxOfThreeNumbersTest: firstNumber and secondNumber are equal and greater = ");
    }

    public void maxOfThreeNumbersTestFive() {
        Calculator calculator = new Calculator();

        int firstNumber = 15;
        int secondNumber = 1;
        int thirdNumber = 15;
        int expectedResult = 15;

        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        assertmaxOfThreeNumbers(expectedResult, realResult, "maxOfThreeNumbersTest: firstNumber and thirdNumber are equal and greater = ");
    }

    public void maxOfThreeNumbersTestSix() {
        Calculator calculator = new Calculator();

        int firstNumber = 1;
        int secondNumber = 17;
        int thirdNumber = 17;
        int expectedResult = 17;

        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        assertmaxOfThreeNumbers(expectedResult, realResult, "maxOfThreeNumbersTest: secondNumber and thirdNumber are equal and greater = ");
    }

    public void maxOfThreeNumbersTestSeven() {
        Calculator calculator = new Calculator();

        int firstNumber = 11;
        int secondNumber = 11;
        int thirdNumber = 11;
        int expectedResult = 11;

        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        assertmaxOfThreeNumbers(expectedResult, realResult, "maxOfThreeNumbersTest: firstNumber, secondNumber and thirdNumber are equal = ");
    }

    void assertmaxOfThreeNumbers(int expectedResult, int realResult, String description) {
        if (expectedResult == realResult) {
            System.out.println(description + "OK");
        } else {
            System.out.println(description + "FAIL");
        }
    }
}
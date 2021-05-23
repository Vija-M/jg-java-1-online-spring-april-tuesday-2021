package students.arturs_arutjunovs.lesson_4.level_4.task_14;

class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();

        calculatorTest.firstNrBiggerThanSecond();
        calculatorTest.secondNrBigger();
        calculatorTest.bothNrEqual();

        calculatorTest.threeNumbers_Option_1();
        calculatorTest.threeNumbers_Option_2();
        calculatorTest.threeNumbers_Option_3();
        calculatorTest.threeNumbers_Option_4();
        calculatorTest.threeNumbers_Option_5();
    }

    void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        checkCorrectOutput(expectedResult, realResult, "sumTest");

    }

    void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;

        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        checkCorrectOutput(expectedResult, realResult, "subTest");

    }

    void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;

        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        checkCorrectOutput(expectedResult, realResult, "mulTest");

    }

    void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;

        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        checkCorrectOutput(expectedResult, realResult, "divTest");

    }

    //even or odd number
    void isEvenTest() {
        int number = 8;
        boolean expectedResult = true;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("[TEST OK]: isEven");
        } else {
            System.out.println("[TEST FAILED]: isEven test, Expected " + expectedResult + ", but was " + realResult);
        }
    }

    //first number is bigger test
    void firstNrBiggerThanSecond() {
        int firstNumber = 8;
        int secondNumber = 5;
        int expectedResult = firstNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.max(firstNumber, secondNumber);
        checkCorrectOutput(expectedResult, realResult, "firstNrBiggerThanSecond");

    }

    //second number is bigger test
    void secondNrBigger() {
        int firstNumber = 4;
        int secondNumber = 9;
        int expectedResult = secondNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.max(firstNumber, secondNumber);
        checkCorrectOutput(expectedResult, realResult, "secondNrBigger");

    }

    //both numbers are equal test
    void bothNrEqual() {
        int firstNumber = 7;
        int secondNumber = 7;
        int expectedResult = firstNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.max(firstNumber, secondNumber);
        if ((realResult == expectedResult) && (expectedResult == secondNumber)) {

            System.out.println("[TEST OK]: bothNrEqual");
        } else {
            System.out.println("[TEST FAILED]: bothNrEqual test, Expected " + expectedResult + ", but was " + realResult);
        }
    }

    //first number bigger than second and third
    void threeNumbers_Option_1() {
        int firstNumber = 12;
        int secondNumber = 6;
        int thirdNumber = 10;
        int expectedResult = firstNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.max(firstNumber, secondNumber, thirdNumber);
        checkCorrectOutput(expectedResult, realResult, "threeNumbers_Option_1");

    }

    //second number bigger than first and third
    void threeNumbers_Option_2() {
        int firstNumber = 5;
        int secondNumber = 9;
        int thirdNumber = 3;
        int expectedResult = secondNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.max(firstNumber, secondNumber, thirdNumber);
        checkCorrectOutput(expectedResult, realResult, "threeNumbers_Option_2");

    }

    //third number is bigger than first and second
    void threeNumbers_Option_3() {
        int firstNumber = 7;
        int secondNumber = 4;
        int thirdNumber = 11;
        int expectedResult = thirdNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.max(firstNumber, secondNumber, thirdNumber);
        checkCorrectOutput(expectedResult, realResult, "threeNumbers_Option_3");
    }

    //first and second are equal and more than third
    void threeNumbers_Option_4() {
        int firstNumber = 7;
        int secondNumber = 7;
        int thirdNumber = 3;
        int expectedResult = firstNumber;

        Calculator calculator = new Calculator();
        int realResult = calculator.max(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult && expectedResult == secondNumber && thirdNumber != secondNumber) {
            System.out.println("[TEST OK]: threeNumbers_Option_4");
        } else {
            System.out.println("[TEST FAILED]:  threeNumbers_Option_4, Expected " + expectedResult + ", but was " + realResult);
        }
    }

    //all three numbers are equal
    void threeNumbers_Option_5() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 5;
        int expectedResult = secondNumber;


        Calculator calculator = new Calculator();
        int realResult = calculator.max(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult && expectedResult == firstNumber) {
            System.out.println("[TEST OK]: threeNumbers_Option_5");
        } else {
            System.out.println("[TEST FAILED]: threeNumbers_Option_5, Expected " + expectedResult + ", but was " + realResult);
        }

    }

    void checkCorrectOutput(int expectedResult, int realResult, String description) {
        if (expectedResult == realResult) {
            System.out.println("[TEST OK]: " + description);
        } else {
            System.out.println("[TEST FAILED]: " + description + ". Expected " + expectedResult + ", but was " + realResult);
        }
    }
}
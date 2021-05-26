package students.linda_junkina.lesson_4.level_4.task_10_11_12_13_14;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.differenceTest();
        calculatorTest.productTest();
        calculatorTest.quotientTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxNumberOutOfTwo();
        calculatorTest.maxNumberOutOfThree();
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

    public void differenceTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.difference(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Difference test = OK");
        } else {
            System.out.println("Difference test = FAIL");
        }
    }

    public void productTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.product(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Product test = OK");
        } else {
            System.out.println("Product test = FAIL");
        }
    }

    public void quotientTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.quotient(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Quotient test = OK");
        } else {
            System.out.println("Quotient test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 4;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void maxNumberOutOfTwo() {
        int firstNumber = 5;
        int secondNumber = 1;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumberOutOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxNumberOutOfTwo test = OK");
        } else {
            System.out.println("maxNumberOutOfTwo = FAIL");
        }
    }

    public void maxNumberOutOfThree() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 7;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumberOutOfThree(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxNumberOutOfThree test = OK");
        } else {
            System.out.println("maxNumberOutOfThree = FAIL");
        }
    }
}

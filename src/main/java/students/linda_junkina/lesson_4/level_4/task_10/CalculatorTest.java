package students.linda_junkina.lesson_4.level_4.task_10;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.differenceTest();
        calculatorTest.productTest();
        calculatorTest.quotientTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxNumberOutOfTwo();
        calculatorTest.maxFirstNumber();
        calculatorTest.maxSecondNumber();
        calculatorTest.maxThirdNumber();
        calculatorTest.firstAndSecondEqual();
        calculatorTest.allNumbersEqual();
        calculatorTest.sumGreaterOrEqualsToThird();


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
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.maxNumberOutOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxNumberOutOfTwo test = OK");
        } else {
            System.out.println("maxNumberOutOfTwo = FAIL");
        }
    }
    public void maxFirstNumber() {
        int firstNumber = 10;
        int secondNumber = 9;
        int thirdNumber = 8;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.maxFirstNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxFirstNumber test = OK");
        } else {
            System.out.println("maxFirstNumber = FAIL");
        }
    }
    public void maxSecondNumber() {
        int firstNumber = 10;
        int secondNumber = 95;
        int thirdNumber = 8;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.maxSecondNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxSecondNumber test = OK");
        } else {
            System.out.println("maxSecondNumber = FAIL");
        }
    }
    public void maxThirdNumber() {
        int firstNumber = 10;
        int secondNumber = 9;
        int thirdNumber = 11;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.maxThirdNumber(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxThirdNumber test = OK");
        } else {
            System.out.println("maxThirdNumber = FAIL");
        }
    }
    public void firstAndSecondEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 8;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.firstAndSecondEqual(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
             System.out.println("firstAndSecondEqual test = OK");
           } else {
            System.out.println("firstAndSecondEqual = FAIL");
        }
    }
    public void allNumbersEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.allNumbersEqual(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("allNumbersEqual test = OK");
        } else {
            System.out.println("allNumbersEqual = FAIL");
        }
    }
    public void sumGreaterOrEqualsToThird() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.sumGreaterOrEqualsToThird(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("sumGreaterOrEqualsToThird test = OK");
        } else {
            System.out.println("sumGreaterOrEqualsToThird = FAIL");
        }
    }
}

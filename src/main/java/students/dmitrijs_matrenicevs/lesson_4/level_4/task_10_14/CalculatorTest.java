package students.dmitrijs_matrenicevs.lesson_4.level_4.task_10_14;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersOne();
        calculatorTest.maxOfTwoNumbersTwo();
        calculatorTest.maxOfTwoNumbersTree();
        calculatorTest.numbersOneTwoTreeMoreOne();
        calculatorTest.numbersOneTwoTreeMoreTwo();
        calculatorTest.numbersOneTwoTreeMoreTree();
        calculatorTest.numbersOneTwoTreeMoreFour();
        calculatorTest.numbersOneTwoTreeMoreFive();
    }


    void sumTest() {
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

    void subTest(){
        int firstNumber = 20;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    void divTest(){
        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    void mulTest(){
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

    void isEvenTest(){
        int number = 10;
        Calculator calculator = new Calculator();
        boolean realNumber = calculator.isEven(number);
        boolean yourResult = true;
        if (realNumber == yourResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    void maxOfTwoNumbersOne(){
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbersOne(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersOne test (<) = OK");
        } else {
            System.out.println("maxOfTwoNumbersOne test (<) = FAIL");
        }
    }

    void maxOfTwoNumbersTwo(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbersOne(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTwo test (>) = OK");
        } else {
            System.out.println("maxOfTwoNumbersTwo test (>) = FAIL");
        }
    }

    void maxOfTwoNumbersTree(){
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbersOne(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTree test (=) = OK");
        } else {
            System.out.println("maxOfTwoNumbersTree test (=) = FAIL");
        }
    }

//первое число больше второго и третьего
    void numbersOneTwoTreeMoreOne(){
        int firstNumber = 15;
        int secondNumber = 5;
        int treeNumber = 7;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.numbersOneTwoTreeMore(firstNumber, secondNumber, treeNumber);
        if (realResult == expectedResult) {
            System.out.println("numbersOneTwoTreeMore test (1) = OK");
        } else {
            System.out.println("numbersOneTwoTreeMore test (1) = FAIL");
        }
    }
//второе число больше первого и третьего
    void numbersOneTwoTreeMoreTwo(){
        int firstNumber = 2;
        int secondNumber = 15;
        int treeNumber = 3;
        int expectedResult = secondNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.numbersOneTwoTreeMore(firstNumber, secondNumber, treeNumber);
        if (realResult == expectedResult) {
            System.out.println("numbersOneTwoTreeMore test (2) = OK");
        } else {
            System.out.println("numbersOneTwoTreeMore test (2) = FAIL");
        }
    }
//третье число больше первого и второго
    void numbersOneTwoTreeMoreTree(){
        int firstNumber = 4;
        int secondNumber = 15;
        int treeNumber = 17;
        int expectedResult = treeNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.numbersOneTwoTreeMore(firstNumber, secondNumber, treeNumber);
        if (realResult == expectedResult) {
            System.out.println("numbersOneTwoTreeMore test (3) = OK");
        } else {
            System.out.println("numbersOneTwoTreeMore test (3) = FAIL");
        }
    }
//первые два равны и больше третьего
    void numbersOneTwoTreeMoreFour(){
        int firstNumber = 14;
        int secondNumber = 14;
        int treeNumber = 5;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.numbersOneTwoTreeMore(firstNumber, secondNumber, treeNumber);
        if (realResult == expectedResult && expectedResult == secondNumber && expectedResult != treeNumber) {
            System.out.println("numbersOneTwoTreeMore test (4) = OK");
        } else {
            System.out.println("numbersOneTwoTreeMore test (4) = FAIL");
        }
    }
//три числа равны
    void numbersOneTwoTreeMoreFive(){
        int firstNumber = 14;
        int secondNumber = 14;
        int treeNumber = 14;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.numbersOneTwoTreeMore(firstNumber, secondNumber, treeNumber);
        if (realResult == expectedResult && firstNumber == secondNumber && treeNumber == secondNumber && firstNumber == treeNumber) {
            System.out.println("numbersOneTwoTreeMore test (5) = OK");
        } else {
            System.out.println("numbersOneTwoTreeMore test (5) = FAIL");
        }
    }


}

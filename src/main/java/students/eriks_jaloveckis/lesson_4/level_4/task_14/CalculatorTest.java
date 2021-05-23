package students.eriks_jaloveckis.lesson_4.level_4.task_14;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.isEvenTest();
        calculatorTest.firstIsGreater();
        calculatorTest.secondIsGreater();
        calculatorTest.areEquals();
        calculatorTest.firstIsGreaterx();
        calculatorTest.secondIsGreaterx();
        calculatorTest.thirdisGreaterx();
        calculatorTest.areEqualsx();
        calculatorTest.firstAndSecondEqualsx();
        calculatorTest.firstAndThirdEqualsx();
        calculatorTest.secondAndThirdEqualsx();

    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest(){
        int firstNumber = 20;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Sub test = OK");
        }
        else{
            System.out.println("Sub test = FAIL");
        }
    }

    public void divTest(){
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedNumber = 5;
        Calculator calculator = new Calculator();
        int realNumber = calculator.div(firstNumber, secondNumber);
        if (expectedNumber == realNumber){
            System.out.println("Sub test = OK");
        }
        else{
            System.out.println("Sub test = FAIL");
        }
    }

    public void mulTest(){
        int firstNumber = 5;
        int secondNumber = 2;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.mul(firstNumber, secondNumber);
        if (expectedNumber == realNumber){
            System.out.println("Mul test = OK");
        }
        else{
            System.out.println("Mul test = FAIL");
        }
    }

    public void isEvenTest(){
        int number = 10;
        boolean expectedNumber = true;
        Calculator calculator = new Calculator();
        boolean realNumber = calculator.isEven(number);
        if (expectedNumber == realNumber){
            System.out.println("Is even test = OK ");
        }
        else {
            System.out.println("Is even test = FAIL");
        }
    }

    public void firstIsGreater(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expectedNumber == realNumber){
            System.out.println("First Number is Greater = OK");
        }
        else{
            System.out.println("First Number is Greater = FAIL");
        }
    }

    public void secondIsGreater(){
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expectedNumber == realNumber){
            System.out.println("Second Number is Greater = OK");
        }
        else{
            System.out.println("Second Number is Greater = FAIL");
        }
    }

    public void areEquals(){
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedNumber = 10;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expectedNumber == realNumber){
            System.out.println("Numbers are equal = OK");
        }
        else{
            System.out.println("Numbers are equal = FAIL");
        }
    }

    public void firstIsGreaterx(){
        int firstNumber = 14;
        int secondNumber = 13;
        int thirdNumber = 12;
        int expectedNumber = 14;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        if (expectedNumber == realNumber){
            System.out.println("First number is greater = OK");
        }
        else{
            System.out.println("First number is greater = FAIL");
        }
    }

    public void secondIsGreaterx(){
        int firstNumber = 14;
        int secondNumber = 16;
        int thirdNumber = 12;
        int expectedNumber = 16;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        if (expectedNumber == realNumber){
            System.out.println("Second number is greater = OK");
        }
        else{
            System.out.println("Second number is greater = FAIL");
        }
    }

    public void thirdisGreaterx(){
        int firstNumber = 14;
        int secondNumber = 13;
        int thirdNumber = 17;
        int expectedNumber = 17;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        if (expectedNumber == realNumber){
            System.out.println("Third number is greater = OK");
        }
        else{
            System.out.println("Third number is greater = FAIL");
        }
    }

    public void areEqualsx(){
        int firstNumber = 14;
        int secondNumber = 14;
        int thirdNumber = 14;
        int expectedNumber = 14;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        if (expectedNumber == realNumber){
            System.out.println("Are Equals = OK");
        }
        else{
            System.out.println("Are Equals = FAIL");
        }
    }

    public void firstAndSecondEqualsx(){
        int firstNumber = 19;
        int secondNumber = 19;
        int thirdNumber = 18;
        int expectedNumber = 19;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        if (expectedNumber == realNumber){
            System.out.println("First and Second numbers are equals and greater = OK");
        }
        else{
            System.out.println("First and Second numbers are equals and greater = FAIL");
        }
    }

    public void secondAndThirdEqualsx(){
        int firstNumber = 19;
        int secondNumber = 21;
        int thirdNumber = 21;
        int expectedNumber = 21;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        if (expectedNumber == realNumber){
            System.out.println("Second and Third numbers are equals and greater = OK");
        }
        else{
            System.out.println("Second and Third numbers are equals and greater = FAIL");
        }
    }

    public void firstAndThirdEqualsx(){
        int firstNumber = 19;
        int secondNumber = 17;
        int thirdNumber = 19;
        int expectedNumber = 19;
        Calculator calculator = new Calculator();
        int realNumber = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        if (expectedNumber == realNumber){
            System.out.println("First and Third numbers are equals and greater = OK");
        }
        else{
            System.out.println("First and Third numbers are equals and greater = FAIL");
        }
    }


}

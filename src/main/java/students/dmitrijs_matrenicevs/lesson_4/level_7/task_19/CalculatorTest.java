package students.dmitrijs_matrenicevs.lesson_4.level_7.task_19;

public class CalculatorTest {


    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        calculatorTest (calculator.sum(35,40),75);
    }

    public void subTest() {

        Calculator calculator = new Calculator();
        calculatorTest (calculator.sub(35,15),20);
    }

    public void mulTest() {

        Calculator calculator = new Calculator();
        calculatorTest (calculator.mul(5,5),25);

    }

    public void divTest() {

        Calculator calculator = new Calculator();
        calculatorTest (calculator.div(40,8),5);

    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        calculatorTestTwo (calculator.isEven(40), true);

    }


    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        calculatorTestTwo (calculator.isEven(41),false);

    }

    void calculatorTest (int expectedResult, int realResult){


        if (expectedResult == realResult){
            System.out.println("TEST = " + "OK");
        }
        else {
            System.out.println("TEST = " + "FAIL");
        }
    }

    void  calculatorTestTwo (boolean expectedResult, boolean realResult){

        if (expectedResult == realResult){
            System.out.println("TEST = " + "OK");
        }
        else {
            System.out.println("TEST = " + "FAIL");
        }
    }

}

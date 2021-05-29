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
        calculatorTest (calculator.sum(35,40),75, "SUM");
    }

    public void subTest() {

        Calculator calculator = new Calculator();
        calculatorTest (calculator.sub(35,15),20, "SUB");
    }

    public void mulTest() {

        Calculator calculator = new Calculator();
        calculatorTest (calculator.mul(5,5),25, "MUL");

    }

    public void divTest() {

        Calculator calculator = new Calculator();
        calculatorTest (calculator.div(40,8),5, "DIV");

    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        calculatorTestTwo (calculator.isEven(40), true, "IsEVEN1");

    }


    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        calculatorTestTwo (calculator.isEven(41),false, "IsEVEN2");

    }

    void calculatorTest (int expectedResult, int realResult, String name){


        if (expectedResult == realResult){
            System.out.println(name + " = OK");
        }
        else {
            System.out.println(name + " = FAIL");
        }
    }

    void  calculatorTestTwo (boolean expectedResult, boolean realResult, String name){

        if (expectedResult == realResult){
            System.out.println(name  + " = OK");
        }
        else {
            System.out.println(name + " = FAIL");
        }
    }

}

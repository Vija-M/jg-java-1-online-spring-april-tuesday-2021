package students.vija_m.lesson_4.level_7.task_17;


public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.test1();
        fizzBuzzTest.test2();
        fizzBuzzTest.test3();
        fizzBuzzTest.test4();
        fizzBuzzTest.test5();
    }

    public void test1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 6;
        String expectedResult = "Fizz";
        String realResult = fizzBuzz.detect(number);
        if (realResult == expectedResult) {
            System.out.println("Fizz test     = OK");
        } else {
            System.out.println("Fizz test     = FAIL");
        }
    }

    public void test2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 1225;
        String expectedResult = "Buzz";
        String realResult = fizzBuzz.detect(number);
        if (realResult == expectedResult) {
            System.out.println("Buzz test     = OK");
        } else {
            System.out.println("Buzz test     = FAIL");
        }
    }

    public void test3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 22;
        String expectedResult = "22";
        String realResult = fizzBuzz.detect(number);
        if (realResult == expectedResult) {
            System.out.println("Else test     = OK");
        } else {
            System.out.println("Else test     = FAIL, real result: " + realResult + ".");
        }
    }

    public void test4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 345;
        String expectedResult = "FizzBuzz";
        String realResult = fizzBuzz.detect(number);
        if (realResult == expectedResult) {
            System.out.println("FizzBuzz test = OK");
        } else {
            System.out.println("FizzBuzz test = FAIL");
        }
    }

    public void test5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = -45;
        String expectedResult = "FizzBuzz";
        String realResult = fizzBuzz.detect(number);
        if (realResult == expectedResult) {
            System.out.println("Negative test = OK");
        } else {
            System.out.println("Negative test = FAIL");
        }
    }

}
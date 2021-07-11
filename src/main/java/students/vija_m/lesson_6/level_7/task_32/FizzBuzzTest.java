package students.vija_m.lesson_6.level_7.task_32;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.test1();
        fizzBuzzTest.test2();
        fizzBuzzTest.test3();
        fizzBuzzTest.test4();
        fizzBuzzTest.test5();
    }

    public void test1() {
        int number = 6;
        assertTest(fizzBuzz.detect(number), "Fizz", "Fizz test");
    }

    public void test2() {
        int number = 1225;
        assertTest(fizzBuzz.detect(number), "Buzz", "Buzz test");
    }

    public void test3() {
        int number = 22;
        assertTest(fizzBuzz.detect(number), "22", "Else test");
    }

    public void test4() {
        int number = 345;
        assertTest(fizzBuzz.detect(number), "FizzBuzz", "FizzBuzz test");
    }


    public void test5() {
        int number = -45;
        assertTest(fizzBuzz.detect(number), "FizzBuzz", "Negative number FizzBuzz test");
    }

    private void assertTest(String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }
}
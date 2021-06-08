package students.ernests_subhankulovs.lesson_6.level_7.task_32;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.elseTest();
    }

    public void fizzTest() {
        fizzBuzzTestAssert(3, "Fizz", "Fizz test");
    }

    public void buzzTest() {
        fizzBuzzTestAssert(5, "Buzz", "Buzz test");
    }

    public void fizzBuzzTest() {
        fizzBuzzTestAssert(30, "FizzBuzz", "FizzBuzz test");
    }

    public void elseTest() {
        fizzBuzzTestAssert(2, "2", "Else (return number) test");
    }

    public void fizzBuzzTestAssert(int number, String expectedResult, String testName) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " (number = " + number + "; expected result = " + expectedResult + ") = OK");
        } else {
            System.out.println(testName + " (number = " + number + "; expected result = " + expectedResult + ") = FAIL; Actual result: " + realResult + ".");
        }
    }
}

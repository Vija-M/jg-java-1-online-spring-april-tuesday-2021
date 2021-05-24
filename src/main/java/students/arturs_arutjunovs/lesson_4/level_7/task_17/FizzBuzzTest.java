package students.arturs_arutjunovs.lesson_4.level_7.task_17;

class FizzBuzzTest {
    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.divByZero();
        fizzBuzzTest.divByOne();
        fizzBuzzTest.divByThree();
        fizzBuzzTest.divByTen();
        fizzBuzzTest.divByFifteen();
        fizzBuzzTest.divByNegativeFive();
        fizzBuzzTest.divByNegativeNine();
        fizzBuzzTest.divByNegativeFifteen();
        fizzBuzzTest.divByNegativeFour();

    }

    void divByZero() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 0;
        String expectedResult = "FizzBuzz";
        String actualResult = fizzBuzz.detect(number);

        assertCheckDivision(expectedResult, actualResult, "Division by 0 test");
    }

    void divByOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 1;
        String expectedResult = "1";
        String actualResult = fizzBuzz.detect(number);

        assertCheckDivision(expectedResult, actualResult, "Division by 1 test");
    }

    void divByThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 9;
        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.detect(number);

        assertCheckDivision(expectedResult, actualResult, "Division by 3 test");
    }

    void divByTen() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 10;
        String expectedResult = "Buzz";
        String actualResult = fizzBuzz.detect(number);

        assertCheckDivision(expectedResult, actualResult, "Division by 10 test");

    }

    void divByFifteen() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String expectedResult = "FizzBuzz";
        String actualResult = fizzBuzz.detect(number);

        assertCheckDivision(expectedResult, actualResult, "Division by 15 test");
    }

    void divByNegativeFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = -5;
        String expectedResult = "Buzz";
        String actualResult = fizzBuzz.detect(number);

        assertCheckDivision(expectedResult, actualResult, "Division by -5 test");
    }

    void divByNegativeNine() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = -9;
        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.detect(number);

        assertCheckDivision(expectedResult, actualResult, "Division by -9 test");
    }

    void divByNegativeFifteen() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = -15;
        String expectedResult = "FizzBuzz";
        String actualResult = fizzBuzz.detect(number);

        assertCheckDivision(expectedResult, actualResult, "Division by -15 test");
    }

    void divByNegativeFour() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = -4;
        String expectedResult = "-4";
        String actualResult = fizzBuzz.detect(number);

        assertCheckDivision(expectedResult, actualResult, "Division by -4 test");
    }

    void assertCheckDivision(String expectedResult, String actualResult, String description) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("[Test OK]: Actual result: " + actualResult + ", " + description);
        } else {
            System.out.println("[Test FAILED]: " + "Actual result: " + actualResult + ",Expected: " + expectedResult);
        }
    }
}

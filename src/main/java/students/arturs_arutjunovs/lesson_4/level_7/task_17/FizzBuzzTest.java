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
        int number = 0;
        String expectedResult = "FizzBuzz";
        assertCheckDivision(expectedResult, number);
    }

    void divByOne() {
        int number = 1;
        String expectedResult = "1";
        assertCheckDivision(expectedResult, number);
    }

    void divByThree() {
        int number = 9;
        String expectedResult = "Fizz";
        assertCheckDivision(expectedResult, number);
    }

    void divByTen() {
        int number = 10;
        String expectedResult = "Buzz";
        assertCheckDivision(expectedResult, number);

    }

    void divByFifteen() {
        int number = 15;
        String expectedResult = "FizzBuzz";
        assertCheckDivision(expectedResult, number);
    }

    void divByNegativeFive() {
        int number = -5;
        String expectedResult = "Buzz";
        assertCheckDivision(expectedResult, number);
    }

    void divByNegativeNine() {
        int number = -9;
        String expectedResult = "Fizz";
        assertCheckDivision(expectedResult, number);
    }

    void divByNegativeFifteen() {
        int number = -15;
        String expectedResult = "FizzBuzz";
        assertCheckDivision(expectedResult, number);
    }

    void divByNegativeFour() {
        int number = -4;
        String expectedResult = "-4";
        assertCheckDivision(expectedResult, number);
    }

    void assertCheckDivision(String expectedResult, int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);
        if (expectedResult.equals(actualResult)) {
            System.out.println("[Test OK]: Actual result: " + actualResult + ", " + "Division by: " + "" + number);
        } else {
            System.out.println("[Test FAILED]: " + "Actual result: " + actualResult + ",Expected: " + expectedResult);
        }
    }
}
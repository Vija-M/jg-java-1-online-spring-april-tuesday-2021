package students.dmitrijs_matrenicevs.lesson_6.level_3.task_12_17;

class ArrayServiceTest {

    ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {

        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();

        arrayServiceTest.arrayServiceTestPositiveOne();
        arrayServiceTest.arrayServiceTestPositiveTwo();
        arrayServiceTest.arrayServiceTestNegativeOne();
        arrayServiceTest.arrayServiceTestNegativeTwo();
        arrayServiceTest.countOccurrencesOne();
        arrayServiceTest.countOccurrencesTwo();
        arrayServiceTest.countOccurrencesThree();
        arrayServiceTest.countOccurrencesFour();
    }

    //TASK12

    void arrayServiceTestPositiveOne() {
        ArrayService arrayService = new ArrayService();
        int[] arrayTest = {1, 2, 3, 4};
        testResult(arrayService.contains(arrayTest, 1), "TestPositiveOne");

    }

    void arrayServiceTestPositiveTwo() {
        ArrayService arrayService = new ArrayService();
        int[] arrayTest = {1, 2, 3, 4};
        testResult(arrayService.contains(arrayTest, 2), "TestPositiveTwo");

    }

    void arrayServiceTestNegativeOne() {
        ArrayService arrayService = new ArrayService();
        int[] arrayTest = {1, 2, 3, 4};
        testResult(arrayService.contains(arrayTest, 3), "TestNegativeOne");

    }

    void arrayServiceTestNegativeTwo() {
        ArrayService arrayService = new ArrayService();
        int[] arrayTest = {1, 2, 3, 4};
        testResult(arrayService.contains(arrayTest, 4), "TestNegativeTwo");

    }

    void testResult(boolean realResult, String name) {
        if (realResult) {
            System.out.println(name + " = OK");
        } else {
            System.out.println(name + " = FAIL");
        }
    }

    //TASK13

    void countOccurrencesOne() {
        ArrayService arrayService = new ArrayService();
        int[] arrayTest = {1, 2, 3, 4};
        testCountOccurrences(arrayService.countOccurrences(arrayTest, 1), 1, "TestCountOccurrencesOne");

    }

    void countOccurrencesTwo() {
        ArrayService arrayService = new ArrayService();
        int[] arrayTest = {2, 2, 1, 4};
        testCountOccurrences(arrayService.countOccurrences(arrayTest, 2), 2, "TestCountOccurrencesTwo");

    }

    void countOccurrencesThree() {
        ArrayService arrayService = new ArrayService();
        int[] arrayTest = {2, 2, 2, 4};
        testCountOccurrences(arrayService.countOccurrences(arrayTest, 2), 3, "TestCountOccurrencesThree");

    }

    void countOccurrencesFour() {
        ArrayService arrayService = new ArrayService();
        int[] arrayTest = {3, 3, 3, 3};
        testCountOccurrences(arrayService.countOccurrences(arrayTest, 3), 4, "TestCountOccurrencesFour");

    }

    void testCountOccurrences(int realResult, int expectedResult, String name) {
        if (expectedResult == realResult) {
            System.out.println(name + " = OK");
        } else {
            System.out.println(name + " = FAIL");
        }
    }





}

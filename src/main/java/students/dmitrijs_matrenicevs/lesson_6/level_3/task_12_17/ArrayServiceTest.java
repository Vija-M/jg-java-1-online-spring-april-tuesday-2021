package students.dmitrijs_matrenicevs.lesson_6.level_3.task_12_17;

import java.util.Arrays;

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
        arrayServiceTest.replaceOne();
        arrayServiceTest.replaceTwo();
        arrayServiceTest.replaceAllOne();
        arrayServiceTest.replaceAllTwo();
        arrayServiceTest.replaceAllThree();
        arrayServiceTest.reverseTest();

    }

    //TASK12

    void arrayServiceTestPositiveOne() {
        int[] arrayTest = {1, 2, 3, 4};
        testResult(arrayService.contains(arrayTest, 1), "TestPositiveOne");

    }

    void arrayServiceTestPositiveTwo() {
        int[] arrayTest = {1, 2, 3, 4};
        testResult(arrayService.contains(arrayTest, 2), "TestPositiveTwo");

    }

    void arrayServiceTestNegativeOne() {
        int[] arrayTest = {1, 2, 3, 4};
        testResult(arrayService.contains(arrayTest, 3), "TestNegativeOne");

    }

    void arrayServiceTestNegativeTwo() {
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
        int[] arrayTest = {1, 2, 3, 4};
        testCountOccurrences(arrayService.countOccurrences(arrayTest, 1), 1, "TestCountOccurrencesOne");

    }

    void countOccurrencesTwo() {
        int[] arrayTest = {2, 2, 1, 4};
        testCountOccurrences(arrayService.countOccurrences(arrayTest, 2), 2, "TestCountOccurrencesTwo");

    }

    void countOccurrencesThree() {
        int[] arrayTest = {2, 2, 2, 4};
        testCountOccurrences(arrayService.countOccurrences(arrayTest, 2), 3, "TestCountOccurrencesThree");

    }

    void countOccurrencesFour() {
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

    //TASK14

    void replaceOne() {
        int[] arrayTest = {2, 2, 2, 2};
        replaceTest(arrayService.replaceFirst(arrayTest, 2, 1), "TestReplaceOne");

    }

    void replaceTwo() {
        int[] arrayTest = {4, 4, 4, 4};
        replaceTest(arrayService.replaceFirst(arrayTest, 4, 2), "TestReplaceTwo");

    }

    void replaceTest(boolean realResult, String name) {
        if (realResult) {
            System.out.println(name + " = OK");
        } else {
            System.out.println(name + " = FAIL");
        }
    }

    //TASK15

    void replaceAllOne() {
        int[] arrayTest = {1, 2, 3, 4};
        int[] expectedResult = {1, 2, 3, 4};
        replaceAllOneResultInt(0,arrayService.replaceAll(arrayTest, 5, 0), "TestReplaceAllOne");
        testReplaceAll(arrayTest, expectedResult, "TestReplaceAllOne");
    }

    void replaceAllTwo() {
        int[] arrayTest = {1, 2, 3, 4};
        int[] expectedResult = {1, 2, 3, 5};
        replaceAllOneResultInt(1,arrayService.replaceAll(arrayTest, 4, 5), "TestReplaceAllTwo");
        testReplaceAll(arrayTest, expectedResult, "TestReplaceAllTwo");
    }

    void replaceAllThree() {
        int[] arrayTest = {1, 1, 1, 1};
        int[] expectedResult = {2, 2, 2, 2};
        replaceAllOneResultInt(4,arrayService.replaceAll(arrayTest, 1, 2), "TestReplaceAllThree");
        testReplaceAll(arrayTest, expectedResult, "TestReplaceAllThree");
    }

    void replaceAllOneResultInt(int expectedResult, int realResult, String name) {
        if (expectedResult == realResult) {
            System.out.println(name + " = OK");
        } else {
            System.out.println(name + " = FAIL");
        }
    }

    void testReplaceAll(int[] realResult, int[] expectedResult, String name) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(name + " = OK");
        } else {
            System.out.println(name + " = FAIL");
        }
    }

    //TASK16

    void reverseTest() {
        int[] arrayTest = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 4, 3, 2, 1};
        arrayService.reverse(arrayTest);
        testReverse(arrayTest, expectedResult);
    }

    void testReverse(int[] realResult, int[] expectedResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("TestReverse" + " = OK");
        } else {
            System.out.println("TestReverse" + " = FAIL");
        }
    }

}

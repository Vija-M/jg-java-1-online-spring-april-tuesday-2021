package students.dmitrijs_matrenicevs.lesson_5.level_6.task_34_38;

class ArraysTest {

    Arrays arrays = new Arrays();


    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        arraysTestOne();
        arraysTestTwo();
        arraysTestThree();

    }


    void arraysTestOne() {
        testArrays(4, "arraysTestOne");
    }

    void arraysTestTwo() {
        testArrays(6, "arraysTestTwo");
    }

    void arraysTestThree() {
        testArrays(11, "arraysTestThree");
    }


    void shouldFindMaxNumber() {
        int[] numberMax = {1,2,3,4,5};
        testFindMax(numberMax);
    }

    public void shouldFindMinNumber() {
        int[] numberMin = {1,2,3,4,5};
        int realResult = arrays.findMin(numberMin);
        testFindMin (realResult);
    }


    void testArrays(int expectedResult, String name) {

        int[] arrayCre = arrays.create(expectedResult);
        int realResult = arrayCre.length;
        if (realResult == expectedResult) {
            System.out.println(name + " = " + "OK");
        } else {
            System.out.println(name + " = " + "FAIL");
        }
    }

    void testFindMax(int[] numberMax){
        int realResult = arrays.findMax(numberMax);
        if (realResult == 5) {
            System.out.println("testFindMaxNumber" + " = " + "OK");
        }
        else {
            System.out.println("testFindMaxNumber" + " = " + "FAIL");
        }


    }

    void testFindMin(int expectedResult){
        if (1 == expectedResult) {
            System.out.println("testFindMinNumber" + " = " + "OK");
        }
        else {
            System.out.println("testFindMinNumber" + " = " + "FAIL");
        }


    }


}

package students.dmitrijs_matrenicevs.lesson_5.level_6.task_34_38;

class ArraysTest {

    Arrays arrays = new Arrays();


    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
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
        int[] numbersMax = {1,2,3,4,5};
        testFindMax(5, numbersMax, "testFndMaxNumber");
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

    void testFindMax (int expectedResult, int[] numbersMax, String name){
        int realResult = arrays.findMax(numbersMax);
        if (realResult == expectedResult) {
            System.out.println(name + " = " + "OK");
        }
        else {
            System.out.println(name + " = " + "FAIL");
        }


    }


}

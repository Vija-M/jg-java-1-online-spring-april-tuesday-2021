package students.dmitrijs_matrenicevs.lesson_5.level_5.task_31;

class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        arraysTestOne();
        arraysTestTwo();
        arraysTestThree();

    }


    void arraysTestOne (){
        testArrays (4, "arraysTestOne");
    }

    void arraysTestTwo (){
        testArrays (6, "arraysTestTwo");
    }

    void arraysTestThree (){
        testArrays (11, "arraysTestThree");
    }


    void testArrays(int expectedResult, String name){
        Arrays arrays = new Arrays();
        int[] arrayCre = arrays.create(expectedResult);
        int realResult = arrayCre.length;
        if (realResult == expectedResult) {
            System.out.println(name + " = " + "OK");
        }
        else {
            System.out.println(name + " = " + "FAIL");
        }
    }


}

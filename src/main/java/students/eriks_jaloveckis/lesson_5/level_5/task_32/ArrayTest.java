package students.eriks_jaloveckis.lesson_5.level_5.task_32;

class ArrayTest {

    public static void main(String[] args) {
        ArrayTest test = new ArrayTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        testFirst();
        testSecond();
        testThird();
    }

    public void assertTheTest(int expected, String testName){
        Array array = new Array();
        int[] testArray = array.create(expected);
        int realResult = testArray.length;
        if (expected == realResult){
            System.out.println(testName + " IS OK!");
        }
        else {
            System.out.println(testName + " FAIL!");
        }
    }

    void testFirst(){
        assertTheTest(4,"Test 1");
    }
    void testSecond(){
        assertTheTest(5, "Test 2");
    }
    void testThird(){
        assertTheTest(6, "Test 3");
    }

}

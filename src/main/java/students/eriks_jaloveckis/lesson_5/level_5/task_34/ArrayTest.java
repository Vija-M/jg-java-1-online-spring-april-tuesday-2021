package students.eriks_jaloveckis.lesson_5.level_5.task_34;

class ArrayTest {
    public static void main(String[] args) {
        ArrayTest test = new ArrayTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        testFirst();
        testSecond();
        testThird();
    }

    public void shouldFindMaxNumber() {
        testMaxFirst();
    }

    public void assertTheTest(int expected, String testName) {
        Array array = new Array();
        int[] testArray = array.create(expected);
        int realResult = testArray.length;
        if (expected == realResult) {
            System.out.println(testName + " IS OK!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }

    void testFirst() {
        assertTheTest(4, "Test 1");
    }

    void testSecond() {
        assertTheTest(5, "Test 2");
    }

    void testThird() {
        assertTheTest(6, "Test 3");
    }

    public void assertMaxTest(int expected, String testName) {
        Array array = new Array();
        int[] testMaxArray = {1, 2, 3, 4, 5};
        int realResult = array.findMax(testMaxArray);
        if (expected == realResult) {
            System.out.println(testName + " IS OK!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }

    void testMaxFirst(){
        assertMaxTest(5, "Test 1 max");
    }

}

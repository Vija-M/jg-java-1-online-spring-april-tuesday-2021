package students.eriks_jaloveckis.lesson_5.level_5.task_34;

class ArrayTest {
    public static void main(String[] args) {
        ArrayTest test = new ArrayTest();
        test.shouldCreateArray();
        test.findMinMax();

    }

    public void shouldCreateArray() {
        testCreate();
    }

    public void findMinMax() {
        testMin();
        testMax();
    }

    void testCreate() {
        Array array = new Array();
        assertEqual(array.create(4).length, 4, "test 1");
    }

    void testMax() {
        Array array = new Array();
        assertEqual(array.findMax(new int[]{1, 2, 3, 6, 8}), 8, "max");
    }

    void testMin() {
        Array array = new Array();
        assertEqual(array.findMin(new int[]{-3, -2, -1, 0, 1, 2, 3}), -3, "min");
    }

    public void assertEqual(int actual, int expected, String testName) {
        if (actual == expected) {
            System.out.println(testName + " IS OK!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }
}

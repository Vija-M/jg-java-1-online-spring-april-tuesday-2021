package students.vija_m.lesson_5.level_5.task_31_32;


class ArraysTest {
    public static void main(String[] args) {
        ArraysTest arraysTest = new ArraysTest();
        arraysTest.test1();
        arraysTest.test2();
    }

    public void test1() {
        int length = 25;
        int expected = 25;
        int actual = Arrays.create(length);
        if (expected == actual) {
            System.out.println("Test1 = OK");
        } else {
            System.out.println("Test1 = FAIL");
        }
    }

    public void test2() {
        Arrays arrays = new Arrays();
        int length = 1;
        int expected = 1;
        int actual = arrays.create(length);
        if (expected == actual) {
            System.out.println("Test2 = OK");
        } else {
            System.out.println("Test2 = FAIL");
        }
    }

}

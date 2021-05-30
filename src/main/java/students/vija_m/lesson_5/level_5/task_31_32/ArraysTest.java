package students.vija_m.lesson_5.level_5.task_31_32;


class ArraysTest {
    Arrays arrays = new Arrays();

    public static void main(String[] args) {
        ArraysTest arraysTest = new ArraysTest();
        arraysTest.test1();
        arraysTest.test2();
    }

    public void test1() {
        int[] numbers = arrays.create(25);
        int expected = 25;
        int actual = numbers.length;
        if (expected == actual) {
            System.out.println("Test1 = OK");
        } else {
            System.out.println("Test1 = FAIL");
        }
    }


    public void test2() {
        int[] numbers = arrays.create(1);
        int expected = 1;
        int actual = numbers.length;
        if (expected == actual) {
            System.out.println("Test1 = OK");
        } else {
            System.out.println("Test1 = FAIL");
        }
    }

}

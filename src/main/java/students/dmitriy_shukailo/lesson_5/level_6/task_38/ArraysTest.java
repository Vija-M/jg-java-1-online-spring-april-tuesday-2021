package students.dmitriy_shukailo.lesson_5.level_6.task_38;

class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        Arrays arrays = new Arrays();

        int[] array = arrays.create(5);
        int expected = 5;
        int actual = array.length;
        if (expected == actual) {
            System.out.println("Test length of array: OK");
        } else {
            System.out.println("Test length of array: FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        Arrays arrays = new Arrays();
        int[] array = {1, 3, 5, 7, 9};
        int expected = 9;
        int actual = arrays.findMax(array);
        if (expected == actual) {
            System.out.println("Test max of array: OK");
        } else {
            System.out.println("Test max of array: FAIL");
        }
    }

    public void shouldFindMinNumber() {
        Arrays arrays = new Arrays();
        int[] array = {1, 3, 5, 7, 9};
        int expected = 1;
        int actual = arrays.findMin(array);
        if (expected == actual) {
            System.out.println("Test min of array: OK");
        } else {
            System.out.println("Test min of array: FAIL");
        }

    }

}
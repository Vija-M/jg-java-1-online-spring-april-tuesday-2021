package students.dmitriy_shukailo.lesson_5.Level_5.task_32;

class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        Arrays arrays = new Arrays();

        int[] array = arrays.create(10);
        int expected = 10;
        int actual = array.length;
        if (expected == actual) {
            System.out.println("Test length of array: OK");
        } else {
            System.out.println("Test length of array: FAIL");
        }
    }

}
package students.arturs_arutjunovs.lesson_5.level_5.task_32;

class ArraysTest {
    public static void main(String[] args) {

        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        Arrays arrays = new Arrays();

        int[] arr = arrays.create(5);
        int expectedResult = 5;
        int actualResult = arr.length;
        if (expectedResult == actualResult) {
            System.out.println("[OK] - test passed");
        } else {
            System.out.println("[FAILED] - wrong number");
        }
    }
}

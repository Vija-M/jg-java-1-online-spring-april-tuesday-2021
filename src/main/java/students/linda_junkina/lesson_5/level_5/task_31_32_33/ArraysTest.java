package students.linda_junkina.lesson_5.level_5.task_31_32_33;


class ArraysTest {
    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int length = 3;
        int expectedResult = length;
        Arrays array = new Arrays();
        int realResult = array.create(length);
        if (realResult == expectedResult) {
            System.out.println("Array test = OK");
        } else {
            System.out.println("Array test = FAIL");
        }
    }
}

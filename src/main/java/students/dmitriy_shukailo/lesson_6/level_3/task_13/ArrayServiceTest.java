package students.dmitriy_shukailo.lesson_6.level_3.task_13;

public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();

        test.countOccurrencesZero();
        test.countOccurrencesOnce();
        test.countOccurrencesTwice();
//        test.notContains();
    }

    public void countOccurrencesZero() {
        ArrayService arrayService = new ArrayService();
        int count = arrayService.countOccurrences(new int[]{1, 2, 3, 4, 5, 3, -7}, 11);
        checkTest(count == 0, "Array doesn't contains searched number: ");
    }

    public void countOccurrencesOnce() {
        ArrayService arrayService = new ArrayService();
        int count = arrayService.countOccurrences(new int[]{1, 2, 3, 4, 5, 3, -7}, -7);
        checkTest(count == 1, "Array contains searched number once: ");
    }

    public void countOccurrencesTwice() {
        ArrayService arrayService = new ArrayService();
        int count = arrayService.countOccurrences(new int[]{1, 2, 0, 4, 5, 0, -7}, 0);
        checkTest(count == 2, "Array contains searched number twice: ");
    }

    private void checkTest(boolean condition, String test) {
        if (condition) {
            System.out.println(test + " = OK!");
        } else {
            System.out.println(test + " = FAIL!");
        }
    }

}
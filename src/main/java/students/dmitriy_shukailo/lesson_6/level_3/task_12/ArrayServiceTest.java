package students.dmitriy_shukailo.lesson_6.level_3.task_12;

public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();

        test.containsPositive();
        test.containsZero();
        test.containsNegative();
        test.notContains();
    }

    public void containsPositive() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1, 2, 3, 4, 5, 0, -7}, 3);
        checkTest(contains, "Array contains positive number");
    }

    public void containsZero() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1, 2, 3, 4, 5, 0, -7}, 0);
        checkTest(contains, "Array contains zero");
    }

    public void containsNegative() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1, 2, 3, 4, 5, 0, -7}, -7);
        checkTest(contains, "Array contains negative number");
    }

    public void notContains() {
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1, 2, 3, 4, 5, 0, -7}, 9);
        checkTest(!contains, "Array not contains needed number");
    }

    private void checkTest(boolean condition, String test) {
        if (condition) {
            System.out.println(test + " = OK!");
        } else {
            System.out.println(test + " = FAIL!");
        }
    }

}
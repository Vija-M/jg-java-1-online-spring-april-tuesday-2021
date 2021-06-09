package students.dmitriy_shukailo.lesson_6.level_3.task_14;

class ArrayServiceTest {

    ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();

        test.notReplaceFirst();
        test.replaceFirstZero();
        test.replaceFirstPositive();
        test.replaceFirstNegative();
    }

    public void notReplaceFirst() {
        boolean replaceFirst = arrayService.replaceFirst(new int[]{1, 2, 3, 4, 5, 3, -7}, 0, 15);
        checkTest(!replaceFirst, "Array doesn't contains replaced number: ");
    }

    public void replaceFirstZero() {
        boolean replaceFirst = arrayService.replaceFirst(new int[]{0, 1, 2, 3, 4, 5, 3, -7}, 0, 15);
        checkTest(replaceFirst, "Array contains replaced zero : ");
    }

    public void replaceFirstPositive() {
        boolean replaceFirst = arrayService.replaceFirst(new int[]{0, 1, 2, 3, 4, 5, 3, -7}, 3, 15);
        checkTest(replaceFirst, "Array contains replaced positive number : ");
    }

    public void replaceFirstNegative() {
        boolean replaceFirst = arrayService.replaceFirst(new int[]{0, 1, 2, 3, 4, 5, 3, -7}, -7, 15);
        checkTest(replaceFirst, "Array contains replaced negative number : ");
    }

    private void checkTest(boolean condition, String test) {
        if (condition) {
            System.out.println(test + " = OK!");
        } else {
            System.out.println(test + " = FAIL!");
        }
    }

}
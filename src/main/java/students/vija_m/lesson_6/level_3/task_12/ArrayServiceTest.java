package students.vija_m.lesson_6.level_3.task_12;


import java.util.Objects;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1() {
        ArrayService service = new ArrayService();
        boolean contains = service.contains(new int[]{2, 3, 6, 121, -4}, -4);
        checkTestResult(Objects.equals(contains, true), "Contains negative number");
    }

    public void test2() {
        ArrayService service = new ArrayService();
        boolean contains = service.contains(new int[]{2, 3, 0, 6, 121, -4}, 0);
        checkTestResult(Objects.equals(contains, true), "Contains zero");
    }

    public void test3() {
        ArrayService service = new ArrayService();
        boolean contains = service.contains(new int[]{2, 3, 0, 6, 121, -4}, 121);
        checkTestResult(Objects.equals(contains, true), "Contains positive number");
    }


    public void test4() {
        ArrayService service = new ArrayService();
        boolean contains = service.contains(new int[]{2, 3, 0, 6, 121, -4}, 19);
        checkTestResult(Objects.equals(contains, false), "Doesn't contain a number");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}

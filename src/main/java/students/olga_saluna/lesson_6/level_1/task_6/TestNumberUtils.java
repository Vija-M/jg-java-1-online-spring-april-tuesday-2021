package students.olga_saluna.lesson_6.level_1.task_6;

class TestNumberUtils {
    public static void main(String[] args) {
        TestNumberUtils subject = new TestNumberUtils();
        subject.scenario1();
        subject.scenario2();
        subject.scenario3();
    }

    void scenario1() {
        assertTrue(NumberUtils.isEven(1) == false, "scenario1");
    }

    void scenario2() {
        assertTrue(NumberUtils.isEven(2) == true, "scenario2");
    }

    void scenario3() {
        assertTrue(NumberUtils.isEven(0) == true, "scenario2");
    }

    void assertTrue(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}

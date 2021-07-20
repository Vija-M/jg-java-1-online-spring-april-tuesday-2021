package students.jevgenij_leshkevich.lesson_6.level_1.task_6;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest testRunner = new NumberUtilsTest();
        testRunner.scenario1();
        testRunner.scenario2();
        testRunner.scenario3();
        testRunner.scenario4();
        testRunner.scenario5();
    }

    void scenario1() {
        NumberUtils subject = new NumberUtils();
        int number = 8;
        boolean expected = true;
        boolean actual = subject.isEven(number);
        assertThatEqual(expected, actual, "checking positive even number");
    }

    void scenario2() {
        NumberUtils subject = new NumberUtils();
        int number = 7;
        boolean expected = false;
        boolean actual = subject.isEven(number);
        assertThatEqual(expected, actual, "checking positive odd number");
    }

    void scenario3() {
        NumberUtils subject = new NumberUtils();
        int number = 0;
        boolean expected = true;
        boolean actual = subject.isEven(number);
        assertThatEqual(expected, actual, "checking null");
    }

    void scenario4() {
        NumberUtils subject = new NumberUtils();
        int number = -10;
        boolean expected = true;
        boolean actual = subject.isEven(number);
        assertThatEqual(expected, actual, "checking negative even number");
    }

    void scenario5() {
        NumberUtils subject = new NumberUtils();
        int number = -19;
        boolean expected = false;
        boolean actual = subject.isEven(number);
        assertThatEqual(expected, actual, "checking negative odd number");
    }

    void assertThatEqual(boolean expected, boolean actual, String description) {
        if (expected == actual) {
            System.out.println("[ OK ] : " + description);
        } else {
            System.out.println("[ FAIL ] : " + description + ". Expected - " + expected + ", but was - " + actual + ".");
        }

    }

}

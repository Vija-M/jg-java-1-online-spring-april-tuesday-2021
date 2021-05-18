package instructor.lesson_4.test;

class QuickMathTest {

    public static void main(String[] args) {
        QuickMathTest testRunner = new QuickMathTest();
        testRunner.scenario1();
        testRunner.scenario2();
        testRunner.scenario3();
    }

    // A should be greater than B
    void scenario1() {
        QuickMath subject = new QuickMath();

        int a = 10;
        int b = 5;

        int expected = a;
        int actual = subject.max(a, b);

        assertThatEqual(expected, actual, "A should be greater than B - big difference");
    }

    // A should be greater than B
    void scenario2() {
        QuickMath subject = new QuickMath();

        int a = 20;
        int b = 19;

        int expected = a;
        int actual = subject.max(a, b);

        assertThatEqual(expected, actual, "A should be greater than B - small difference");
    }

    // B should be greater than A
    void scenario3() {
        QuickMath subject = new QuickMath();

        int a = 0;
        int b = 5;

        int expected = b;
        int actual = subject.max(a, b);

        assertThatEqual(expected, actual, "B should be greater than A - big difference");
    }

    void assertThatEqual(int expected, int actual, String description) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + description);
        } else {
            System.out.println("[FAIL]: " + description + ". Expected " + expected + ", but was " + actual);
        }
    }
}

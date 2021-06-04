package students.linda_junkina.lesson_6.level_1.task_6;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.scenario1();
        numberUtilsTest.scenario2();
    }

    NumberUtils subject = new NumberUtils();

    void scenario1() {
        int a = 8;

        boolean expected = true;
        boolean actual = subject.isEven(a);
        assertEqual(subject.isEven(8),true,"scenario1");

    }

    void scenario2() {
        int a = 5;

        boolean expected = false;
        boolean actual = subject.isEven(a);
        assertEqual(subject.isEven(5),false,"scenario2");
    }

    private void assertEqual(boolean a, boolean b, String testName) {
        if (a == b) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}

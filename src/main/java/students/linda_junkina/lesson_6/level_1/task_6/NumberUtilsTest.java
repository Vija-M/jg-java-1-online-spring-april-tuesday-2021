package students.linda_junkina.lesson_6.level_1.task_6;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();
        System.out.println(numberUtils.isEven(8));
        System.out.println(numberUtils.isEven(5));

        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.scenario1();
        numberUtilsTest.scenario1();
    }

    void scenario1() {
        NumberUtils number = new NumberUtils();

        int a = 8;

        boolean expected = true;
        boolean actual = number.isEven(a);
    }

    void scenario2() {
        NumberUtils number = new NumberUtils();

        int a = 5;

        boolean expected = false;
        boolean actual = number.isEven(a);
    }
}
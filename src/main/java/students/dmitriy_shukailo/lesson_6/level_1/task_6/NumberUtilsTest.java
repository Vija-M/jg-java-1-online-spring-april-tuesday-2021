package students.dmitriy_shukailo.lesson_6.level_1.task_6;

class NumberUtilsTest {

    public static void main(String[] args) {

        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();
    }

    public void isEvenTest() {
        int number = 10;
        boolean expectedResult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }

}
package students.antons_korenevskis.lesson_6.level_1;


import java.util.Objects;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest1();
        numberUtilsTest.isEvenTest2();
        numberUtilsTest.isEvenTest3();
    }

    public void isEvenTest1() {
        NumberUtils numberUtils = new NumberUtils();
        int number = 10;
        boolean expectedResult = true;
        boolean realResult = numberUtils.isEven(number);
        if (Objects.equals(realResult, expectedResult)){
            System.out.println("TEST OK");
        } else {
            System.out.println("FAIL");
        }

    }

    public void isEvenTest2() {
        NumberUtils numberUtils = new NumberUtils();
        int number = 11;
        boolean expectedResult = false;
        boolean realResult = numberUtils.isEven(number);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("TEST OK");
        } else {
            System.out.println("FAIL");
        }

    }

    public void isEvenTest3() {
        NumberUtils numberUtils = new NumberUtils();
        int number = 0;
        boolean expectedResult = true;
        boolean realResult = numberUtils.isEven(number);
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("TEST OK");
        } else {
            System.out.println("FAIL");
        }

    }
}

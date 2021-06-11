package students.sergej_pereligin.lesson_6.level_1;

public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.test1();
        numberUtilsTest.test2();
    }

    void assertEqualTest(boolean result, boolean expected, String testName) {
        if (result == expected) {
            System.out.println(testName + "   OK");
        } else {
            System.out.println(testName + "   False");
        }
    }
    public void test1(){
        NumberUtils numberUtils=new NumberUtils();
        assertEqualTest(numberUtils.isEven(40),true,"test1");
    }
    public void test2(){
        NumberUtils numberUtils= new NumberUtils();
        assertEqualTest(numberUtils.isEven(41),false,"test2" );
    }


}

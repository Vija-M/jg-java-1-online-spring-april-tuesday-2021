package students.vija_m.lesson_4.level_7.task_18;


class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest yearTest = new LeapYearTest();
        yearTest.test1();
        yearTest.test2();
        yearTest.test3();
        yearTest.test4();
    }

    public void test1() {
        LeapYear year = new LeapYear();
        int number = 2000;
        boolean expectedResult = true;
        Boolean realResult = year.isLeapYear(number);
        if (realResult == expectedResult) {
            System.out.println("400 test         = OK");
        } else {
            System.out.println("400 test         = FAIL");
        }
    }

    public void test2() {
        LeapYear year = new LeapYear();
        int number = 2100;
        boolean expectedResult = false;
        Boolean realResult = year.isLeapYear(number);
        if (realResult == expectedResult) {
            System.out.println("100 test         = OK");
        } else {
            System.out.println("100 test         = FAIL");
        }
    }

    public void test3() {
        LeapYear year = new LeapYear();
        int number = 2020;
        boolean expectedResult = true;
        Boolean realResult = year.isLeapYear(number);
        if (realResult == expectedResult) {
            System.out.println("4 years test     = OK");
        } else {
            System.out.println("4 years test     = FAIL");
        }
    }

    public void test4() {
        LeapYear year = new LeapYear();
        int number = 2022;
        boolean expectedResult = false;
        Boolean realResult = year.isLeapYear(number);
        if (realResult == expectedResult) {
            System.out.println("Not 4 years test = OK");
        } else {
            System.out.println("Not 4 years test = FAIL");
        }
    }
}

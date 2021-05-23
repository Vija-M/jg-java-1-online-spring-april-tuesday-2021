package students.ernests_subhankulovs.lesson_4.level_7.task_18;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.leapYearTest1();
        leapYearTest.leapYearTest2();
        leapYearTest.normalYearTest1();
        leapYearTest.normalYearTest2();
    }

    public void leapYearTest1() {
        leapYearTestAssert("Leap year that cannot be divided by 100 test", 1996, true);
    }

    public void leapYearTest2() {
        leapYearTestAssert("Leap year (can be divided by 4 and 400) test", 2000, true);
    }

    public void normalYearTest1() {
        leapYearTestAssert("Ordinary year (cannot be divided by 4) test", 1999, false);
    }

    public void normalYearTest2() {
        leapYearTestAssert("Ordinary year (can be divided by 4 and by 100 but not by 400) test", 1900, false);
    }

    public void leapYearTestAssert(String testName, int year, boolean expectedResult) {
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println(testName + " (Year " + year + " is a leap year = " + expectedResult + ") = OK");
        } else {
            System.out.println(testName + " (Year " + year + " is a leap year = " + expectedResult + ") = FAIL");
        }
    }
}

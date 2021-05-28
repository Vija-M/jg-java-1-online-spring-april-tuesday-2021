package students.dmitrijs_matrenicevs.lesson_4.level_7.task_18;

class LeapYearTest {

    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();

        leapYearTest.yearTestOne();
        leapYearTest.yearTestTwo();
        leapYearTest.yearTestThree();
        leapYearTest.yearTestFour();

    }

    void yearTestOne() {
        yearTestFinal("100", 1876, true);
    }

    void yearTestTwo() {
        yearTestFinal("4 и 400", 4000, true);
    }

    void yearTestThree() {
        yearTestFinal("4", 2999, false);
    }

    void yearTestFour() {
        yearTestFinal("4, 100, 400", 1700, false);
    }

    void yearTestFinal(String name, int year, boolean expectedResult) {
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(year);
        if (expectedResult == realResult) {
            System.out.println(name + " = OK");
        } else {
            System.out.println(name + " = FAIL");
        }
    }
}

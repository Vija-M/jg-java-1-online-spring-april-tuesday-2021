package students.arturs_arutjunovs.lesson_4.level_7.task_18;

class LeapYearTest {
    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.leapYearScenario_1();
        leapYearTest.leapYearScenario_2();   //not a leap year
        leapYearTest.leapYearScenario_3();
        leapYearTest.leapYearScenario_4();
        leapYearTest.leapYearScenario_5();
        leapYearTest.leapYearScenario_6();   //not a leap year

    }

    void leapYearScenario_1() {
        LeapYear leapYear = new LeapYear();
        int year = 2000;
        assertCheckYearLeap(leapYear.isLeapYear(year), "Scenario_1");
    }

    void leapYearScenario_2() {
        LeapYear leapYear = new LeapYear();
        int year = 2001;
        assertCheckYearLeap(leapYear.isLeapYear(year), "Scenario_2");
    }

    void leapYearScenario_3() {
        LeapYear leapYear = new LeapYear();
        int year = 2004;
        assertCheckYearLeap(leapYear.isLeapYear(year), "Scenario_3");
    }

    void leapYearScenario_4() {
        LeapYear leapYear = new LeapYear();
        int year = 2020;
        assertCheckYearLeap(leapYear.isLeapYear(year), "Scenario_4");
    }

    void leapYearScenario_5() {
        LeapYear leapYear = new LeapYear();
        int year = 2024;
        assertCheckYearLeap(leapYear.isLeapYear(year), "Scenario_5");
    }

    void leapYearScenario_6() {
        LeapYear leapYear = new LeapYear();
        int year = 2025;
        assertCheckYearLeap(leapYear.isLeapYear(year), "Scenario_6");
    }

    void assertCheckYearLeap(boolean actualResult, String description) {
        if (actualResult) {
            System.out.println("[TEST OK]: " + description + " passed. Leap year is presented");
        } else {
            System.out.println("[TEST FAILED]: That`s is not a leap year, " + description + " not passed.\n" +
                    " Expected " + true + ", but presented " + false + ".");

        }
    }
}

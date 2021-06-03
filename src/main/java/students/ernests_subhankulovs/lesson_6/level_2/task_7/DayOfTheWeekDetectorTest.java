package students.ernests_subhankulovs.lesson_6.level_2.task_7;

class DayOfTheWeekDetectorTest {
    DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.mondayTest();
        dayOfTheWeekDetectorTest.tuesdayTest();
        dayOfTheWeekDetectorTest.wednesdayTest();
        dayOfTheWeekDetectorTest.thursdayTest();
        dayOfTheWeekDetectorTest.fridayTest();
        dayOfTheWeekDetectorTest.saturdayTest();
        dayOfTheWeekDetectorTest.sundayTest();
    }

    void mondayTest() {
        assertTestResult(1, "Monday","Monday test");
    }

    void tuesdayTest() {
        assertTestResult(2, "Tuesday","Tuesday test");
    }

    void wednesdayTest() {
        assertTestResult(3, "Wednesday","Wednesday test");
    }

    void thursdayTest() {
        assertTestResult(4, "Thursday","Thursday test");
    }

    void fridayTest() {
        assertTestResult(5, "Friday","Friday test");
    }

    void saturdayTest() {
        assertTestResult(6, "Saturday","Saturday test");
    }

    void sundayTest() {
        assertTestResult(7, "Sunday","Sunday test");
    }

    void assertTestResult(int dayNumber, String expectedResult, String testName) {
        String realResult = detector.findDayOfTheWeek(dayNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
            System.out.println("Day number: " + dayNumber + "; Day of the week: " + realResult);
        }
        else {
            System.out.println(testName + " = FAIL");
            System.out.println("Day number: " + dayNumber + "; Expected day of the week: " + expectedResult + "; Returned day of the week: " + realResult);
        }

    }
}

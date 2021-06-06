package students.eriks_jaloveckis.lesson_6.level_2;

public class DayOfTheWeekDetectorTest {
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

    public void assertWeek(int dayNumber, String expected, String testName) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String actual = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        if (expected.equals(actual)) {
            System.out.println("TEST " + testName + " IS OK!");
        } else {
            System.out.println("TEST " + testName + " IS FAIL!");
        }
    }

    public void mondayTest() {
        assertWeek(1, "Monday", "Monday");
    }

    public void tuesdayTest() {
        assertWeek(2, "Tuesday", "Tuesday");
    }

    public void wednesdayTest() {
        assertWeek(3, "Wednesday", "Wednesday");
    }

    public void thursdayTest() {
        assertWeek(4, "Thursday", "Thursday");
    }

    public void fridayTest() {
        assertWeek(5, "Friday", "Friday");
    }

    public void saturdayTest() {
        assertWeek(6, "Saturday", "Saturday");
    }

    public void sundayTest() {
        assertWeek(7, "Sunday", "Sunday");
    }
}

package students.antons_korenevskis.lesson_6.level_2;

public class DayOfTheWeekTest {
    public static void main(String[] args) {
        DayOfTheWeekTest dayOfTheWeekTest = new DayOfTheWeekTest();
        dayOfTheWeekTest.testMonday();
        dayOfTheWeekTest.testTuesday();
        dayOfTheWeekTest.testWednesday();
        dayOfTheWeekTest.testThursday();
        dayOfTheWeekTest.testFriday();
        dayOfTheWeekTest.testSaturday();
        dayOfTheWeekTest.testSunday();
        dayOfTheWeekTest.testWrong();
    }


    public void testMonday() {
        int dayNumber = 1;
        String expectedResult = "Monday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void testTuesday() {
        int dayNumber = 2;
        String expectedResult = "Tuesday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void testWednesday() {
        int dayNumber = 3;
        String expectedResult = "Wednesday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void testThursday() {
        int dayNumber = 4;
        String expectedResult = "Thursday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void testFriday() {
        int dayNumber = 5;
        String expectedResult = "Friday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void testSaturday() {
        int dayNumber = 6;
        String expectedResult = "Saturday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void testSunday() {
        int dayNumber = 7;
        String expectedResult = "Sunday";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void testWrong() {
        int dayNumber = 0;
        String expectedResult = "Not correct day number";
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }
}
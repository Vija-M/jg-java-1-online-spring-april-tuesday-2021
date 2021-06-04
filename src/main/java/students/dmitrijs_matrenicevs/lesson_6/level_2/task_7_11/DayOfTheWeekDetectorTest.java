package students.dmitrijs_matrenicevs.lesson_6.level_2.task_7_11;

 class DayOfTheWeekDetectorTest {

     public static void main(String[] args) {
         DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
         test.shouldReturnMonday();
         test.shouldReturnTuesday();
         test.shouldReturnWednesday();
         test.shouldReturnThursday();
         test.shouldReturnFriday();
         test.shouldReturnSaturday();
         test.shouldReturnSunday();
         test.shouldReturnDefault();
     }

     public void shouldReturnMonday() {
         DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
         String dayOfTheWeek = detector.findDayOfTheWeek(1);
         checkTestResult("Monday".equals(dayOfTheWeek));
     }

     public void shouldReturnTuesday() {
         DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
         String dayOfTheWeek = detector.findDayOfTheWeek(2);
         checkTestResult("Tuesday".equals(dayOfTheWeek));
     }

     public void shouldReturnWednesday() {
         DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
         String dayOfTheWeek = detector.findDayOfTheWeek(3);
         checkTestResult("Wednesday".equals(dayOfTheWeek));
     }

     public void shouldReturnThursday() {
         DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
         String dayOfTheWeek = detector.findDayOfTheWeek(4);
         checkTestResult("Thursday".equals(dayOfTheWeek));
     }

     public void shouldReturnFriday() {
         DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
         String dayOfTheWeek = detector.findDayOfTheWeek(5);
         checkTestResult("Friday".equals(dayOfTheWeek));
     }

     public void shouldReturnSaturday() {
         DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
         String dayOfTheWeek = detector.findDayOfTheWeek(6);
         checkTestResult("Saturday".equals(dayOfTheWeek));
     }

     public void shouldReturnSunday() {
         DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
         String dayOfTheWeek = detector.findDayOfTheWeek(7);
         checkTestResult("Sunday".equals(dayOfTheWeek));
     }

     public void shouldReturnDefault() {
         DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
         String dayOfTheWeek = detector.findDayOfTheWeek(8);
         checkTestResult("Default".equals(dayOfTheWeek));
     }

     private void checkTestResult(boolean condition) {
         if (condition) {
             System.out.println("Monday" + " = OK!");
         } else {
             System.out.println("Monday" + " = FAIL!");
         }
     }

}

package students.dmitrijs_matrenicevs.lesson_6.level_2.task_7_11;

 class DayOfTheWeekDetectorTest {

     public static void main(String[] args) {
         DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
         test.shouldReturnMonday();
     }

     public void shouldReturnMonday() {
         DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
         String dayOfTheWeek = detector.findDayOfTheWeek(1);
         checkTestResult("Monday".equals(dayOfTheWeek));
     }

     private void checkTestResult(boolean condition) {
         if (condition) {
             System.out.println("Monday" + " = OK!");
         } else {
             System.out.println("Monday" + " = FAIL!");
         }
     }

}

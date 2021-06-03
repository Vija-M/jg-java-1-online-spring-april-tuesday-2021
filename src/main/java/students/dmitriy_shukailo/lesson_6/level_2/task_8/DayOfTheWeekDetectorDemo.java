package students.dmitriy_shukailo.lesson_6.level_2.task_8;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {

        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);

        System.out.println(dayOfTheWeek);
    }

}
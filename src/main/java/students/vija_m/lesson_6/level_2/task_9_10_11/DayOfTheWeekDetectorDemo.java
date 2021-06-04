package students.vija_m.lesson_6.level_2.task_9_10_11;


class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);

        System.out.println(dayOfTheWeek);
    }
}

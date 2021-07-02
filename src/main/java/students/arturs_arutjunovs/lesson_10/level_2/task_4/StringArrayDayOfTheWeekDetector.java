package students.arturs_arutjunovs.lesson_10.level_2.task_4;

class StringArrayDayOfTheWeekDetector implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number <= 7 && number != 0) {
            return weekDays[number];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
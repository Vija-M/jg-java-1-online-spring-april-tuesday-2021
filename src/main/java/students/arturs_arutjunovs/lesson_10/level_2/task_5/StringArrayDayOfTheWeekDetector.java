package students.arturs_arutjunovs.lesson_10.level_2.task_5;

class StringArrayDayOfTheWeekDetector implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number <= 7 && number != 0) {
            return weekDays[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
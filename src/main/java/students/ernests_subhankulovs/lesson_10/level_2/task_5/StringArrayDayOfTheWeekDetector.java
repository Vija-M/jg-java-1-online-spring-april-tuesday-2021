package students.ernests_subhankulovs.lesson_10.level_2.task_5;

class StringArrayDayOfTheWeekDetector implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] daysOfTHeWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number >= 1 && number <= 7) {
            return daysOfTHeWeek[number - 1];
        }
        else {
            return "Please input a valid number between 1 and 7";
        }
    }
}

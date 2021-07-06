package students.dmitrijs_matrenicevs.lesson_10.level_2.task_4_5;

class StringDayOfTheWeekDetector implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] daysWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number <= 7 && number != 0) {
            return daysWeek[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}

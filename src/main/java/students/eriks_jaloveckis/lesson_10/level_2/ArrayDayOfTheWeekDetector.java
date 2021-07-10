package students.eriks_jaloveckis.lesson_10.level_2;

public class ArrayDayOfTheWeekDetector implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number >= 1 && number <= 7) {
            return daysOfTheWeek[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}

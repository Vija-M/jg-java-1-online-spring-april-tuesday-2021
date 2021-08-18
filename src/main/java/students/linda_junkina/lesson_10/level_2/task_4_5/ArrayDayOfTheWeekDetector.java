package students.linda_junkina.lesson_10.level_2.task_4_5;

class ArrayDayOfTheWeekDetector implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        String[] dayOfTheWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        if (number >= 1 && number <= 7) {
            return dayOfTheWeek[number - 1];
        } else {
            return "Invalid input, try again!";
        }
    }
}

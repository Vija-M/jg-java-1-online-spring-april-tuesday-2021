package students.linda_junkina.lesson_10.level_1.task_4_5;

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
        for (String day : dayOfTheWeek) {
            if (number == 1) {
                return dayOfTheWeek[0];
            } else if (number == 2) {
                return dayOfTheWeek[1];
            } else if (number == 3) {
                return dayOfTheWeek[2];
            } else if (number == 4) {
                return dayOfTheWeek[3];
            } else if (number == 5) {
                return dayOfTheWeek[4];
            } else if (number == 6) {
                return dayOfTheWeek[5];
            } else if (number == 7) {
                return dayOfTheWeek[6];
            }
        }
        return null;
    }
}

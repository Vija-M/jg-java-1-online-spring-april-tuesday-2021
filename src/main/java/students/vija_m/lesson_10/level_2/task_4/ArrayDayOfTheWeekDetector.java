package students.vija_m.lesson_10.level_2.task_4;

class ArrayDayOfTheWeekDetector implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        String[] DayOfTheWeek = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number > 0 && number < 8) {
            return DayOfTheWeek[number];
        } else {
            return "Please input a valid number between 1 and 7";
        }

    }
}


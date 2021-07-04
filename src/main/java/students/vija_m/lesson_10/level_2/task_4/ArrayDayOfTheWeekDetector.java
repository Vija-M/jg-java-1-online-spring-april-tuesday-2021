package students.vija_m.lesson_10.level_2.task_4;

class ArrayDayOfTheWeekDetector implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int i) {
        String[] DayOfTheWeek = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (i > 0 && i < 8) {
            return DayOfTheWeek[i];
        } else {
            return "Please input a valid number between 1 and 7";
        }

    }
}


package students.dmitriy_shukailo.lesson_10.level_2.task_5;

class ArrayDayOfTheWeekDetector implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] dayNameOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number >= 1 && number <= 7) {
            return dayNameOfWeek[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }

}
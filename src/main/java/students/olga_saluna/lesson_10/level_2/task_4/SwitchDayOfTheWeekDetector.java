package students.olga_saluna.lesson_10.level_2.task_4;

class SwitchDayOfTheWeekDetector implements DayOfTheWeekDetector {
    public String detectDayName(int dayNumber) {
        return switch (dayNumber) {
            case 1 -> ("Monday");
            case 2 -> ("Tuesday");
            case 3 -> ("Wednesday");
            case 4 -> ("Thursday");
            case 5 -> ("Friday");
            case 6 -> ("Saturday");
            case 7 -> ("Sunday");
            default -> ("Please input a valid number between 1 and 7");
        };
    }

    @Override
    public int detectDayName() {
        return 0;
    }
}

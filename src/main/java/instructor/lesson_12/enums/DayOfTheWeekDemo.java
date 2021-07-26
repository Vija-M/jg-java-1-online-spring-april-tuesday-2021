package instructor.lesson_12.enums;

class DayOfTheWeekDemo {

    public static final String MONDAY = "MONDAY";
    public static final String TUESDAY = "TUESDAY";
    public static final String WEDNESDAY = "WEDNESDAY";

    public static void main(String[] args) {

        String day = "MONDAY";

        switch (day) {
            case MONDAY:
                break;
            case TUESDAY:
                break;
            case WEDNESDAY:
                break;
        }

        DayOfTheWeek dayOfTheWeek = DayOfTheWeek.MONDAY;

        switch (dayOfTheWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
            case SUNDAY:
            case YET_DAY_OF_THE_WEEK:
                System.out.println("Yay");
            default:
                throw new IllegalStateException("Unexpected value: " + dayOfTheWeek);
        }
    }
}

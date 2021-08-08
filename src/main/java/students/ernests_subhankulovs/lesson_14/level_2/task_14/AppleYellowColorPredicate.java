package students.ernests_subhankulovs.lesson_14.level_2.task_14;

public class AppleYellowColorPredicate implements ApplePredicate  {
    public boolean test (Apple apple) {
        return "yellow".equals(apple.getColor());
    }
}

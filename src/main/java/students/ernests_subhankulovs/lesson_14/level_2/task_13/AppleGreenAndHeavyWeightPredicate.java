package students.ernests_subhankulovs.lesson_14.level_2.task_13;

public class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}

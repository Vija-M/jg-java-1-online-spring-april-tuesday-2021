package students.ernests_subhankulovs.lesson_14.level_2.task_14;

public class AppleHeavyWeightGreenColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return apple.getWeight() > 150 && apple.getColor().equals("green");
    }
}

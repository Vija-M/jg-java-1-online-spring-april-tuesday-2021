package students.ernests_subhankulovs.lesson_14.level_2.task_12;

class AppleLightWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return apple.getWeight() < 150;
    }
}

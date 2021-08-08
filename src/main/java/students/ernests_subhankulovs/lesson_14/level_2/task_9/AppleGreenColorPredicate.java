package students.ernests_subhankulovs.lesson_14.level_2.task_9;

class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor());
    }
}

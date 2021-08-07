package students.ernests_subhankulovs.lesson_14.level_2.task_10;

class AppleRedColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}
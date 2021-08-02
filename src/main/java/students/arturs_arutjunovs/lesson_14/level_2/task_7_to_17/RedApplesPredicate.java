package students.arturs_arutjunovs.lesson_14.level_2.task_7_to_17;

class RedApplesPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}

package students.arturs_arutjunovs.lesson_14.level_2.task_7_to_17;

class GreenApplesPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }

}

package students.dmitriy_shukailo.lesson_14.level_2.task_7_17;

class AppleYellowColorPredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        return "yellow".equals(apple.getColor());
    }

}
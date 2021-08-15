package students.dmitriy_shukailo.lesson_14.level_2.task_7_17;

class AppleHeavyWeightAndGreenColorPredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        return "green".equals(apple.getColor()) && apple.getWeight() > 150;
    }

}
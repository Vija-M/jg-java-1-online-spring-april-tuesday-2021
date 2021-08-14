package students.vija_m.lesson_14.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

public class AppleGreenColorHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor()) & apple.getWeight() > 150;
    }
}



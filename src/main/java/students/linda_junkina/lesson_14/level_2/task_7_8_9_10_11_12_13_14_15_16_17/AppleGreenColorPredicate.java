package students.linda_junkina.lesson_14.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}

class AppleRedColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}

class AppleHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() >= 150;
    }
}

class AppleLightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() <= 150;
    }
}

class AppleGreenAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return ("green".equals(apple.getColor()) && apple.getWeight() >= 150);
    }
}
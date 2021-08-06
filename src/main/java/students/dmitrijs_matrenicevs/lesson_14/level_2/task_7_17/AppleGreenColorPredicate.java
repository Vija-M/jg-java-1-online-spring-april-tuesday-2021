package students.dmitrijs_matrenicevs.lesson_14.level_2.task_7_17;

class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }

    static class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return "green".equals(apple.getColor())
                    && apple.getWeight() >= 150;
        }
    }

    static class AppleRedColorPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return "red".equals(apple.getColor);
        }
    }

    static class AppleHeavyWeightPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() >= 150;
        }
    }

    static class AppleLightWeightPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() <= 150;
        }
    }
}
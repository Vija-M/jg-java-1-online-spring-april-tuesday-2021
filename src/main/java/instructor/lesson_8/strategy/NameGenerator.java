package instructor.lesson_8.strategy;

import java.util.Random;

abstract class NameGenerator {

    private Random random;

    NameGenerator(Random random) {
        this.random = random;
    }

    public Random getRandom() {
        return random;
    }

    abstract String next();
}

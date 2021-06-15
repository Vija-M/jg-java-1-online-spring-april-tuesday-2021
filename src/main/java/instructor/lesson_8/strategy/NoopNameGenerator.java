package instructor.lesson_8.strategy;

import java.util.Random;

class NoopNameGenerator extends NameGenerator {

    public NoopNameGenerator(Random random) {
        super(random);
    }

    @Override
    String next() {
        return "NOOP";
    }
}

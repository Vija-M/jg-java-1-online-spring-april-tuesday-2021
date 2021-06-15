package instructor.lesson_8.strategy;

import java.util.Random;

class FemaleNameGenerator extends NameGenerator {

    private final String[] NAMES = {
            "VIJA",
            "OLGA",
            "LINDA"
    };

    FemaleNameGenerator(Random random) {
        super(random);
    }

    @Override
    String next() {
        return NAMES[getRandom().nextInt(NAMES.length)];
    }
}

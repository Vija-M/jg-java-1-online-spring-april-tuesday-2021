package instructor.lesson_8.strategy;

import java.util.Random;

class MaleNameGenerator extends NameGenerator {

    private final String[] NAMES = {
            "ARTUR",
            "ANTON",
            "JURA",
            "JEVGENIJ",
            "VLADIMIR",
            "ERNEST",
            "DMITRY",
            "SERGEY"
    };

    MaleNameGenerator(Random random) {
        super(random);
    }

    @Override
    String next() {
        return NAMES[getRandom().nextInt(NAMES.length)];
    }
}

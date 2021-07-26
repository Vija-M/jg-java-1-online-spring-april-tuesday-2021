package instructor.lesson_10.dependencyinjection;

import java.util.Random;

class RandomNumberGenerator implements NumberGenerator {

    @Override
    public int nextInt(int rightBound) {
        Random random = new Random();
        return random.nextInt(rightBound);
    }
}

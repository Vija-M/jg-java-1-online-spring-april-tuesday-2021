package students.ernests_subhankulovs.lesson_8.level_5.task_20;

import java.util.Random;

class Shapes {
    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle(random.nextDouble());
    }
}

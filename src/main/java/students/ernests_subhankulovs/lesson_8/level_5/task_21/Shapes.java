package students.ernests_subhankulovs.lesson_8.level_5.task_21;

import java.util.Random;

class Shapes {
    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle(random.nextDouble());
    }

    Square createRandomSquare() {
        return new Square(random.nextDouble());
    }
}

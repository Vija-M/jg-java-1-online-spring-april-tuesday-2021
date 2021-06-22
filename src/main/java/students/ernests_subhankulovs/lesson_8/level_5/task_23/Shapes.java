package students.ernests_subhankulovs.lesson_8.level_5.task_23;

import java.util.Random;

class Shapes {
    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle(random.nextDouble());
    }

    Square createRandomSquare() {
        return new Square(random.nextDouble());
    }

    Rectangle createRandomRectangle() {
        return new Rectangle(random.nextDouble(), random.nextDouble());
    }

    Triangle createRandomTriangle() {
        return new Triangle(random.nextDouble());
    }
}

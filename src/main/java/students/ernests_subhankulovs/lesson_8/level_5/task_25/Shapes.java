package students.ernests_subhankulovs.lesson_8.level_5.task_25;

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

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double area(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}

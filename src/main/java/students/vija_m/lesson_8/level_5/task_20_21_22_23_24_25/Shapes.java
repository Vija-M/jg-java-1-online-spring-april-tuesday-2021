package students.vija_m.lesson_8.level_5.task_20_21_22_23_24_25;

import java.util.Random;

public class Shapes {
    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle(random.nextDouble());
    }

    Square createRandomSquare() {
        return new Square(random.nextDouble());
    }

    Rectangle createRandomRectangle() {
        return new Rectangle(random.nextInt(), random.nextDouble());
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
        for ( Shape shape : shapes ) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}



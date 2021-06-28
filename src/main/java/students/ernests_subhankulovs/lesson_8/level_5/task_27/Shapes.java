package students.ernests_subhankulovs.lesson_8.level_5.task_27;

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
        return switch (rnd.nextInt(4)) {
            case (0) -> createRandomCircle();
            case (1) -> createRandomSquare();
            case (2) -> createRandomRectangle();
            default -> createRandomTriangle();
        };
    }

    double area(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }

    double perimeter(Shape[] shapes) {
        double totalPerimeters = 0;
        for (Shape shape : shapes) {
            totalPerimeters += shape.perimeter();
        }
        return totalPerimeters;
    }

    double area(Shape shape) {
        return shape.area();
    }

    double perimeter(Shape shape) {
        return shape.perimeter();
    }

    String calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    String calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}

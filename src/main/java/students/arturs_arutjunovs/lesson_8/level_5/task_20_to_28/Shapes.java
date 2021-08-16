package students.arturs_arutjunovs.lesson_8.level_5.task_20_to_28;

import java.util.Random;

class Shapes {

    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle(random.nextInt(10));
    }

    Rectangle createRandomRectangle() {
        return new Rectangle(random.nextInt(10), random.nextInt(10));
    }

    Triangle createRandomTriangle() {
        return new Triangle(random.nextInt(10));
    }

    Square createRandomSquare() {
        return new Square(random.nextInt(10));
    }

    Shape createRandomShape() {
        Random random = new Random();
        int randomNumber = random.nextInt(4);
        return switch (randomNumber) {
            case 0 -> createRandomCircle();
            case 1 -> createRandomSquare();
            case 2 -> createRandomRectangle();
            default -> createRandomTriangle();
        };
    }

    Circle createCircle() {
        return new Circle(7);
    }

    Square createSquare() {
        return new Square(5);
    }

    Rectangle createRectangle() {
        return new Rectangle(3, 5);
    }

    Triangle createTriangle() {
        return new Triangle(6);
    }

    double area(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calculateArea();
        }
        return area;
    }

    double perimeter(Shape[] shapes) {
        double perimeter = 0;
        for (Shape shape : shapes) {
            perimeter += shape.calculatePerimeter();
        }
        return perimeter;
    }

    double area(Shape shape) {
        return shape.calculateArea();
    }

    double perimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}

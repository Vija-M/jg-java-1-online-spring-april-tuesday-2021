package students.linda_junkina.lesson_8.level_5.task_20_21_22_23_24_25_26_27_28;

import java.util.Random;


class Shapes {
    //Task 20, 21, 22, 23
    Random rnd = new Random();

    Circle createRandomCircle() {
        return new Circle(rnd.nextInt(20));
    }

    Rectangle createRandomRectangle() {
        return new Rectangle(rnd.nextInt(20), rnd.nextInt(20));
    }

    Triangle createRandomTriangle() {
        return new Triangle(rnd.nextInt(20));
    }

    Square createRandomSquare() {
        return new Square(rnd.nextInt(20));
    }

    // Task 24
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



    Circle createCircle() {
        return new Circle(5);
    }

    Square createSquare() {
        return new Square(5);
    }

    Rectangle createRectangle() {
        return new Rectangle(2, 6);
    }

    Triangle createTriangle() {
        return new Triangle(6);
    }

    double area(Shape[] shapes) {
        double area = 0;
        int count = 1;
        for (Shape shape : shapes) {
            area += shape.calculateArea();
            count++;
        }
        return area;
    }

    double perimeter(Shape[] shapes) {
        double perimeter = 0;
        int count = 1;
        for (Shape shape : shapes) {
            perimeter += shape.calculatePerimeter();
            count++;
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


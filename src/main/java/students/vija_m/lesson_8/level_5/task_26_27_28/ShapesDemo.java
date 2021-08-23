package students.vija_m.lesson_8.level_5.task_26_27_28;

import java.util.Arrays;

public class ShapesDemo {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Shape circle = shapes.createRandomCircle();
        double circleArea = shapes.area(circle);
        double circlePerimeter = shapes.perimeter(circle);

        System.out.println("Our circle perimeter = " + circlePerimeter);
        System.out.println("Our circle area = " + circleArea);

        Shape square = shapes.createRandomSquare();
        double squareArea = shapes.area(square);
        double squarePerimeter = shapes.perimeter(square);

        Shape rectangle = shapes.createRandomRectangle();
        double rectangleArea = shapes.area(rectangle);
        double rectanglePerimeter = shapes.perimeter(rectangle);

        Shape triangle = shapes.createRandomTriangle();
        double triangleArea = shapes.area(triangle);
        double trianglePerimeter = shapes.perimeter(triangle);



    }
}

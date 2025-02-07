package students.arturs_arutjunovs.lesson_8.level_5.task_20_to_28;

class ShapesDemo {

    Shapes shapes = new Shapes();

    Shape circle = shapes.createRandomCircle();
    double circleArea = shapes.area(circle);
    double circlePerimeter = shapes.perimeter(circle);

    Shape square = shapes.createRandomSquare();
    double squareArea = shapes.area(square);
    double squarePerimeter = shapes.perimeter(square);

    Shape triangle = shapes.createRandomTriangle();
    double triangleArea = shapes.area(triangle);
    double trianglePerimeter = shapes.perimeter(triangle);

    Shape rectangle = shapes.createRandomRectangle();
    double rectangleArea = shapes.area(rectangle);
    double rectanglePerimeter = shapes.perimeter(rectangle);
}

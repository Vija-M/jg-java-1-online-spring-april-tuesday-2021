package students.ernests_subhankulovs.lesson_8.level_5.task_28;

class ShapesDemo {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Shape circle = shapes.createRandomCircle();
        Shape square = shapes.createRandomSquare();
        Shape rectangle = shapes.createRandomRectangle();
        Shape triangle = shapes.createRandomTriangle();
        double circleArea = shapes.area(circle);
        double circlePerimeter = shapes.perimeter(circle);
        double squareArea = shapes.area(square);
        double squarePerimeter = shapes.perimeter(square);
        double rectangleArea = shapes.area(rectangle);
        double rectanglePerimeter = shapes.perimeter(rectangle);
        double triangleArea = shapes.area(triangle);
        double trianglePerimeter = shapes.perimeter(triangle);
        String circleAreaCalculation = shapes.calculateArea(circle);
        String circlePerimeterCalculation = shapes.calculatePerimeter(circle);
        String squareAreaCalculation = shapes.calculateArea(square);
        String squarePerimeterCalculation = shapes.calculatePerimeter(square);
        String rectangleAreaCalculation = shapes.calculateArea(rectangle);
        String rectanglePerimeterCalculation = shapes.calculatePerimeter(rectangle);
        String triangleAreaCalculation = shapes.calculateArea(triangle);
        String trianglePerimeterCalculation = shapes.calculatePerimeter(triangle);

        System.out.println("Circle area: " + circleAreaCalculation + circleArea);
        System.out.println("Circle perimeter: " + circlePerimeterCalculation + circlePerimeter);
        System.out.println();
        System.out.println("Square area: " + squareAreaCalculation + squareArea);
        System.out.println("Square perimeter: " + squarePerimeterCalculation + squarePerimeter);
        System.out.println();
        System.out.println("Rectangle area: " + rectangleAreaCalculation + rectangleArea);
        System.out.println("Rectangle perimeter: " + rectanglePerimeterCalculation + rectanglePerimeter);
        System.out.println();
        System.out.println("Triangle area: " + triangleAreaCalculation + triangleArea);
        System.out.println("Triangle perimeter: " + trianglePerimeterCalculation + trianglePerimeter);
    }
}

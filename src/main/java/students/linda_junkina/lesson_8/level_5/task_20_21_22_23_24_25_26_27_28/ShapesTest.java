package students.linda_junkina.lesson_8.level_5.task_20_21_22_23_24_25_26_27_28;

class ShapesTest {
    public static void main(String[] args) {
        ShapesTest test = new ShapesTest();

        test.circleArea();
        test.circlePerimeter();
        test.squareArea();
        test.squarePerimeter();
        test.rectangleArea();
        test.rectanglePerimeter();
        test.triangleArea();
        test.trianglePerimeter();
        test.area();
        test.perimeter();

    }

    public void circleArea() {
        Circle circle = new Circle(5);
        double expected = 78.5;
        double calculateArea = circle.calculateArea();
        checkTestResult(calculateArea == expected, "Circle area");
    }

    public void circlePerimeter() {
        Circle circle = new Circle(5);
        double expected = 31.400000000000002;
        double calculatePerimeter = circle.calculatePerimeter();
        checkTestResult(calculatePerimeter == expected, "Circumference");
    }

    public void squareArea() {
        Square square = new Square(5);
        double expected = 25;
        double calculateArea = square.calculateArea();
        checkTestResult(calculateArea == expected, "Square area");
    }

    public void squarePerimeter() {
        Square square = new Square(5);
        double expected = 20;
        double calculatePerimeter = square.calculatePerimeter();
        checkTestResult(calculatePerimeter == expected, "Square perimeter");
    }

    public void rectangleArea() {
        Rectangle rectangle = new Rectangle(2, 6);
        double expected = 12;
        double calculateArea = rectangle.calculateArea();
        checkTestResult(calculateArea == expected, "Rectangle area");
    }

    public void rectanglePerimeter() {
        Rectangle rectangle = new Rectangle(2, 6);
        double expected = 16;
        double calculatePerimeter = rectangle.calculatePerimeter();
        checkTestResult(calculatePerimeter == expected, "Rectangle perimeter");
    }

    public void triangleArea() {
        Triangle triangle = new Triangle(6);
        double expected = 15.588457268119896;
        double calculateArea = triangle.calculateArea();
        checkTestResult(calculateArea == expected, "Triangle area");
    }

    public void trianglePerimeter() {
        Triangle triangle = new Triangle(6);
        double expected = 18;
        double calculatePerimeter = triangle.calculatePerimeter();
        checkTestResult(calculatePerimeter == expected, "Triangle perimeter");
    }

    public void area() {
        Shapes shapes = new Shapes();
        Shape[] shapeArray = new Shape[4];

        shapeArray[0] = shapes.createCircle();
        shapeArray[1] = shapes.createSquare();
        shapeArray[2] = shapes.createRectangle();
        shapeArray[3] = shapes.createTriangle();

        double expected = 131.0884572681199;
        double area = shapes.area(shapeArray);
        checkTestResult(area == expected, "Total area");
    }

    public void perimeter() {
        Shapes shapes = new Shapes();
        Shape[] shapeArray = new Shape[4];

        shapeArray[0] = shapes.createCircle();
        shapeArray[1] = shapes.createSquare();
        shapeArray[2] = shapes.createRectangle();
        shapeArray[3] = shapes.createTriangle();

        double expected = 85.400000000000002;
        double perimeter = shapes.perimeter(shapeArray);
        checkTestResult(perimeter == expected, "Total perimeter");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}

package students.vija_m.lesson_8.level_5.task_26_27_28;

class ShapesTest {
    public static void main(String[] args) {

        ShapesTest test = new ShapesTest();

        test.circleArea();
        test.circlePerimeter();
        test.squareArea();
        test.squarePerimeter();
        test.triangleArea();
        test.trianglePerimeter();
        test.rectangleArea();
        test.rectanglePerimeter();

    }

    public void circleArea() {
        Circle circle = new Circle(5);
        double expected = 78.539816339744830961566084581988;
        double calculateArea = circle.calculateArea();
        checkTestResult(calculateArea == expected, "Circle area");
    }

    public void circlePerimeter() {
        Circle circle = new Circle(5);
        double expected = 31.415926535897932384626433832795;
        double calculatePerimeter = circle.calculatePerimeter();
        checkTestResult(calculatePerimeter == expected, "Circumference");
    }

    public void squareArea() {
        Square square = new Square(3);
        double expected = 9;
        double calculateArea = square.calculateArea();
        checkTestResult(calculateArea == expected, "Square area");
    }

    public void squarePerimeter() {
        Square square = new Square(3);
        double expected = 12;
        double calculatePerimeter = square.calculatePerimeter();
        checkTestResult(calculatePerimeter == expected, "Square perimeter");
    }

    public void triangleArea() {
        Triangle triangle = new Triangle(5);
        double expected = 10.825317547305483084546539634412;
        double calculateArea = triangle.calculateArea();
        checkTestResult(calculateArea == expected, "Triangle area");
    }

    public void trianglePerimeter() {
        Triangle triangle = new Triangle(5);
        double expected = 15;
        double calculatePerimeter = triangle.calculatePerimeter();
        checkTestResult(calculatePerimeter == expected, "Triangle perimeter");
    }

    public void rectangleArea() {
        Rectangle rectangle = new Rectangle(2, 3);
        double expected = 6;
        double calculateArea = rectangle.calculateArea();
        checkTestResult(calculateArea == expected, "Rectangle area");
    }

    public void rectanglePerimeter() {
        Rectangle rectangle = new Rectangle(2, 3);
        double expected = 10;
        double calculatePerimeter = rectangle.calculatePerimeter();
        checkTestResult(calculatePerimeter == expected, "Rectangle perimeter");
    }

    public void createShape() {
    }

    public void area() {
        Shapes shapes = new Shapes();
        Shape[] shapeArray = new Shape[4];

        shapeArray[0] = shapes.createRandomCircle();
        shapeArray[1] = shapes.createRandomSquare();
        shapeArray[2] = shapes.createRandomTriangle();
        shapeArray[3] = shapes.createRandomRectangle();

        double expected = 104.3651338870503140461126242164;
        double area = shapes.area(shapeArray);
        checkTestResult(area == expected, "Total area");
    }

    public void perimeter() {
        Shapes shapes = new Shapes();
        Shape[] shapeArray = new Shape[4];

        shapeArray[0] = shapes.createRandomCircle();
        shapeArray[1] = shapes.createRandomSquare();
        shapeArray[2] = shapes.createRandomTriangle();
        shapeArray[3] = shapes.createRandomRectangle();

        double expected = 68.415926535897932384626433832795;
        double perimeter = shapes.perimeter(shapeArray);
        checkTestResult(perimeter == expected, "Total perimeter");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println("[ OK ]: " + testName);
        } else {
            System.out.println("[ FAILED ]: " + testName);
        }
    }
}


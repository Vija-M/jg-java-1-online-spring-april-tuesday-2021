package students.linda_junkina.lesson_8.level_4.task_15_16_17_18_19;

class ShapeTest {
    public static void main(String[] args) {
        ShapeTest test = new ShapeTest();
        test.circleArea();
        test.circlePerimeter();
        test.squareArea();
        test.squarePerimeter();
        test.rectangleArea();
        test.rectanglePerimeter();
        test.triangleArea();
        test.trianglePerimeter();
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
        Triangle triangle = new Triangle(9);
        double expected = 35.07402885326976;
        double calculateArea = triangle.calculateArea();
        checkTestResult(calculateArea == expected, "Triangle area");
    }

    public void trianglePerimeter() {
        Triangle triangle = new Triangle(6);
        double expected = 18;
        double calculatePerimeter = triangle.calculatePerimeter();
        checkTestResult(calculatePerimeter == expected, "Triangle perimeter");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}

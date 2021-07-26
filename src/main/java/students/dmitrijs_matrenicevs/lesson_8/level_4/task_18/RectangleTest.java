package students.dmitrijs_matrenicevs.lesson_8.level_4.task_18;

class RectangleTest {

    Rectangle rectangle = new Rectangle(4, 6);

    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.rectangleAreaTest();
        rectangleTest.rectanglePerimeterTest();

    }

    public void rectangleAreaTest() {
        testRectangleResult(24, rectangle.calculateArea(), "Rectangle AreaTest");
    }

    public void rectanglePerimeterTest() {
        testRectangleResult(20, rectangle.calculatePerimeter(), "Rectangle PerimeterTest");
    }

    public void testRectangleResult(double expectedResult, double realResult, String name) {
        if (expectedResult == realResult) {
            System.out.println(name + " = OK");
        } else {
            System.out.println(name + " = FAIL");
        }
    }
}

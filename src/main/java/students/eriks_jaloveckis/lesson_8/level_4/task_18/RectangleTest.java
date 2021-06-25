package students.eriks_jaloveckis.lesson_8.level_4.task_18;

public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.rectangleArea();
        rectangleTest.rectanglePerimeter();

    }

    public void assertTest (double expected, double realResult, String text) {
        if (expected == realResult) {
            System.out.println(text + " - TEST OK!");
        }
        else {
            System.out.println(text + " - FAIL!");
        }
    }

    public void rectangleArea() {
        Rectangle rectangle = new Rectangle(2,3);
        assertTest(6, rectangle.calculateArea(), "Rectangle Area");
    }

    public void rectanglePerimeter() {
        Rectangle rectangle = new Rectangle(2,3);
        assertTest(10, rectangle.calculatePerimeter(), "Rectangle Perimeter");
    }
}

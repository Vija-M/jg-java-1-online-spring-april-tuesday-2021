package students.arturs_arutjunovs.lesson_8.level_4.task_18;

class RectangleTest {

    Rectangle rectangle = new Rectangle("Rectangle", 2.5, 3.0);

    public static void main(String[] args) {

        RectangleTest test = new RectangleTest();
        test.areaTest();
        test.perimeterTest();
    }

    public void areaTest() {
        assertRectangleTest(rectangle.area(), 2.5 * 3.0, "Rectangle area test");
    }

    public void perimeterTest() {
        assertRectangleTest(rectangle.perimeter(), (2.5 + 3.0) * 2, "Rectangle perimeter test");

    }

    public void assertRectangleTest(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("[ OK ]: " + testName);
        } else {
            System.out.println("[ FAILED ]: " + testName);
        }
    }
}

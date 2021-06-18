package students.arturs_arutjunovs.lesson_8.level_4.task_16;

class CircleTest {
    Circle circle = new Circle(0);

    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.areaTest();
        test.perimeterTest();
    }

    public void areaTest() {
        assertCircleTest(circle.area(), (2.5 * 2.5) * 3.14, "Circle area test");

    }

    public void perimeterTest() {
        assertCircleTest(circle.perimeter(), 2.5 * (2 * 3.14), "Circle perimeter test");

    }

    public void assertCircleTest(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("[ OK ]: " + testName);
        } else {
            System.out.println("[ FAILED ]: " + testName);
        }
    }
}
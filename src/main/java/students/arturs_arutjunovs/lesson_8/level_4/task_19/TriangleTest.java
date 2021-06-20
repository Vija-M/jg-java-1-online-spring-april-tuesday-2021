package students.arturs_arutjunovs.lesson_8.level_4.task_19;

class TriangleTest {

    Triangle triangle = new Triangle("Triangle", 2.5);

    public static void main(String[] args) {

        TriangleTest test = new TriangleTest();
        test.areaTest();
        test.perimeterTest();
    }

    public void areaTest() {
        assertTriangleTest(triangle.area(), (Math.sqrt(3) / 4) * 2.5 * 2.5, "Triangle area test");
    }

    public void perimeterTest() {
        assertTriangleTest(triangle.perimeter(), 2.5 + 2.5 + 2.5, "Triangle perimeter test");

    }

    public void assertTriangleTest(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("[ OK ]: " + testName);
        } else {
            System.out.println("[ FAILED ]: " + testName);
        }
    }
}

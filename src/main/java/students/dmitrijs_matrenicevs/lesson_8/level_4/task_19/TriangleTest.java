package students.dmitrijs_matrenicevs.lesson_8.level_4.task_19;

class TriangleTest {

    Triangle triangle = new Triangle(4);

    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();

        triangleTest.triangleAreaTest();
        triangleTest.trianglePerimeterTest();
    }

    public void triangleAreaTest() {
        testTriangleResult(3, triangle.calculateArea(), "Triangle AreaTest");
    }

    public void trianglePerimeterTest() {
        testTriangleResult(12, triangle.calculatePerimeter(), "Triangle PerimeterTest");
    }

    public void testTriangleResult(double expectedResult, double realResult, String name) {
        if (expectedResult == realResult) {
            System.out.println(name + " = OK");
        } else {
            System.out.println(name + " = FAIL");
        }
    }
}

package students.eriks_jaloveckis.lesson_8.level_4.task_19;

public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.triangleAreaPerimeter();

    }

    public void assertTest(double expected, double realResult, String text) {
        if (expected == realResult) {
            System.out.println(text + " - TEST OK!");
        } else {
            System.out.println(text + " - FAIL!");
        }
    }

    public void triangleAreaPerimeter() {
        Triangle triangle = new Triangle(2);
        assertTest(1.7320508075688772, triangle.calculateArea(), "Triangle Area");
        assertTest(6.0, triangle.calculatePerimeter(), "Triangle Perimeter");
    }
}

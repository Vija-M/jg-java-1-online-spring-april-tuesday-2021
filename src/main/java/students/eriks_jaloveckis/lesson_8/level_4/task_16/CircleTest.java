package students.eriks_jaloveckis.lesson_8.level_4.task_16;

public class CircleTest {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.areaCircle();
        circleTest.perimeterCircle();

    }

    public void assertTest(double expected, double realResult, String text) {
        if (expected == realResult) {
            System.out.println(text + " - TEST OK!");
        } else {
            System.out.println(text + " - FAIL!");
        }
    }

    public void areaCircle() {
        Circle circle = new Circle(3);
        assertTest(28.274333882308138, circle.calculateArea(), "Circle Area");
    }

    public void perimeterCircle() {
        Circle circle = new Circle(3);
        assertTest(18.84955592153876, circle.calculatePerimeter(), "Circle Perimeter");
    }
}

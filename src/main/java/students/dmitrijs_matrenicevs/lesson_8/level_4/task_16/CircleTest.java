package students.dmitrijs_matrenicevs.lesson_8.level_4.task_16;

class CircleTest {

    Circle circle = new Circle(4);

    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.areaTest();
        circleTest.perimeterTest();
    }

    public void areaTest() {
        testCircleResult(50.24, circle.calculateArea(), "AreaTest");
    }

    public void perimeterTest() {
        testCircleResult(25.12, circle.calculatePerimeter(), "PerimeterTest");
    }

    public void testCircleResult(double expectedResult, double realResult, String name) {
        if (expectedResult == realResult) {
            System.out.println(name + " = OK");
        } else {
            System.out.println(name + " = FAIL");
        }
    }
}

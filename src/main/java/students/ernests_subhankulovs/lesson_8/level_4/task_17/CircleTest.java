package students.ernests_subhankulovs.lesson_8.level_4.task_17;

class CircleTest {

    Circle circle = new Circle(5);

    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.testArea();
        test.testPerimeter();
    }

    public void testArea() {
        assertTestResult(78.539816339744830961566084581988, circle.area(), "Area test");
    }

    public void testPerimeter() {
        assertTestResult(31.415926535897932384626433832795, circle.perimeter(), "Perimeter test");
    }

    private void assertTestResult(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}

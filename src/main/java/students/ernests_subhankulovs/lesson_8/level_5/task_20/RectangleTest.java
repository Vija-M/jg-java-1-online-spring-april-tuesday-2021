package students.ernests_subhankulovs.lesson_8.level_5.task_20;

class RectangleTest {
    Rectangle rectangle = new Rectangle(2, 3);

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.testArea();
        test.testPerimeter();
    }

    public void testArea() {
        assertTestResult(6, rectangle.area(), "Area test");
    }

    public void testPerimeter() {
        assertTestResult(10, rectangle.perimeter(), "Perimeter test");
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

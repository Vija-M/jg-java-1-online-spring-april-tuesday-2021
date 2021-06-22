package students.ernests_subhankulovs.lesson_8.level_4.task_19;

class TriangleTest {

    Triangle triangle = new Triangle(5);

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.testArea();
        test.testPerimeter();
    }

    public void testArea() {
        assertTestResult(10.825317547305483084546539634412, triangle.area(), "Area test");
    }

    public void testPerimeter() {
        assertTestResult(15, triangle.perimeter(), "Perimeter test");
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

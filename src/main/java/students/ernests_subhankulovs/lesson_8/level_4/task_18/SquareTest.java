package students.ernests_subhankulovs.lesson_8.level_4.task_18;

class SquareTest {

    Square square = new Square(5);

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.testArea();
        test.testPerimeter();
    }

    public void testArea() {
        assertTestResult(25, square.area(), "Area test");
    }

    public void testPerimeter() {
        assertTestResult(20, square.perimeter(), "Perimeter test");
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

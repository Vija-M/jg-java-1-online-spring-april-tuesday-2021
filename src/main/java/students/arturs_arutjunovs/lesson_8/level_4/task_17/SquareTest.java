package students.arturs_arutjunovs.lesson_8.level_4.task_17;

class SquareTest {
    Square square = new Square("Square", 2.5);

    public static void main(String[] args) {

        SquareTest test = new SquareTest();
        test.areaTest();
        test.perimeterTest();
    }

    public void areaTest() {
        assertSquareTest(square.area(), 2.5 * 2.5, "Square area test");

    }

    public void perimeterTest() {
        assertSquareTest(square.perimeter(), 2.5 * 4, "Square perimeter test");

    }

    public void assertSquareTest(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("[ OK ]: " + testName);
        } else {
            System.out.println("[ FAILED ]: " + testName);
        }
    }
}

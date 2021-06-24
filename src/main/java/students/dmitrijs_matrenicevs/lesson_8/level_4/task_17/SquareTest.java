package students.dmitrijs_matrenicevs.lesson_8.level_4.task_17;

class SquareTest {

    Square square = new Square(3);

    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.partAreaTest();
        squareTest.partPerimeterTest();

    }

    public void partAreaTest() {
        testSquareResult(9, square.calculateArea(), "Part areaTest");
    }

    public void partPerimeterTest() {
        testSquareResult(12, square.calculatePerimeter(), "Part perimeterTest");
    }

    public void testSquareResult(double expectedResult, double realResult, String name) {
        if (expectedResult == realResult) {
            System.out.println(name + " = OK");
        } else {
            System.out.println(name + " = FAIL");
        }
    }

}

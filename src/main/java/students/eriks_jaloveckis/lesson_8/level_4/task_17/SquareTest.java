package students.eriks_jaloveckis.lesson_8.level_4.task_17;

class SquareTest {
    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.squareArea();
        squareTest.squarePerimeter();

    }

    public void assertTest(double expected, double realResult, String text) {
        if (expected == realResult) {
            System.out.println(text + " - TEST OK!");
        } else {
            System.out.println(text + " - FAIL!");
        }
    }

    public void squareArea() {
        Square square = new Square(3);
        assertTest(9.0, square.calculateArea(), "Square Area");
    }

    public void squarePerimeter() {
        Square square = new Square(3);
        assertTest(12.0, square.calculatePerimeter(), "Square Perimeter");
    }

}

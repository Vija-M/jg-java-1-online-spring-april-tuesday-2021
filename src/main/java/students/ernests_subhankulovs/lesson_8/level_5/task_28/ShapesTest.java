package students.ernests_subhankulovs.lesson_8.level_5.task_28;

class ShapesTest {

    public static void main(String[] args) {
        ShapesTest test = new ShapesTest();
        test.perimeterTest();
        test.areaTest();
    }

    public void perimeterTest() {
        Shapes shapes = new Shapes();
        Shape[] shapeArray = new Shape[4];

        shapeArray[0] = shapes.createRandomCircle();
        shapeArray[1] = shapes.createRandomSquare();
        shapeArray[2] = shapes.createRandomRectangle();
        shapeArray[3] = shapes.createRandomTriangle();

        double sumOfPerimeters = 0;

        for (int i = 0; i <= 3; i++) {
            sumOfPerimeters += shapeArray[i].perimeter();
        }

        assertTestResult(sumOfPerimeters, shapes.perimeter(shapeArray), "Perimeter test");
    }

    public void areaTest() {
        Shapes shapes = new Shapes();
        Shape[] shapeArray = new Shape[4];

        shapeArray[0] = shapes.createRandomCircle();
        shapeArray[1] = shapes.createRandomSquare();
        shapeArray[2] = shapes.createRandomRectangle();
        shapeArray[3] = shapes.createRandomTriangle();

        double sumOfAreas = 0;

        for (int i = 0; i <= 3; i++) {
            sumOfAreas += shapeArray[i].area();
        }

        assertTestResult(sumOfAreas, shapes.area(shapeArray), "Area test");
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

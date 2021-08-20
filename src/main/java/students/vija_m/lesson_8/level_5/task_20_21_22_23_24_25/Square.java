package students.vija_m.lesson_8.level_5.task_20_21_22_23_24_25;

class Square extends Shape {
    private double sideLength;

    Square(double sideLength) {
        super("Square");
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return 4 * sideLength;
    }
}

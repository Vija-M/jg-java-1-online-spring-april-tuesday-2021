package students.vija_m.lesson_8.level_5.task_26_27_28;

class Triangle extends Shape {
    private double sideLength;

    public Triangle(double sideLength) {
        super("Triangle");
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength * Math.sqrt(3) / 4;
    }

    @Override
    double calculatePerimeter() {
        return 3 * sideLength;
    }
}

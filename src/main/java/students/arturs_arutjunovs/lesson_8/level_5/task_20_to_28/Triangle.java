package students.arturs_arutjunovs.lesson_8.level_5.task_20_to_28;

class Triangle extends Shape {

    private double sideLength;

    public Triangle(double sideLength) {
        super("Triangle");
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 3;
    }
}

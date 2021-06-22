package students.arturs_arutjunovs.lesson_8.level_4.task_17;

class Square extends Shape {

    private double sideLength;

    public Square(double sideLength) {
        super("Square");
        this.sideLength = sideLength;
    }

    @Override
    double area() {
        return sideLength * sideLength;
    }

    @Override
    double perimeter() {
        return sideLength * 4;
    }
}

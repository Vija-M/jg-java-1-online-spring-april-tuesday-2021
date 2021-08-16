package students.arturs_arutjunovs.lesson_8.level_5.task_20_to_28;

class Square extends Shape {

    private int sideLength;

    public Square(int sideLength) {
        super("Square");
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 4;
    }
}

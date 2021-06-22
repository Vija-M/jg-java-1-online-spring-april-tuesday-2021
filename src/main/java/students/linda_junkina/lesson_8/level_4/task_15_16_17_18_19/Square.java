package students.linda_junkina.lesson_8.level_4.task_15_16_17_18_19;

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

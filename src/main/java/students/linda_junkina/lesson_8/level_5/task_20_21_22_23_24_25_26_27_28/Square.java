package students.linda_junkina.lesson_8.level_5.task_20_21_22_23_24_25_26_27_28;

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

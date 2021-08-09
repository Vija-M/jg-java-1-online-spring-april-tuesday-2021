package students.vija_m.lesson_8.level_4.task_18;

class Rectangle extends Shape {

    private double sideALength;
    private double sideBLength;

    Rectangle(double sideALength, double sideBLength) {
        super("Rectangle");
        this.sideALength = sideALength;
        this.sideBLength = sideBLength;
    }

    @Override
    double calculateArea() {
        return 0;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }
}

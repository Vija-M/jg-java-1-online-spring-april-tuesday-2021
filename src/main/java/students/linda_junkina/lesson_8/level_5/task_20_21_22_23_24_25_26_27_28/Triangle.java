package students.linda_junkina.lesson_8.level_5.task_20_21_22_23_24_25_26_27_28;

import static java.lang.Math.sqrt;

class Triangle extends Shape {

    private int side;

    public Triangle(int side) {
        super("Triangle");
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (sqrt(3) / 4) * side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 3;
    }
}

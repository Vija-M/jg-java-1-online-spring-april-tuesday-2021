package students.linda_junkina.lesson_8.level_4.task_15_16_17_18_19;

import static java.lang.Math.*;

class Triangle extends Shape {

    double high;
    int side;


    public Triangle(int high, int side) {
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

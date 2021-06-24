package students.dmitrijs_matrenicevs.lesson_8.level_4.task_19;

class Triangle extends Shape {

    private final double equilateral;

    public Triangle(double equilateral) {
        super("Triangle");
        this.equilateral = equilateral;
    }

    @Override
    double calculateArea() {
        return (3.0 / 4.0) * equilateral;
    }

    @Override
    double calculatePerimeter() {
        return equilateral * 3;
    }
}

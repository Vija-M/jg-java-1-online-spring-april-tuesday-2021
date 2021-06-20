package students.arturs_arutjunovs.lesson_8.level_4.task_19;

class Triangle extends Shape {

    private double sideLength;

    public Triangle(String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

    @Override
    double area() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }

    @Override
    double perimeter() {
        return sideLength * 3;


    }
}

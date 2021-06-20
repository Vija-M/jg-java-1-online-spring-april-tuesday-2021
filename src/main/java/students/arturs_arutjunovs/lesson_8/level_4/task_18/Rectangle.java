package students.arturs_arutjunovs.lesson_8.level_4.task_18;

class Rectangle extends Shape {

    private double width;
    private double length;


    public Rectangle(String title, double width, double length) {
        super(title);
        this.width = width;
        this.length = length;
    }

    @Override
    double area() {
        return width * length;
    }

    @Override
    double perimeter() {
        return (width + length) * 2;
    }
}

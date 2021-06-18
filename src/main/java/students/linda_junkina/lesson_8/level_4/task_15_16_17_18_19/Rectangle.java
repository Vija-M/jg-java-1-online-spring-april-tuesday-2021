package students.linda_junkina.lesson_8.level_4.task_15_16_17_18_19;

class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(String title, int length, int width) {
        super(title);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length * width);
    }
}

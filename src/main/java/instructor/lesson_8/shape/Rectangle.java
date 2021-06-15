package instructor.lesson_8.shape;

class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(String fillColor, String outlineColor, int width, int height) {
        super("Rectangle", fillColor, outlineColor);
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

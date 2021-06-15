package instructor.lesson_8.shape;

class Square extends Shape {

    private int sideLength;

    public Square(String fillColor, String outlineColor, int sideLength) {
        super("Square", fillColor, outlineColor);
        this.sideLength = sideLength;
    }

    @Override
    double area() {
        return sideLength * sideLength;
    }
}

package instructor.lesson_8.shape;

abstract class Shape {

    private String name;

    private String fillColor;
    private String outlineColor;

    Shape(String name, String fillColor, String outlineColor) {
        this.name = name;
        this.fillColor = fillColor;
        this.outlineColor = outlineColor;
    }

    abstract double area();

    public String name() {
        return name;
    }
}

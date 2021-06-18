package students.linda_junkina.lesson_8.level_4.task_15_16_17_18_19;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

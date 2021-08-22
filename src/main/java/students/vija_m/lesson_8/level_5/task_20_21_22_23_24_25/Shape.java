package students.vija_m.lesson_8.level_5.task_20_21_22_23_24_25;


abstract class Shape {
    private String title;

    public Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

package students.vija_m.lesson_8.level_4.task_18;


abstract class Shape {
    private String title;

    public Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

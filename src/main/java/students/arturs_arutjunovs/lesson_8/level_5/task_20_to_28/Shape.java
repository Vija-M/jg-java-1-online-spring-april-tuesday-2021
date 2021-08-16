package students.arturs_arutjunovs.lesson_8.level_5.task_20_to_28;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}

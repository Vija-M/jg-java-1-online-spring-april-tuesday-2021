package students.arturs_arutjunovs.lesson_8.level_4.task_19;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double area();

    abstract double perimeter();

}

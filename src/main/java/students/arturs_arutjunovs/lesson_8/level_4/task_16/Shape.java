package students.arturs_arutjunovs.lesson_8.level_4.task_16;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    public Shape() {

    }

    abstract double area();

    abstract double perimeter();
}

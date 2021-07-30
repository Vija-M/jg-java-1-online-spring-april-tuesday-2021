package students.jevgenij_leshkevich.lesson_8.level_2.task_7;

class Horse extends Animal {

    float height;
    String colour;

    public Horse(String name, int age, float height, String colour) {
        super(name, age);
        this.height = height;
        this.colour = colour;
    }
}

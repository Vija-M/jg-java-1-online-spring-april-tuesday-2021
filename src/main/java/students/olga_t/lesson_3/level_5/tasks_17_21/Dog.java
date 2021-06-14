package students.olga_t.lesson_3.level_5.tasks_17_21;

class Dog {
    String name;
    int age;
    String color;



    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println(this.name + ", " + this.age + " years" + ", " + this.color);
        System.out.println(this.name + ", " + this.age + " years" + ", " + this.color);
        System.out.println(this.name + ", " + this.age + " years" + ", " + this.color);
    }

    void happyBirthday() {
        this.age = this.age + 1;
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }
}

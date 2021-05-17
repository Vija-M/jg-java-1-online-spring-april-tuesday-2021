package students.ernests_subhankulovs.lesson_3.level_5.task_20;

class Dog {
    String name;
    int age;
    String color;

    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println("Dog's name: " + this.name);
        System.out.println("Dog's age: " + this.age);
        System.out.println("Dog's color: " + this.color);
    }

    void happyBirthday() {
        this.age++;
    }
}

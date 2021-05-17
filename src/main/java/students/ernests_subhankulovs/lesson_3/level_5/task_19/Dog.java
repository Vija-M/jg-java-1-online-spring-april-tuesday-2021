package students.ernests_subhankulovs.lesson_3.level_5.task_19;

class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void voice() {
        System.out.println("Dog's name: " + this.name);
        System.out.println("Dog's age: " + this.age);
    }

    void happyBirthday() {
        this.age++;
    }
}

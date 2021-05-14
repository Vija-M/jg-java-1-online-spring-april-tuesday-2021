package students.arturs_arutjunovs.lesson_3.level_5.task_17;

class Dog {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    void voice() {
        System.out.println(this.name);
    }
}

class DogDemo {
    public static void main(String[] args) {

        Dog dog = new Dog("Малыш");
        dog.voice();
        dog.voice();
        dog.voice();
    }
}
package students.arturs_arutjunovs.lesson_3.level_5.task_19;

class Dog {

    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void voice() {
        System.out.println("Кличка собаки - " + this.name);
        System.out.println("Её возраст - " + this.age + " года");
    }

    void happyBirthday() {
        this.age = age + 1;
        System.out.println("Прошел год и теперь ей " + this.age);
    }
}

class DogDemo {
    public static void main(String[] args) {

        Dog dog = new Dog("Малыш", 2);
        dog.voice();
        dog.happyBirthday();
    }
}

package students.arturs_arutjunovs.lesson_3.level_5.task_21;

class Dog {
    String color;
    String name;
    int age;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void happyBirthday() {
        this.age = age + 1;
        System.out.println("Прошел год и теперь ему " + this.age);
    }

    void changeColor(String newColor) {
        color = newColor;
        System.out.println("Цвет поменялся на " + newColor);
    }

    void voice() {
        System.out.println("Кличка собаки - " + this.name);
        System.out.println("Его возраст - " + this.age + " года");
        System.out.println("Щенок имеет " + this.color + " цвет");

    }
}

class DogDemo {
    public static void main(String[] args) {

        Dog dog = new Dog("Малыш", 2, "черный");
        dog.voice();
        dog.happyBirthday();
        dog.changeColor("рыжий");
        dog.voice();
    }
}
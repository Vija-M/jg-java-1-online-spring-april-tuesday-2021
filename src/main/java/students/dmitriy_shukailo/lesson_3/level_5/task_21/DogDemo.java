package students.dmitriy_shukailo.lesson_3.level_5.task_21;

class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Bobik", 3, "Orange");
        dog.voice();
        dog.changeColor("Black");
        dog.voice();
    }
}
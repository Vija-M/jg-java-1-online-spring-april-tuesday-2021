package students.vija_m.lesson_3.level_5.task_21;

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
        System.out.println("Dog's name is " + this.name +", dog's age - " + this.age +", dog's color - " + this.color +".");
    }
    void changeColor(String newColor) {
        color = newColor;
        System.out.println("Now " + this.name +" has a new color!!!");
    }
}
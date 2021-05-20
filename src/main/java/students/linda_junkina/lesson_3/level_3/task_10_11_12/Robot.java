package students.linda_junkina.lesson_3.level_3.task_10_11_12;

class Robot {

    public Robot() {
    }

    public void sayHello() {
        System.out.println("Hi!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);

    }



    String name;

    public Robot(String name) {
        this.name = name;
    }
}

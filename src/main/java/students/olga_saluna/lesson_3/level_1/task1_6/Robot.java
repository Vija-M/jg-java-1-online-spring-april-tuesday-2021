package students.olga_saluna.lesson_3.level_1.task1_6;

class Robot {

    public void sayHello() {
        System.out.println("Hello!");
    }

    public Robot() {

    }

    String name;

    Robot(String robotName) {
        this.name = robotName;
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}

